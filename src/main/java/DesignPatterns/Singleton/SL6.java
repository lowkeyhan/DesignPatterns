package DesignPatterns.Singleton;


/**
 * 使用静态内部类的方法
 * JVM保证单例
 * 加载外部类时不会加载内部类,可以实现懒加载
 * 这样是线程安全的,保证单一实例,并且比第一种SL1好一点
 * @author lowkey
 *
 */
public class SL6 {
	private SL6() {}
	
	private static class SL6Holder{
		private final static  SL6 INSTANCE_SL6 =new SL6();
	}
	public static SL6 getInstance() {
		return SL6Holder.INSTANCE_SL6;
	}
	
	public String getSL6Name() {
		System.out.println("这是SL6的实例");
		return "这是SL6的实例";
	}
}
