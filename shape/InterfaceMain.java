package inheritanse;

public class InterfaceMain {

	public static void main(String[] args) {

	Shape rec =new Rextangle(5,7);
		Shape circle=new Circle(5);
		//rec.a=5;
		System.out.print(rec.a);
		System.out.println("원넓이:"+circle.area());
		System.out.println("원둘레:"+circle.circle());
		System.out.println("사각형 넓이:"+rec.area());
		System.out.println("사각형 둘레:"+rec.circle());
	
	}

}
/*표준을 메서드이름과 똑같이 만들수 있는 역할을 함 interface
 * interface 중요함 
 */ 
