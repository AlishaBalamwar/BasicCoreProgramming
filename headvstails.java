package headsvstails;
import java.util.Scanner;
public class headvstails {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);	 
  System.out.println("Enter the number of flips");
  int n=sc.nextInt();
  double var=0;
  for (int i=0; i<n; i++){
	  double result=Math.floor(Math.random()*10)%2;
	  if(result==0) {
		  System.out.println("It is tail");
		  var+=1;
	  }
	  else {
		  System.out.println("It is head");
	  }
	}
 System.out.println("Percentage of tail is "+var/n);
 System.out.println("Percentage of head  is "+(n-var)/n);
 double tail = var/n;
 double head=(n-var)/n;
 if(tail<=0.5)
 {System.out.println("It is tail because percentage of tail is less than or equal to 0.5");
 }
 else {
	 System.out.println("It is head because percentage of head is more than 0.5");
 }
}
}