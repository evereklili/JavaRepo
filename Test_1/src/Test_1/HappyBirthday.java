package Test_1;

public class HappyBirthday {
	public static void wish(String name)
	{
		System.out.println("Happy birthday "+name+" !");
	}
	public static void wish()
	{
		wish("to you");
	}
	public static void main(String[] args) {
		wish();
		wish("Dear Omer DOGU");
	}

}
