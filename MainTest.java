package javabook.chapter5.wrappertest;

public class MainTest {
	
	/**
	 * 20分
	 * 
	 * 将一个由整数和空格组成的字符串进行排序，
	 * 按照整数有小到大的顺序进行排列
	 * 利用WrapperTest类中的wrapper成员函数实现该功能
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("请输入一系列整数，用空格隔开");
		String str = "101 20 -5 323 4 20 200 0 325 1";
		System.out.println("输入的字符串为：\n"+str);
		WrapperTest wrapperTest  = new WrapperTest();
		System.out.println("输出的字符串为：");
		System.out.println(wrapperTest.wrapper(str));
	}

}
