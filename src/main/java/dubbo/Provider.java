package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author maobing.dmb
 * @date 2017/11/07
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"classpath:dubbo-demo-provider.xml"});
        context.start();
        System.in.read();
    }

}
