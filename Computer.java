package javabook.chapter4.usb;

import javabook.chapter4.usb.USB;

public class Computer {
	private USB[] usb = new USB[4];
	
	
	/**
	 * ����������һ��USB�豸
	 * ������ӳɹ���������ɹ����ӵ��ԡ���
	 * �������ʧ�ܣ��������ǰ�����usb�ӿ���ȫ��ռ�ã�����ʧ�ܡ�
	 * */
	

				

	
	//������Ŀ������ܣ�����ÿһ��usb����
	void powerOn() {
		for(int i = 0;i<usb.length;i++) {
			if(usb[i]!=null) {
				usb[i].turnOn();
			}
		}
		System.out.println("�����ɹ�");
	}
	//������ػ�����,�ر�ÿһ��usb����
	void powerOff() {
		for(int i=0;i<usb.length;i++) {
			if(usb[i]!=null) {
				usb[i].turnOff();
			}
		}
		System.out.println("�ػ��ɹ�");
	}
	public void add(USB usb) {
		// TODO Auto-generated method stub
		for(int i = 0;i<this.usb.length;i++) {
			if(this.usb[i] == null) {
				this.usb[i] = usb;
				System.out.println(usb+"�ɹ����ӵ���");
				return;
			}
		}
		System.out.println("��ǰ�����usb�ӿ���ȫ��ռ�ã�����ʧ��");
		
	}
	

}
	
