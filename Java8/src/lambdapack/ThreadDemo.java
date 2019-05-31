package lambdapack;

public class ThreadDemo {

	public static void main(String[] args) {
		
		new Thread(()->
		{
			int sum=0;
			for(int i=0;i<10;i++)
			{
				sum+=i;
			}
			System.out.println("sum= "+sum);
		}).start();
				
		
	}

}
