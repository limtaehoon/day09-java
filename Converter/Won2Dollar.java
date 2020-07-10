package inheritanse;

public class Won2Dollar extends Converter {
	public Won2Dollar(int don) {
	super.ratio=don;
	}

	@Override
	double convert(double stc) {
		// TODO Auto-generated method stub
		return stc/ratio;
	}

	@Override
	String destString() {
		// TODO Auto-generated method stub
		return "¿ø";
	}

	@Override
	String stcString() {
		// TODO Auto-generated method stub
		return "´Þ·¯";
	}

}
