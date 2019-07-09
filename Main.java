package javabook.chapter4.usb;

import javabook.chapter4.usb.Computer;
import javabook.chapter4.usb.KeyBoard;
import javabook.chapter4.usb.Mic;
import javabook.chapter4.usb.Mouse;

public class Main {

	/**
	 * 30��
	 * 
	 * �붨�������࣬�ֱ�ΪMouse Mic KeyBoard��
	 * ��������ʵ��USB�ӿڣ�turnOn()�������**�����ˡ���turnOff()�������**�ر��ˡ������硰Mouse�����ˡ�
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();

		//��������Computer���е�add������� Mouse Mic KeyBoard KeyBoard����
		computer.add(new Mouse());
		computer.add(new Mic());
		computer.add(new KeyBoard());
		computer.add(new Mic());
		computer.add(new Mic());
		//���Կ���
		computer.powerOn();
		
		//���Թر�

		computer.powerOff();

	}

}
