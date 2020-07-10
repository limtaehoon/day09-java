package inheritanse;

public class Rextangle implements Shape {
	private int w,h;
	public Rextangle(int w,int h) {
		this.w=w;
		this.h=h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return w*h;
	}

	@Override
	public double circle() {
		// TODO Auto-generated method stub
		return (w*h)*2;
	}

}