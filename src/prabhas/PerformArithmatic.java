package prabhas;

public class PerformArithmatic {

	public static void main(String[] args) {
		if(args!=null) {
			if(args.length>=2) {
			Calculator cal=new Calculator();
			cal.setArg1(Float.parseFloat(args[0]));
			cal.setArg2(Float.parseFloat(args[1]));
			System.out.println("Addition: "+cal.add());
			}else {
				System.out.println("No sufficient Args");
			}
		}

	}

}
