package aopdemo.calaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectConfigForINTCalc {
	
	
	@AfterReturning(pointcut="execution(* InterestCalculator.simpleInterestCalc())", returning="result")
	public void getResult(double result) {
		System.out.println("Result from Aspect : "+result);
	}
}