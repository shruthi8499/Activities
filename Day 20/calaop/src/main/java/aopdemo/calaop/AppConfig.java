package aopdemo.calaop;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public InterestCalculator interestCalculator() {
		return new InterestCalculator();
	}
	
	@Bean
	public AspectConfigForINTCalc aspectConfigForINTCalc() {
		return new AspectConfigForINTCalc();
	}

}

