package DesignPatterns.Singleton;


/**
 * lazy loading  ����������ʽ
 * �ڵ�һ��ʹ���ǳ�ʼ��ʵ��,��Ȼ�ﵽ�˰����ʼ��,���Ǵ����̲߳���ȫ������;
 * �����һ���߳������ж�null��ûnewʱ����ڶ����߳�Ҳ�жϷ�����null��new��һ��ʵ��,��һ��Ҳ
 * ��newһ��,��ʱ��Ͳ�����ͬһ��ʵ��;
 * ���ʵ�� �Ǽ���һ����,ͨ��synchronized���,���������½�
 * @author lowkey
 *
 */
public class SL4 {
	private static  SL4 INSTANCE_SL4;
	
	private  SL4() {
		System.out.println("��ʼ��SL4��ʵ��");
	}
	
	public static synchronized SL4 getInstance()  {
		if(INSTANCE_SL4==null) {
			//Ϊ�˲����߳��������sleep
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			INSTANCE_SL4=new SL4();
		}
		return INSTANCE_SL4;
	}
	
	public String getSL4Name() {
		System.out.println("����SL4��ʵ��");
		return "����SL4��ʵ��";
	}
	
	
}
