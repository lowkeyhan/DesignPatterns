package DesignPatterns.Singleton;

/**
 * lazy loading  双重锁的懒汉式
 * 在第一次使用是初始化实例,虽然达到了按需初始化,但是带来线程不安全的问题;
 * 假如第一个线程走入判断null但没new时如果第二个线程也判断发现是null后new了一个实例,第一个也
 * 会new一个,这时候就不再是同一个实例;
 * 这个实例 是加了一个双重锁,通过synchronized解决,但是相率下降
 * 个人感觉好扯淡^^^^^^^^
 * @author lowkey
 *
 */
public class SL5 {
	//JIT 指令重排问题,所以加上volatile
	private static volatile  SL5 INSTANCE_SL5;
	
	private  SL5() {
		System.out.println("初始化SL5的实例");
	}
	
	public static  SL5 getInstance()  {
		if(INSTANCE_SL5==null) {
			synchronized (SL5.class) {
				if(INSTANCE_SL5==null) {
					//为了测试线程问题添加sleep
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE_SL5=new SL5();
				}
				
			}

		}
		return INSTANCE_SL5;
	}
	
	public String getSL5Name() {
		System.out.println("这是SL5的实例");
		return "这是SL5的实例";
	}
	
}
