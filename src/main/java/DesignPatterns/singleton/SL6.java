package DesignPatterns.Singleton;


/**
 * ʹ�þ�̬�ڲ���ķ���
 * JVM��֤����
 * �����ⲿ��ʱ��������ڲ���,����ʵ��������
 * �������̰߳�ȫ��,��֤��һʵ��,���ұȵ�һ��SL1��һ��
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
		System.out.println("����SL6��ʵ��");
		return "����SL6��ʵ��";
	}
}
