
public class MainClass 
{
	public void createBooks() 
	{
		Book book[] = new Book[2];		 
	      book[0] = new Book("Java Programing ", 350.50);
	      book[1] = new Book("Let Us C", 200.00);
	      for(int i = 0; i<book.length; i++) 
	      {
		         book[i].display();
		         System.out.println(" ");
	      }
	    
	 }
	
	public void showBooks() 
	{
	   createBooks();
		
	}
	public static void main(String args[])  
	{
	    MainClass c1 = new MainClass();  
		c1.showBooks();
	   
    }
}
