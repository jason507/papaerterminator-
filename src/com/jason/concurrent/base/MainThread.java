package com.jason.concurrent.base;

/**
 * ���̲߳�����
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
	 * �򵥵ĵ���(���߱������Ķ��߳�����)
	 */
	public static void mainThreadTest1()
	{
		LiftOff lift= new LiftOff();
		lift.run();
	}
	
	
	/**
	 * ��Runnable�߱���������Ĵ�ͳ��ʽ��������Thread������
	 * start֮������һ���߳�ִ��run�����������������ִ�в�����.�����´�ӡ�����ܻ���Run����֮ǰ��ӡ��
	 */
	public static void basicThread()
	{
		Thread t1 = new Thread( new LiftOff());
		t1.start();
		
		System.out.println("Wating for Liftoff");
	}
	
	/**
	 * �����Ķ��̳߳���
	 * ���ǵ�Cpu��������̻߳���һ��Cpu������з�Ƭִ��
	 * ���Ƕ�Cpu��������̵߳�������ĬĬ�İ��̷ֲ߳������Cpu��ִ��
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
