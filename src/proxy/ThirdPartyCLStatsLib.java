package proxy;

import java.util.List;

public interface ThirdPartyCLStatsLib {
    List<String> getTop5UefaRanking();
    String getMostPPDATeam();
    String getLeastXGATeam();
    String getMostXGTeam();
    String getSensitiveSecuredInfo();
}
