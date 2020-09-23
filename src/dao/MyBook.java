package dao;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	public void before1(){
		System.out.println("前置增强...");
	}
	public void after1(){
		System.out.println("后置增强...");
	}	
	//环绕增强
	public void around1(ProceedingJoinPoint p) throws Throwable{	
		//方法之前执行
		      System.out.println("方法之前执行...");
		//执行原方法
		      p.proceed();
		//方法之后执行
			  System.out.println("方法之后执行...");
	}

}
