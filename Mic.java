package javabook.chapter4.usb;

public class Mic extends Computer implements USB {

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Mic�����ɹ�");
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Mic�رճɹ�");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mic";
	}

}
