import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  Main{
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =new AnnotationConfigApplicationContext(Config.class);
		
		ctx.getBean("vv",Demo.class).journey();
		
		
		
		AnnotationConfigApplicationContext ctx2=(AnnotationConfigApplicationContext)ctx;
		ctx2.close();
		
		                   
	}

}
