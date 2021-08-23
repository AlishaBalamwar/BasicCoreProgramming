package headsvstails;
import java.util.Scanner;
public class headvstails {
		 public static void main(String[] args) {
		        float harmonicSeriesSum = 1;
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter number for print Harmonic series: ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
		    
		    System.out.print("1/"+i+" + ");
		    harmonicSeriesSum += (float)1 / i;
		}
		
		System.out.println("Sum of Harmonic series is: "+harmonicSeriesSum);

		    }
		}