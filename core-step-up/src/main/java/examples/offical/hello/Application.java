package examples.offical.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by dell on 2015/8/11.
 */
@Configuration
@ComponentScan
public class Application {
    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}

