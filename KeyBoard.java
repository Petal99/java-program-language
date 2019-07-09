package javabook.chapter4.usb;

public class KeyBoard implements USB {

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("键盘启动成功");
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("键盘关闭成功");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KeyBoard";
	}
	
}
