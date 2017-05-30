package com.jason.concurrent.base;

/**
 * 主线程测试用
 * @author jason
 *
 */
public class MainThread {

	public static void main(String[] args) {
		// mainThreadTest1();
		//basicThread();
		realMutilThread();
	}

	/**
	 * 简单的调用(不具备真正的多线程能力)
	 */
	public static void mainThreadTest1()
	{
		LiftOff lift= new LiftOff();
		lift.run();
	}
	
	
	/**
	 * 让Runnable具备工作任务的传统方式就是是用Thread构造器
	 * start之后另起一个线程执行run方法，程序继续往下执行不阻塞.即以下打印语句可能会在Run方法之前打印出
	 */
	public static void basicThread()
	{
		Thread t1 = new Thread( new LiftOff());
		t1.start();
		
		System.out.println("Wating for Liftoff");
	}
	
	/**
	 * 真正的多线程场景
	 * 当是单Cpu的情况下线程会在一个Cpu上面进行分片执行
	 * 当是多Cpu的情况下线程调度器会默默的把线程分布到多个Cpu上执行
	 */
	public static void realMutilThread()
	{
		for(int i=0;i<5;i++)
		{
			Thread t = new Thread(new LiftOff());
			t.start();
			System.out.println("Wating for Liftoff");
		}
	}
}
