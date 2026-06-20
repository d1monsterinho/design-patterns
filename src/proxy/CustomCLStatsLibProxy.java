package proxy;

import java.util.List;

public class CustomCLStatsLibProxy implements ThirdPartyCLStatsLib {
    private static final String ADMIN_ROLE = "admin";
    private static final String USER_ROLE = "user";

    private final ThirdPartyCLStatsLibImpl thirdParty;

    private List<String> top5UefaRankingCache;
    private String mostPPDATeamCache;
    private String leastXGATeamCache;
    private String mostXGTeamCache;

    private String requestRole;

    public CustomCLStatsLibProxy() {
        thirdParty = new ThirdPartyCLStatsLibImpl();
    }

    @Override
    public List<String> getTop5UefaRanking() {
        System.out.println("Retrieving top 5 UEFA ranking teams list...");

        if (top5UefaRankingCache == null) {
            top5UefaRankingCache = thirdParty.getTop5UefaRanking();
            System.out.println("Third party request made. Initialized top 5 UEFA ranking proxy cache.");
        } else {
            System.out.println("Top 5 UEFA ranking proxy cache was used, no call to third party.");
        }

        return top5UefaRankingCache;
    }

    @Override
    public String getMostPPDATeam() {
        System.out.println("Retrieving most PPDA team...");

        if (mostPPDATeamCache == null) {
            mostPPDATeamCache = thirdParty.getMostPPDATeam();
            System.out.println("Third party request made. Initialized most PPDA team proxy cache.");
        } else {
            System.out.println("Most PPDA team proxy cache was used, no call to third party.");
        }

        return mostPPDATeamCache;
    }

    @Override
    public String getLeastXGATeam() {
        System.out.println("Retrieving least XGA team...");

        if (leastXGATeamCache == null) {
            leastXGATeamCache = thirdParty.getLeastXGATeam();
            System.out.println("Third party request made. Initialized least XGA team proxy cache.");
        } else {
            System.out.println("Least XGA team proxy cache was used, no call to third party.");
        }

        return leastXGATeamCache;
    }

    @Override
    public String getMostXGTeam() {
        System.out.println("Retrieving most XG team...");

        if (mostXGTeamCache == null) {
            mostXGTeamCache = thirdParty.getMostXGTeam();
            System.out.println("Third party request made. Initialized most XG team proxy cache.");
        } else {
            System.out.println("Most XG team proxy cache was used, no call to third party.");
        }

        return mostXGTeamCache;
    }

    @Override
    public String getSensitiveSecuredInfo() {
        System.out.println("Trying to access sensitive information...");
        System.out.println("Checking user role authorities...");

        if (requestRole.equals(ADMIN_ROLE)) {
            System.out.printf("Request role: %s. Access allowed.%n", ADMIN_ROLE);
            System.out.println("Retrieving sensitive information from third party...");
            return thirdParty.getSensitiveSecuredInfo();
        } else {
            System.out.printf("Request role: %s. Access denied. Only %s role is allowed to perform this operation.%n",
                    USER_ROLE, ADMIN_ROLE);
            return null;
        }
    }

    public void authenticate(String role) {
        requestRole = role;

        System.out.printf("Successfully authenticated with %s role!%n", role);
    }
}