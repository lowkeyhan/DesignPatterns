package DesignPatterns.Singleton;

/**
 * 与第一个一样,只是改成静态语句块了
 * @author lowkey
 *
 */
public class SL2 {
	private static final SL2 INSTANCE_SL2;
	
	static {
		INSTANCE_SL2=new SL2();
	}
	
	private  SL2() {
		System.out.println("初始化SL2的实例");
	}
	
	public static SL2 getInstance() {
		return INSTANCE_SL2;
	}
	
	public String getSL1Name() {
		System.out.println("这是SL2的实例");
		return "这是SL2的实例";
	}
}
