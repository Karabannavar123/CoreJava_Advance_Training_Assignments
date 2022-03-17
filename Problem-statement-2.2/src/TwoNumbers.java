public class TwoNumbers {
	 public static void main(String[] args) {

		    int i=0, n=13, firstTerm=1, secondTerm=2;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    while (i<=n) 
		    {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }
		  }
}
