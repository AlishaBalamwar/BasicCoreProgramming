package headsvstails;
import java.util.Scanner;
public class headvstails {
	public static void main(String[] args) {
		System.out.print("enter the number: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if ( x % 2 == 0 )        {
            System.out.println(x+" number is even");
        }
        else{
            System.out.println(x+" number is Odd");
        }
    }
}