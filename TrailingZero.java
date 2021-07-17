//this code is find the number of trailing zeros of factorial of any number
package forloops;
import java.util.Scanner;

public class TrailingZero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int p=sc.nextInt();
		Trailing num=new Trailing();
		
	
		System.out.println("trailing zeros of factotial of "+p+" is "+num.trailingZero(p));
		
		

	}

}
class Trailing{
	int trailingZero(int n) {
		int count = 0;
		for(int i=5;n/i>=1;i*=5) {
			count+=n/i;
		}
		return count;
		
	}
	
}
