import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext加载Spring配置类初始化Spring容器
//        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1=(BookDao) ctx.getBean("bookDao");
        BookDao bookDao2=(BookDao) ctx.getBean("bookDao");

        System.out.println(bookDao1);
        System.out.println(bookDao2);
        System.out.println(bookDao2.toString().equals(bookDao1.toString()));
    }
//    //加载配置文件初始化容器
//    ApplicationContext ctx = new
//            ClassPathXmlApplicationContext("applicationContext_1.xml");
//    //加载配置类初始化容器
//    ApplicationContext ctx = new
//            AnnotationConfigApplicationContext(SpringConfig.class);

}
