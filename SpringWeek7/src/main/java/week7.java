import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class week7 {
	
	private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("mobile.xml");
        Mobile mobile = (Mobile) context.getBean("mobile");
        
        System.out.println(mobile);
    }
}
