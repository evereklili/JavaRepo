package Test_1;

public class Circle {

	private int xPos;
	private int yPos;
	private int radius;
	public Circle(int x, int y, int r)
	{
		xPos=x;
		yPos=y;
		radius=r;
	}
	
	public Circle(int x, int y)
	{
//		xPos=x;
//		yPos=y;
//		radius=10; //default radius
		this(x,y,10);
	}
	
	public Circle()
	{
//		xPos=20; //assume some default value for xPox and yPos
//		yPos=20;
//		radius=10;
		this(20,10,10);
		
	}
	
	public String toString(){
		return "center= ( "+xPos+" , "+yPos+" ) and radius = "+radius;
		
	}
	
	public static void main(String[] args) {
		 System.out.println(new Circle());
		 System.out.println(new Circle(10,10));
		 System.out.println(new Circle(10,10,10));
		
	}

}
