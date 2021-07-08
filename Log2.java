//compute the value of natural logarithm of 2, by adding upto n terms in the series
//1 - 1/2 + 1/3 - 1/4 + 1/5 .......1/n
package forloops;
import java.util.Scanner;

public class Log2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of terms in series you want to add");
		int n=sc.nextInt();
		float result=0;
		for(float i=1;i<=n;i++) {
			if (i%2==0) {
				result-=1/i;
			}
			else {
				result+=1/i;
			}
			
		}
		System.out.println(result);
		

	}

}
