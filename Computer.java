package javabook.chapter4.usb;

import javabook.chapter4.usb.USB;

public class Computer {
	private USB[] usb = new USB[4];
	
	
	/**
	 * 向计算机链接一个USB设备
	 * 如果链接成功，输出“成功链接电脑”，
	 * 如果链接失败，输出“当前计算机usb接口已全部占用，链接失败”
	 * */
	

				

	
	//计算机的开机功能，开启每一个usb链接
	void powerOn() {
		for(int i = 0;i<usb.length;i++) {
			if(usb[i]!=null) {
				usb[i].turnOn();
			}
		}
		System.out.println("开机成功");
	}
	//计算机关机功能,关闭每一个usb链接
	void powerOff() {
		for(int i=0;i<usb.length;i++) {
			if(usb[i]!=null) {
				usb[i].turnOff();
			}
		}
		System.out.println("关机成功");
	}
	public void add(USB usb) {
		// TODO Auto-generated method stub
		for(int i = 0;i<this.usb.length;i++) {
			if(this.usb[i] == null) {
				this.usb[i] = usb;
				System.out.println(usb+"成功连接电脑");
				return;
			}
		}
		System.out.println("当前计算机usb接口已全部占用，连接失败");
		
	}
	

}
	
