package Test_1;

public class AmbiguousOverload {

	public static void metots(long val1, int val2)
	{
		System.out.println("long int"); 
	}
	
	public static void metots(int val1, long val2)
	{
		System.out.println("int long"); 
	}
	public static void main(String[] args) {
		metots(9l, 10);
	}
}

//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The method metots(long, int) is ambiguous for the type AmbiguousOverload
//
//	at Test_1.AmbiguousOverload.main(AmbiguousOverload.java:15)
