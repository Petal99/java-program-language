package javabook.chapter6.ktvbylinkedlist;

import java.util.Scanner;

public class MainTest {

	/**
	 * 10��
	 * 
	 * ʵ��KTVLinkedList���ϵͳ
	 * �������еĵ�蹦�ܣ������ͼ
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KTVLinkedList list = new KTVLinkedList();
		list.intro();
		Scanner scanner = new Scanner(System.in);
		int cmd;
		while(true) {
			System.out.println("������Ҫִ�еĲ�����");
			cmd = scanner.nextInt();
			switch(cmd) {
			case 0:
				System.out.print("������Ҫ����ĸ�����:\t");
				list.addMusic(scanner.next());
				list.showList();
				break;
			case 1:
				System.out.print("������Ҫ�ö��ĸ�����:\t");
				list.setTop(scanner.next());
				list.showList();
				break;
			case 2:
				System.out.print("������Ҫ��ǰһ�׵ĸ�����:\t");
				list.setBefore(scanner.next());
				list.showList();
				break;
			case 3:
				list.exit();
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("�������������Ч�����������룡");
			}
		}
	}	


}
