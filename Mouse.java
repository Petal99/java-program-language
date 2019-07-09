package javabook.chapter4.usb;

public class Mouse implements USB {

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("鼠标启动成功");
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("鼠标关闭成功");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mouse";
	}

}
