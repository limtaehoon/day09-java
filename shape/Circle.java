package inheritanse;
	
	public class Circle implements Shape {
	private int r;
		public Circle(int r) {
		this.r=r;
	}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			return r*r*Math.PI;//�޽��� �������ΰ��� ������ִ°� 
		}

		@Override
		public double circle() {//�ѷ�
			// TODO Auto-generated method stub
			return 2*r*3.14;
		}

	
		}
	
	
	
	
