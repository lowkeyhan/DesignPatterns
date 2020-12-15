package DesignPatterns.Singleton;


/**
 * lazy loading  懒汉式
 * 在第一次使用是初始化实例,虽然达到了按需初始化,但是带来线程不安全的问题;
 * 假如第一个线程走入判断null但没new时如果第二个线程也判断发现是null后new了一个实例,第一个也
 * 会new一个,这时候就不再是同一个实例;
 * @author lowkey
 *
 */
public class SL3 {
	private static  SL3 INSTANCE_SL3;
	
	
	
	private  SL3() {
		System.out.println("初始化SL3的实例");
	}
	
	public static SL3 getInstance()  {
		if(INSTANCE_SL3==null) {
			//为了测试线程问题添加sleep
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			INSTANCE_SL3=new SL3();
		}
		return INSTANCE_SL3;
	}
	
	public String getSL3Name() {
		System.out.println("这是SL3的实例");
		return "这是SL3的实例";
	}
	
	
}
