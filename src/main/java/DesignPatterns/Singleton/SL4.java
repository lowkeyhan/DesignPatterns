package DesignPatterns.Singleton;


/**
 * lazy loading  加锁的懒汉式
 * 在第一次使用是初始化实例,虽然达到了按需初始化,但是带来线程不安全的问题;
 * 假如第一个线程走入判断null但没new时如果第二个线程也判断发现是null后new了一个实例,第一个也
 * 会new一个,这时候就不再是同一个实例;
 * 这个实例 是加了一个锁,通过synchronized解决,但是相率下降
 * @author lowkey
 *
 */
public class SL4 {
	private static  SL4 INSTANCE_SL4;
	
	private  SL4() {
		System.out.println("初始化SL4的实例");
	}
	
	public static synchronized SL4 getInstance()  {
		if(INSTANCE_SL4==null) {
			//为了测试线程问题添加sleep
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			INSTANCE_SL4=new SL4();
		}
		return INSTANCE_SL4;
	}
	
	public String getSL4Name() {
		System.out.println("这是SL4的实例");
		return "这是SL4的实例";
	}
	
	
}
