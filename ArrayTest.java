package utilTest;

import java.util.ArrayList;
public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(1);//int �� intteger���� ��ȯ
		arr.add("�ȳ�");//String��
		arr.add(3.2);//double �� Double���� ��ȯ   ��ȯ:����Ŭ����
		System.out.println("������"+arr.get(arr.size()-1));//
		System.out.println(arr.size());
		arr.add(new Integer(3));
		System.out.println(arr.size());
		System.out.println("������"+arr.get(arr.size()-1));//
		arr.remove(1);
		arr.remove("�ȳ�");
		System.out.println("ũ��"+arr.size());//
		arr.add(1,"���� �ڹ�");
				System.out.println("ũ��"+arr.size());//
		ArrayList<Integer>list=new ArrayList<Integer>();//int �� String �ڸ��� ����integer����
		list.add(1);
		list.add(2);
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("�ڹ�");
		alist.add("Java");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String s:alist) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(Integer i:list) {
			System.out.print(i+"\t");
		}
	}
}
