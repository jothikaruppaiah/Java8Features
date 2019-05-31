package lambdapack;

public class Demo {

	public static void main(String[] args) {	      
		 HelloWorld helloWorld = (String name) -> { return "Hello " + name; };
		 System.out.println(helloWorld.hello("Jothi"));
		 System.out.println(HelloWorld.add(10, 20));
	}
}
