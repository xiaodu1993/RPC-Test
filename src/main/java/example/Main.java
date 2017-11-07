package example;

import java.io.IOException;
import java.net.InetSocketAddress;

import example.client.RPCClient;
import example.server.Server;
import example.server.ServiceCenter;
import example.service.HelloService;
import example.service.HelloServiceImpl;

/**
 * @author maobing.dmb
 * @date 2017/11/07
 */
public class Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class,
            new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }

}
