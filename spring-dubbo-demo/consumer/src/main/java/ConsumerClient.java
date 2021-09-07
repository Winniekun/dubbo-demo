import com.wkk.api.HelloApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author weikunkun
 * @since 2021/9/7
 */
public class ConsumerClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        HelloApi demoService = (HelloApi) context.getBean("demoService");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(demoService.sendMsg(s));
        }
    }
}
