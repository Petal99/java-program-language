package javabook.chapter5.wrappertest;

public class MainTest {
	
	/**
	 * 20��
	 * 
	 * ��һ���������Ϳո���ɵ��ַ�����������
	 * ����������С�����˳���������
	 * ����WrapperTest���е�wrapper��Ա����ʵ�ָù���
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("������һϵ���������ÿո����");
		String str = "101 20 -5 323 4 20 200 0 325 1";
		System.out.println("������ַ���Ϊ��\n"+str);
		WrapperTest wrapperTest  = new WrapperTest();
		System.out.println("������ַ���Ϊ��");
		System.out.println(wrapperTest.wrapper(str));
	}

}
