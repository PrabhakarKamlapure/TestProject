package prabhas;

public class Calculator implements Arithmatic {

	float arg1,arg2;
	
	public float getArg1() {
		return arg1;
	}
	public void setArg1(float arg1) {
		this.arg1 = arg1;
	}
	public float getArg2() {
		return arg2;
	}
	public void setArg2(float arg2) {
		this.arg2 = arg2;
	}
		
	public double add() {		
		return arg1+arg2;
	}
	@Override
	public double sub() {
		 return arg1-arg2;
	}
}
