package helloworld;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@SuppressWarnings("unused")
@Aspect
public class HelloAspect {
	@Pointcut("execution(public * setMessage(..))")
	private void setMessage() { }	
	
	@Pointcut("execution(* getMessage(..))")
	private void getMessage() {	}	
	
	@Pointcut("execution(* getOne(..))")
	private void getOne() {	}	
	
	@Before("helloworld.HelloAspect.setMessage()")
	public void logSetMessage() {
		System.out.println("setMessage");
	}

	@Before("helloworld.HelloAspect.getMessage()")
	public void logGetMessage() {
		System.out.println("getMessage");
	}

	@AfterReturning("helloworld.HelloAspect.getMessage()")
	public void logGetMessageSuccessful() {
		System.out.println("getMessage done");
	}

	@Before("helloworld.HelloAspect.getOne()")
	public void logGetOne() {
		System.out.println("getOne");
	}
}
