package headsvstails;
import java.util.Scanner;
public class headvstails {
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);

	      float dividend, divisor;
	      System.out.print("Enter Dividend: ");
	       dividend =s.nextFloat();
	      System.out.print("Enter divisor: ");
	  divisor=s.nextFloat();
	      float q = dividend / divisor;
	      float rem = dividend % divisor;
	  
	      System.out.println("Quotient = " + q);
	      System.out.println("Remainder = " + rem);
	    }
	  }