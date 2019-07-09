package javabook.chapter6.ktvbylinkedlist;

import java.util.Scanner;

public class MainTest {

	/**
	 * 10分
	 * 
	 * 实现KTVLinkedList点歌系统
	 * 尝试所有的点歌功能，结果截图
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KTVLinkedList list = new KTVLinkedList();
		list.intro();
		Scanner scanner = new Scanner(System.in);
		int cmd;
		while(true) {
			System.out.println("请输入要执行的操作：");
			cmd = scanner.nextInt();
			switch(cmd) {
			case 0:
				System.out.print("请输入要加入的歌曲名:\t");
				list.addMusic(scanner.next());
				list.showList();
				break;
			case 1:
				System.out.print("请输入要置顶的歌曲名:\t");
				list.setTop(scanner.next());
				list.showList();
				break;
			case 2:
				System.out.print("请输入要提前一首的歌曲名:\t");
				list.setBefore(scanner.next());
				list.showList();
				break;
			case 3:
				list.exit();
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("您输入的命令无效，请重新输入！");
			}
		}
	}	


}
