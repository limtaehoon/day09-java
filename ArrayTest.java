package utilTest;

import java.util.ArrayList;
public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(1);//int 형 intteger으로 변환
		arr.add("안녕");//String형
		arr.add(3.2);//double 형 Double으로 변환   변환:래퍼클래스
		System.out.println("마지막"+arr.get(arr.size()-1));//
		System.out.println(arr.size());
		arr.add(new Integer(3));
		System.out.println(arr.size());
		System.out.println("마지막"+arr.get(arr.size()-1));//
		arr.remove(1);
		arr.remove("안녕");
		System.out.println("크기"+arr.size());//
		arr.add(1,"지금 자바");
				System.out.println("크기"+arr.size());//
		ArrayList<Integer>list=new ArrayList<Integer>();//int 는 String 자리에 못들어감integer가능
		list.add(1);
		list.add(2);
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("자바");
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
