import java.util.*;

public class TestRectangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
      for(int i=1; i<=5; i++) 
      {
    	  System.out.println("Enter length and breadth of rectangle");
    	  int length=sc.nextInt();
    	  int breadth=sc.nextInt();
		Rectangle obj = new Rectangle(length, breadth);
		obj.displayAreaOfTestRectangle();
      }
	}
}
