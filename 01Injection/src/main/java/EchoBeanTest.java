import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;


public class EchoBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		
		// Bean 접근(접근 방법 3가지)
		/*EchoBean bean = (EchoBean)ctx.getBean("echo");
		System.out.println(bean.sayEcho("홍길동"));
		
		EchoBean bean2 = (EchoBean)ctx.getBean(EchoBean.class);
		System.out.println(bean.sayEcho("이순신"));*/
		
		EchoBean bean3 = ctx.getBean("echo", EchoBean.class);
		System.out.println(bean3.sayEcho("강감찬"));
		
	}

}
