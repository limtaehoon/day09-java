package inheritanse;

import java.util.ArrayList;

import day07.Shape;

public class Buyer {
	private int money;
	private int point;
	//Product []arr=new Product[10];
	
	//Arraylist lint ����
	ArrayList<Product> list=new ArrayList<Product>();//A
	int cnt;
	public Buyer(int money) {
		this.money =money;
		
	}
	//�����ϱ�
	public void buy(Product p) {
		
		money-=p.price;
		point+=p.bonuspoint;
	}
	//���ų���
	public void showInfo() {
		for(int i=0;i<list.size();i++) {
			//System.out.println(arr[i]);//A
			System.out.println(list.get(i));
			//System.out.println(((Product)list.get(i)).price);//A
			System.out.println(list.get(i).price);//<price>
		}
		
		System.out.println("�ܾ�"+money);
		System.out.println("����Ʈ"+point);
	
	}
}
	
	

