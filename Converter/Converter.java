package inheritanse;

	import java.util.Scanner;
	//돈변환 속도변환
	public abstract class Converter {
		abstract double convert(double stc);
		abstract String destString();
		abstract String stcString();
		protected double ratio;
			
		
		
		Scanner scanner=new Scanner(System.in);
		public void run() {//교환
		
		
			 System.out.println(stcString()+"을 "+destString()+"로 바뀝니다");
			 System.out.println(stcString()+"을 입력하세요");
			 		double val=scanner.nextDouble();
			 double res=convert(val);
			 System.out.println("변환:"+res+destString()+"입니다");
		}
	}
