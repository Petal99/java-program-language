package javabook.chapter6.ktvbylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class KTVLinkedList {
	private static LinkedList<String> list = new LinkedList<String>();
	static {
		//��ʼ��list����

		list.add("������");
		list.add("ҹ��");
		list.add("����");
		list.add("�����");
		list.add("�뵺����");
		System.out.println("------------��ӭ����KTV���ϵͳ---------------");
	}
	
	public void intro() {
		String[] string= {"0: ��Ӹ������б�", "1: �������ö�", "2: ������ǰ��һλ", "3: �˳�ϵͳ"};
		for(int i=0;i<string.length;i++) {
			System.out.println(string[i]+"\n");
		}
		showList();
	}
	
	public void showList() {
		/**
		 * ���õ���������list���ϣ�������ݸ�ʽ������ʾ:
		 * ��ǰ�����б�: [ ������ ҹ�� ���� ����� �뵺���� ]
		 * �Ƽ�ʹ�� StringBuilder
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
		 * ����ø����Ѵ��ڣ�����������б����Ѵ��ڣ�����
		 * ������Ӹø������б������������Ӹ���  ��������		  
		 * */
		if(list.contains(name)) {
			System.out.println("�����б����Ѵ��ڣ�");
		}else {
			list.add(name);
			System.out.println("�����"+name);
		}

	}
	
	public void setTop(String name) {
		
		/**
		 * ����ø��������ڣ�����������б���û�д˸���������ӣ�����
		 * ���򣬽��ø����ö�����������Ѿ��ö���   
		 * */
		if(!list.contains(name)) {
			System.out.println("�����б���û�д˸���������ӣ�");
		}else {
			list.remove(name);
			list.addFirst(name);
			System.out.println("�Ѿ��ö�");
		}

	}
	
	public void setBefore(String name) {
		
		/**
		 * ����ø��������ڣ�����������б���û�д˸���������ӣ�����
		 * ����ø��������б�ͷ�����"������ �Ѿ��ö�����������ǰ��"
		 * ���򣬽��ø�����ǰһλ��������������� �Ѿ���ǰһλ��   
		 * */
		int pos = list.indexOf(name);
		if(!list.contains(name)) {
			System.out.println("�����б���û�д˸���������ӣ�");
		}else if(pos == 0) {
			System.out.println(name+"���ö�����������ǰ��");
		}else {
			list.remove(name);
			list.add(pos-1, name);
			System.out.println(name+"�Ѿ���ǰһλ");
		}		
	}
		
	public void exit() {
		System.out.println("------------�˳�KTV���ϵͳ---------------");
		System.out.println("�����˳����ϵͳ");
		//System.exit(0);
	}
}
