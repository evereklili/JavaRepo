package Test_1;

public class Point2 {

	private int xPos, yPos;
	public Point2(int x, int y)
	{
		xPos=x; yPos=y;
	}
	public String toString()
	{
		return "x="+xPos+", y= "+yPos;
	}
	public static void main(String[] args) {
		
		System.out.println(new Point2(102,20)); //x=102, y= 20
		Object object=new Point(100,200);
		System.out.println(object.toString());
		
	}
}
