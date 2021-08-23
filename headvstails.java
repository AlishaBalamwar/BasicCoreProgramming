package headsvstails;
import java.util.Scanner;
public class headvstails {
	 public static void main(String[] args) {
 int var = 1,i;
 System.out.println("Enter value of power till which we have to print table of 2: ");
 Scanner sc = new Scanner(System.in);
 Long z=sc.nextLong();

     for ( i = 1;i<=z; i++) {
         var = var * 2;
         System.out.println("2 ^ " + i + " = " + var);
     }
	 }
 
}
