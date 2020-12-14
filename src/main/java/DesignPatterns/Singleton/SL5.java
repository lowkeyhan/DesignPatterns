package DesignPatterns.Singleton;

/**
 * lazy loading  ˫����������ʽ
 * �ڵ�һ��ʹ���ǳ�ʼ��ʵ��,��Ȼ�ﵽ�˰����ʼ��,���Ǵ����̲߳���ȫ������;
 * �����һ���߳������ж�null��ûnewʱ����ڶ����߳�Ҳ�жϷ�����null��new��һ��ʵ��,��һ��Ҳ
 * ��newһ��,��ʱ��Ͳ�����ͬһ��ʵ��;
 * ���ʵ�� �Ǽ���һ��˫����,ͨ��synchronized���,���������½�
 * ���˸о��ó���^^^^^^^^
 * @author lowkey
 *
 */
public class SL5 {
	//JIT ָ����������,���Լ���volatile
	private static volatile  SL5 INSTANCE_SL5;
	
	private  SL5() {
		System.out.println("��ʼ��SL5��ʵ��");
	}
	
	public static  SL5 getInstance()  {
		if(INSTANCE_SL5==null) {
			synchronized (SL5.class) {
				if(INSTANCE_SL5==null) {
					//Ϊ�˲����߳��������sleep
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE_SL5=new SL5();
				}
				
			}

		}
		return INSTANCE_SL5;
	}
	
	public String getSL5Name() {
		System.out.println("����SL5��ʵ��");
		return "����SL5��ʵ��";
	}
	
}
