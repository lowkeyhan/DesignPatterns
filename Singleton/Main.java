package hxb.DesignPatterns.Singleton;
/**
 * ����ģʽ������
 * ��Ҫ�ж�����ʵ�������˵��ֻ����һ��ʵ��
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
