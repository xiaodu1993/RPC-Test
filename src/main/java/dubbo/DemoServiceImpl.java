package dubbo;

/**
 * @author maobing.dmb
 * @date 2017/11/07
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
