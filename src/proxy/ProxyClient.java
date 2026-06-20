package proxy;

public class ProxyClient {
    public void renderCLStatsInfo() {
        CustomCLStatsLibProxy proxy = new CustomCLStatsLibProxy();

        System.out.println("=======NOT CACHED=======");
        renderStats(proxy);

        System.out.println("=======CACHED=======");
        renderStats(proxy);

        System.out.println("=======SECURED CALL=======");

        proxy.authenticate("admin");

        System.out.println(proxy.getSensitiveSecuredInfo());

        proxy.authenticate("user");

        if (proxy.getSensitiveSecuredInfo() == null) {
            System.out.println("Access is not allowed for secured info.");
        }
    }

    private void renderStats(CustomCLStatsLibProxy proxy) {
        System.out.println(proxy.getTop5UefaRanking());
        System.out.println("=========================");
        System.out.println(proxy.getMostPPDATeam());
        System.out.println("=========================");
        System.out.println(proxy.getLeastXGATeam());
        System.out.println("=========================");
        System.out.println(proxy.getMostXGTeam());
    }
}
