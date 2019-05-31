package interfacepack;

public class HelloApp {

	public static void main(String[] args) {
		
		HelloInterface x = new HelloImpl();
		System.out.println(x.sayHello());
		
	}

}
