package DesignPatterns.Singleton;

import org.junit.Test;

/**
 * ����ģʽ������
 * ��Ҫ�ж�����ʵ�������˵��ֻ����һ��ʵ��
 * �ճ�����ʹ��1��7��,�����о���̫��
 * @author lowkey
 *
 */
public class Main {
	@Test
	public void SL1Test() {
		System.out.println("��ʼ����");
		System.out.println("��һ�λ��ʵ��");
		SL1 slOne=SL1.getInstance();
		System.out.println("�ڶ��λ��ʵ��");
		SL1 slTwo=SL1.getInstance();
		System.out.println(slOne==slTwo);
	}
	
	/**
	 * ����junit�����������߳�ִ�н����󣬲������߳��Ƿ������
	 * ���Բ��Զ��߳�������ö��߳�ͣ��һ��ʱ��,���ֻ�ǲ�̫�õķ���,
	 * �����ù����������߳�����,ֻ�����߳̽������߳�ʱ.
	 * @throws InterruptedException
	 */
	@Test
	public   void SL3Test() throws InterruptedException {
		
		System.out.println("��ʼ");
		//System.out.println(":"+SL3.getInstance().hashCode());
		for (int i = 0; i < 10; i++) {
			new Thread(()-> {
				System.out.println(":"+SL3.getInstance().hashCode());
			} ).start();
		}
		Thread.sleep(20);
	}
	
	@Test
	public   void SL4Test() throws InterruptedException {
		
		System.out.println("��ʼ");
		for (int i = 0; i < 10; i++) {
			new Thread(()-> {
				System.out.println(":"+SL4.getInstance().hashCode());
			} ).start();
		}
		Thread.sleep(20);
	}
	
	
	@Test
	public void SL7Test() {
		System.out.println("��ʼ����");
		System.out.println("��һ�λ��ʵ��");
		SL7 slOne=SL7.INSTANCE_SL7;
		System.out.println(slOne.getSL7Name());
		SL7 slTwo=SL7.INSTANCE_SL7;
		System.out.println(slOne==slTwo);
	}
}
