package proxy;

import java.util.List;

public class ThirdPartyCLStatsLibImpl implements ThirdPartyCLStatsLib {
    private final List<String> top5UefaRanking;
    private final String mostPPDATeam;
    private final String leastXGATeam;
    private final String mostXGTeam;
    private final String sensitiveSecuredInfo;

    public ThirdPartyCLStatsLibImpl() {
        top5UefaRanking = List.of("PSG", "Bayern", "Real Madrid", "Arsenal", "Man City");
        mostPPDATeam = "PSG";
        leastXGATeam = "Arsenal";
        mostXGTeam = "Bayern";
        sensitiveSecuredInfo = "Some abstract sensitive info";
    }

    @Override
    public List<String> getTop5UefaRanking() {
        return top5UefaRanking;
    }

    @Override
    public String getMostPPDATeam() {
        return mostPPDATeam;
    }

    @Override
    public String getLeastXGATeam() {
        return leastXGATeam;
    }

    @Override
    public String getMostXGTeam() {
        return mostXGTeam;
    }

    @Override
    public String getSensitiveSecuredInfo() {
        return sensitiveSecuredInfo;
    }
}
