package calculatorpack;

public class CalcApp {

	public static void main(String[] args) {
		CalculatorImpl obj = new CalculatorImpl();
		
		System.out.println(obj.add(10,20));
		System.out.println(obj.sub(10,20));
		System.out.println(obj.mul(10,20));
		System.out.println(obj.divide(10,20));
		

	}

}
