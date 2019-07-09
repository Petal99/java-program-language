package javabook.chapter4.usb;

public class Mic extends Computer implements USB {

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Mic启动成功");
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Mic关闭成功");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mic";
	}

}
