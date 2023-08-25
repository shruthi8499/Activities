package aopdemo.calaop;

import org.springframework.stereotype.Component;

@Component
public class InterestCalculator {
	
	double principal=1400;
	int time=3;
	int rate=4;
	public double simpleInterestCalc() {
		
		return principal*time*rate/100;
	}

}