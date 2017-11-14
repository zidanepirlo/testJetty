package com.yuan.jetty.test;

import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class jettyMain {

    final static Logger logger = LoggerFactory.getLogger(jettyMain.class);


    public static void main(String[] args) throws Exception {
//        Server server = new Server(8080);
//
//        WebAppContext webapp = new WebAppContext();
//        webapp.setContextPath("/p2p");
//        webapp.setWar("/Users/yuan/intellij_workspace/p2p/web/target/p2p.war");
//        server.setHandler(webapp);
//
//        try {
//            server.start();
//        } catch (Exception e) {
//            logger.error(e.getMessage(),e);
//        }
//
        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        context.setContextPath("/p2p");
        context.setWar("/Users/yuan/intellij_workspace/p2p/web/target/p2p.war");
        server.setHandler(context);

        server.start();
        server.join();
    }
}
