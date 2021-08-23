package headsvstails;
import java.util.Scanner;
public class headvstails {
 public static void main(String[] args) {
	 int year;
     System.out.println("Enter a Year : ");
     Scanner sc = new Scanner(System.in);
     year = sc.nextInt();
if((year>999) && (year<10000)) {
     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
        System.out.println(year+" year is a leap year");
     }
     else {
        System.out.println(year+" year is not a leap year");
     }
}
else
{System.out.println("Invalid input");
}
}  
}  
