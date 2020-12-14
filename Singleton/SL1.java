package hxb.DesignPatterns.Singleton;



/**
 * ����ģʽ
 * ����ص��ڴ��.��ʵ����һ������,jvm��֤�̰߳�ȫ
 * ��ʵ���Ƽ�ʹ��
 * Ψһȱ��:�����õ���������ʱ�����ʵ����
 * 
 * @author lowke
 *
 */
public class SL1 {
	private static final SL1 INSTANCE_SL1=new SL1();
	
	private  SL1() {
		System.out.println("��ʼ��SL1��ʵ��");
	}
	
	public static SL1 getInstance() {
		return INSTANCE_SL1;
	}
	
	public String getSL1Name() {
		System.out.println("����SL1��ʵ��");
		return "����SL1��ʵ��";
	}
}
