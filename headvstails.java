package headsvstails;
import java.util.Scanner;
public class headvstails {
	public static void main(String[] args) {
		 int a, b, t;  
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the two values which we want to swap");  
	       a = sc.nextInt();  
	       b = sc.nextInt();  
	       System.out.println("Before swapping numbers: "+a +"  "+ b);  
	       t = a;  
	       a = b;  
	       b = t;  
	       System.out.println("After swapping: "+a +"   " + b);  
	    }    
	}  