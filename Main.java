package javabook.chapter4.usb;

import javabook.chapter4.usb.Computer;
import javabook.chapter4.usb.KeyBoard;
import javabook.chapter4.usb.Mic;
import javabook.chapter4.usb.Mouse;

public class Main {

	/**
	 * 30分
	 * 
	 * 请定义三个类，分别为Mouse Mic KeyBoard，
	 * 这三个类实现USB接口，turnOn()中输出“**启动了”，turnOff()中输出“**关闭了”，例如“Mouse启动了”
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();

		//依次利用Computer类中的add方法添加 Mouse Mic KeyBoard KeyBoard对象
		computer.add(new Mouse());
		computer.add(new Mic());
		computer.add(new KeyBoard());
		computer.add(new Mic());
		computer.add(new Mic());
		//电脑开启
		computer.powerOn();
		
		//电脑关闭

		computer.powerOff();

	}

}
