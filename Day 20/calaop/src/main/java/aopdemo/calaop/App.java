package aopdemo.calaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		InterestCalculator interestCalculator = context.getBean(InterestCalculator.class);
		System.out.println(interestCalculator.simpleInterestCalc());
	}
}
