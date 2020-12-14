package DesignPatterns.Singleton;

import org.junit.Test;

/**
 * 单例模式测试类
 * 主要判断两个实例相等这说明只生成一个实例
 * 日常还是使用1或7吧,其他感觉不太好
 * @author lowkey
 *
 */
public class Main {
	@Test
	public void SL1Test() {
		System.out.println("开始测试");
		System.out.println("第一次获得实例");
		SL1 slOne=SL1.getInstance();
		System.out.println("第二次获得实例");
		SL1 slTwo=SL1.getInstance();
		System.out.println(slOne==slTwo);
	}
	
	/**
	 * 由于junit，当测试主线程执行结束后，不管子线程是否结束，
	 * 所以测试多线程再最后让多线程停了一段时间,这个只是不太好的方法,
	 * 可以用工具类让主线程阻塞,只到子线程结束或者超时.
	 * @throws InterruptedException
	 */
	@Test
	public   void SL3Test() throws InterruptedException {
		
		System.out.println("开始");
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
		
		System.out.println("开始");
		for (int i = 0; i < 10; i++) {
			new Thread(()-> {
				System.out.println(":"+SL4.getInstance().hashCode());
			} ).start();
		}
		Thread.sleep(20);
	}
	
	
	@Test
	public void SL7Test() {
		System.out.println("开始测试");
		System.out.println("第一次获得实例");
		SL7 slOne=SL7.INSTANCE_SL7;
		System.out.println(slOne.getSL7Name());
		SL7 slTwo=SL7.INSTANCE_SL7;
		System.out.println(slOne==slTwo);
	}
}
