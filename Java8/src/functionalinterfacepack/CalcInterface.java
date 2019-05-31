package functionalinterfacepack;

@FunctionalInterface
public interface CalcInterface {

	public int sum(int a, int b);
	public default int sub(int a, int b)
	{
		return a - b;
	}
	public default int sub1(int a, int b)
	{
		return a - b;
	}
	public static int mul(int a, int b)
	{
		return a * b;
	}
	public static int mul1(int a, int b)
	{
		return a * b;
	}
}
