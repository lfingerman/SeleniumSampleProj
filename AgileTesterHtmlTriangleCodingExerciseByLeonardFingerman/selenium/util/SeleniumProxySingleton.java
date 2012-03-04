package util;

import java.net.Socket;

import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

public abstract class SeleniumProxySingleton {
    protected static final String SELENIUM_SERVER_HOST = "localhost";
    protected static final int SELENIUM_SERVER_PORT = 4444;
   // protected static  SeleniumServer jettyProxy;
    protected static  SeleniumProxySingleton jettyProxy;
    protected static boolean jettyProxyWasStartedByATest = false;
    private Server server = new Server();

    public static void makeSureWeHaveAJettyProxyRunning() throws Exception {
        Socket socket = null;

        try {
            socket = new Socket(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT);

        } catch(Exception e) {
            System.out.println("Nothing is listening on port " + SELENIUM_SERVER_PORT);
            System.out.println("Launching SeleniumServer on port " + SELENIUM_SERVER_PORT);
            startJettyProxy();
            jettyProxyWasStartedByATest = true;

        }

        finally {
            if (socket != null) {
                socket.close();
            }
        }
    }




    protected static void startJettyProxy() throws Exception {
        RemoteControlConfiguration config = new RemoteControlConfiguration();
        config.setPort(SELENIUM_SERVER_PORT);
        jettyProxy = new SeleniumServer(config);
        jettyProxy.start();
    }



    public static void stopJettyProxy() {
        if(jettyProxyWasStartedByATest) {
           // jettyProxy.stop();
        }
    }

}

