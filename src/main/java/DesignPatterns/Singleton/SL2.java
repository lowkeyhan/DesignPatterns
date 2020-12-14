package DesignPatterns.Singleton;

/**
 * ���һ��һ��,ֻ�Ǹĳɾ�̬������
 * @author lowkey
 *
 */
public class SL2 {
	private static final SL2 INSTANCE_SL2;
	
	static {
		INSTANCE_SL2=new SL2();
	}
	
	private  SL2() {
		System.out.println("��ʼ��SL2��ʵ��");
	}
	
	public static SL2 getInstance() {
		return INSTANCE_SL2;
	}
	
	public String getSL1Name() {
		System.out.println("����SL2��ʵ��");
		return "����SL2��ʵ��";
	}
}
