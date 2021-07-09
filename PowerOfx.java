//x raised to the power y
package forloops;
import java.util.Scanner;

public class PowerOfx {

	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		System.out.println("enter the value of x");
		int x=sc.nextInt();
		System.out.println("enter the value of y");
		int y=sc.nextInt();
		int pow=1;
		for(int i=1;i<=y;i++) {
			pow=pow*x;
			
		}
		System.out.println("x raised to the power y is equal to "+pow);
		

	}

}
