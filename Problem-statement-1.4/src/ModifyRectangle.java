import java.util.*;

public class ModifyRectangle {
	int length; 
    int width; 
    int area; 
    int parameter;
    
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
    public ModifyRectangle ()
    {
    	length = 1;
    	width= 1;
    }

    void input() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = sc.nextInt();
    }
    
    void  areaRectangle()
    {
        area = length * width;
       
    }
 
     void  perimeterRectangle()
    {
    	 parameter = 2*(length + width);
       
    }

    void display() {
    	if(length>0 && length<20)
        {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Parameter of Rectangle = " +parameter);}
       
        }

    public static void main(String args[]) {
    	
    	ModifyRectangle obj1 = new ModifyRectangle  ();
        obj1.input();
        obj1.areaRectangle();
        obj1.perimeterRectangle();
        obj1.display();
        System.out.println("****************************");
        
        ModifyRectangle  obj2 = new ModifyRectangle ();
        obj2.input();
        obj2.areaRectangle();
        obj2.perimeterRectangle();
        obj2.display();
        System.out.println("****************************");
        
        ModifyRectangle  obj3 = new ModifyRectangle ();
        obj3.input();
        obj3.areaRectangle();
        obj3.perimeterRectangle();
        obj3.display();
        System.out.println("****************************");
        
        ModifyRectangle  obj4 = new ModifyRectangle ();
        obj4.input();
        obj4.areaRectangle();
        obj4.perimeterRectangle();
        obj4.display();
        System.out.println("****************************");
        
        ModifyRectangle  obj5 = new ModifyRectangle ();
        obj5.input();
        obj5.areaRectangle();
        obj5.perimeterRectangle();
        obj5.display();
    	
    }
}
