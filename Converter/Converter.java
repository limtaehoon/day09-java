package inheritanse;

	import java.util.Scanner;
	//����ȯ �ӵ���ȯ
	public abstract class Converter {
		abstract double convert(double stc);
		abstract String destString();
		abstract String stcString();
		protected double ratio;
			
		
		
		Scanner scanner=new Scanner(System.in);
		public void run() {//��ȯ
		
		
			 System.out.println(stcString()+"�� "+destString()+"�� �ٲ�ϴ�");
			 System.out.println(stcString()+"�� �Է��ϼ���");
			 		double val=scanner.nextDouble();
			 double res=convert(val);
			 System.out.println("��ȯ:"+res+destString()+"�Դϴ�");
		}
	}
