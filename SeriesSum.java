//sum of the series 1 , 1/2 , 1/3 ,.....
package forloops;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of terms in the series");
		int n=input.nextInt();
		double res=0.0;
		for(double i=1;i<=n;i++) {
			res= res + 1/i;
			
		}
		System.out.println("the result sum is "+ res);
		
		

	}

}
