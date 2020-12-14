package hxb.DesignPatterns.Singleton;
/**
 * 单例模式测试类
 * 主要判断两个实例相等这说明只生成一个实例
 * @author lowke
 *
 */
public class Main {
	
	public void SL1Test() {
		SL1 slOne=SL1.getInstance();
		SL1 slTwo=SL1.getInstance();
		System.out.println(slOne==slTwo);
	}

}
