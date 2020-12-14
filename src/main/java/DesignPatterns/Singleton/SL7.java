package DesignPatterns.Singleton;

/**
 * 不仅可以解决线程问题,还可以防止反序列化
 * 完美简洁 666
 * 枚举类没有构造方法,所以使用反射也无法创建对象,只能获取一个INSTANCE_SL7的值,还是那一个实体
 * @author lowkey
 *
 */
public enum SL7 {
	INSTANCE_SL7;
	
	public String getSL7Name() {
		System.out.println("这是SL7的实例");
		return "这是SL7的实例";
	}
	
	
}
