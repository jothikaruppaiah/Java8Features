package functionalinterfacepack;

public class Demo {

	public static void main(String[] args) {
		
		CalcInterface ci = (x,y)->
		{
			return x + y;
		};
		System.out.println(ci.sum(20, 30));
		
		System.out.println(ci.sub(20, 10));
		
		System.out.println(CalcInterface.mul(10,20));
	}

}
