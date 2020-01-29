package temp1.aspects;
import java.time.Duration;
import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspects {
	LocalTime time1,time2;
	@Before("execution(* temp1.models.EmployeeServices.getAllEmployee(..))")
	public void runBefore(JoinPoint joinPoint) throws Throwable {
		time1 = LocalTime.now();
	}
	
	@After("execution(* temp1.models.EmployeeServices.getAllEmployee(..))")
	public void runAfter(JoinPoint joinPoint) throws Throwable {
		time2 = LocalTime.now();
		System.out.println(time1);
		System.out.println(time2);
		Duration duration = Duration.between(time2, time1);
		
		System.out.println("Total Execution time is"+duration.getSeconds());
	}
	
	
}