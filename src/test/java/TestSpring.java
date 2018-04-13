import com.hjc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void Test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:\\spring-config.xml"});
        UserService userService = (UserService) ac.getBean("userService");
        userService.test();
    }
}
