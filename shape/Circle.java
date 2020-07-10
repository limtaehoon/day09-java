package inheritanse;
	
	public class Circle implements Shape {
	private int r;
		public Circle(int r) {
		this.r=r;
	}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			return r*r*Math.PI;//메스는 수학적인것을 계산해주는것 
		}

		@Override
		public double circle() {//둘레
			// TODO Auto-generated method stub
			return 2*r*3.14;
		}

	
		}
	
	
	
	
