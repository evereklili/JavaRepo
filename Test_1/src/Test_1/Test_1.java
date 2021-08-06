package Test_1;

 

public class Test_1 {

	public static void fillColor(int d, int e, int f)
	{
		int sums=d+e+f;
		System.out.println("sums int:"+sums);
	}
	public static void fillColor(float hue, float saturation, float brightness)
	{
		double sums=hue+saturation+brightness;
		System.out.println("sums float:"+sums);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fillColor(2,3,5);
		fillColor(0.2f,0.3f,0.5f);

	}

}
