package headsvstails;
import java.util.Scanner;
public class headvstails {
	public static void main(String[] args) {
	int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number");
    n = sc.nextInt();
   
    for(int i = 2; i< n; i++) {
       while(n%i == 0) {
          System.out.println(i+" ");
          n = n/i;
       }
    }
    if(n>2) {
       System.out.println(n);
    }
 }
}