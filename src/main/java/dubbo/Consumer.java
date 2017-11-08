package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author maobing.dmb
 * @date 2017/11/07
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"classpath:dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }

}
