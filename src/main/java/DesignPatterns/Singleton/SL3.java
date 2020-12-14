package DesignPatterns.Singleton;


/**
 * lazy loading  ����ʽ
 * �ڵ�һ��ʹ���ǳ�ʼ��ʵ��,��Ȼ�ﵽ�˰����ʼ��,���Ǵ����̲߳���ȫ������;
 * �����һ���߳������ж�null��ûnewʱ����ڶ����߳�Ҳ�жϷ�����null��new��һ��ʵ��,��һ��Ҳ
 * ��newһ��,��ʱ��Ͳ�����ͬһ��ʵ��;
 * @author lowkey
 *
 */
public class SL3 {
	private static  SL3 INSTANCE_SL3;
	
	
	
	private  SL3() {
		System.out.println("��ʼ��SL3��ʵ��");
	}
	
	public static SL3 getInstance()  {
		if(INSTANCE_SL3==null) {
			//Ϊ�˲����߳��������sleep
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			INSTANCE_SL3=new SL3();
		}
		return INSTANCE_SL3;
	}
	
	public String getSL3Name() {
		System.out.println("����SL3��ʵ��");
		return "����SL3��ʵ��";
	}
	
	
}
