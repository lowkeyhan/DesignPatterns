package hxb.DesignPatterns.Singleton;



/**
 * 饿汉模式
 * 类加载到内存后.就实例化一个单例,jvm保证线程安全
 * 简单实用推荐使用
 * 唯一缺点:不管用到与否类加载时就完成实例化
 * 
 * @author lowke
 *
 */
public class SL1 {
	private static final SL1 INSTANCE_SL1=new SL1();
	
	private  SL1() {
		System.out.println("初始化SL1的实例");
	}
	
	public static SL1 getInstance() {
		return INSTANCE_SL1;
	}
	
	public String getSL1Name() {
		System.out.println("这是SL1的实例");
		return "这是SL1的实例";
	}
}
