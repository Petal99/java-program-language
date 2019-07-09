package javabook.chapter6.ktvbylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class KTVLinkedList {
	private static LinkedList<String> list = new LinkedList<String>();
	static {
		//初始化list变量

		list.add("东风破");
		list.add("夜曲");
		list.add("稻香");
		list.add("龙卷风");
		list.add("半岛铁盒");
		System.out.println("------------欢迎来到KTV点歌系统---------------");
	}
	
	public void intro() {
		String[] string= {"0: 添加歌曲至列表", "1: 将歌曲置顶", "2: 将歌曲前移一位", "3: 退出系统"};
		for(int i=0;i<string.length;i++) {
			System.out.println(string[i]+"\n");
		}
		showList();
	}
	
	public void showList() {
		/**
		 * 利用迭代器遍历list集合，输出内容格式如下所示:
		 * 当前歌曲列表: [ 东风破 夜曲 稻香 龙卷风 半岛铁盒 ]
		 * 推荐使用 StringBuilder
		 * */
		Iterator iterator = list.iterator();
		System.out.print("[ ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.print("]");

	}
	
	public void addMusic(String name) {
		
		/**
		 * 如果该歌曲已存在，输出“歌曲列表里已存在！”，
		 * 否则，添加该歌曲到列表，并输出“已添加歌曲  歌曲名”		  
		 * */
		if(list.contains(name)) {
			System.out.println("歌曲列表里已存在！");
		}else {
			list.add(name);
			System.out.println("已添加"+name);
		}

	}
	
	public void setTop(String name) {
		
		/**
		 * 如果该歌曲不存在，输出“歌曲列表中没有此歌曲，请添加！”，
		 * 否则，将该歌曲置顶，并输出“已经置顶”   
		 * */
		if(!list.contains(name)) {
			System.out.println("歌曲列表里没有此歌曲，请添加！");
		}else {
			list.remove(name);
			list.addFirst(name);
			System.out.println("已经置顶");
		}

	}
	
	public void setBefore(String name) {
		
		/**
		 * 如果该歌曲不存在，输出“歌曲列表中没有此歌曲，请添加！”，
		 * 如果该歌曲已在列表开头，输出"歌曲名 已经置顶，不能再提前啦"
		 * 否则，将该歌曲提前一位，并输出“歌曲名 已经提前一位”   
		 * */
		int pos = list.indexOf(name);
		if(!list.contains(name)) {
			System.out.println("歌曲列表中没有此歌曲，请添加！");
		}else if(pos == 0) {
			System.out.println(name+"已置顶，不能再提前啦");
		}else {
			list.remove(name);
			list.add(pos-1, name);
			System.out.println(name+"已经提前一位");
		}		
	}
		
	public void exit() {
		System.out.println("------------退出KTV点歌系统---------------");
		System.out.println("您已退出点歌系统");
		//System.exit(0);
	}
}
