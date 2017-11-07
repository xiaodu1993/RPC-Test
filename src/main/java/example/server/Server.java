package example.server;

import java.io.IOException;

/**
 * @author maobing.dmb
 * @date 2017/11/07
 */
public interface Server {

    public void start() throws IOException;

    public void stop();

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();

}
