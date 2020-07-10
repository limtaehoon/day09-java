package inheritanse;

public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		super.ratio=ratio;
	} 

	@Override
	double convert(double stc) {
		// TODO Auto-generated method stub
		return stc/ratio;
	}

	@Override
	String destString() {
		// TODO Auto-generated method stub
		return "km";
	}

	@Override
	String stcString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}