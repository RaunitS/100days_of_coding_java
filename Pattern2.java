// ********
//  *******
//   ******
//    *****
//     ****
//      ***
//       **
//        *
package forloops;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
		System.out.println("enter any number");
		int n= sc.nextInt();
		System.out.println("this is the pattern");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}

}
