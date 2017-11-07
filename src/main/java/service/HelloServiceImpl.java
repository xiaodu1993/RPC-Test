package service;

/**
 * @author maobing.dmb
 * @date 2017/11/07
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHi(String name) {
        return "Hi! " + name;
    }

}
