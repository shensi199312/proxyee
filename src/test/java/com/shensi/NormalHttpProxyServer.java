package com.shensi;

import com.shensi.server.HttpProxyServer;
import com.shensi.server.HttpProxyServerConfig;

public class NormalHttpProxyServer {

    public static void main(String[] args) throws Exception {

        HttpProxyServerConfig config = new HttpProxyServerConfig();
        config.setBossGroupThreads(1);
        config.setWorkerGroupThreads(1);
        config.setProxyGroupThreads(1);
        new HttpProxyServer()
                .serverConfig(config)
                .start(9999);
    }
}
