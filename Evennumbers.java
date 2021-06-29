//this code is for printing even numbers from 0 to n
package forloops;
import java.util.Scanner;

public class Evennumbers {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter any number");
		int n = input.nextInt();
		if(n%2==0) {
			for(int i=0;i<= n;i=i+2) {
				System.out.print(i+" ");
			}
		}
			else {
				for(int i=0;i<= n-1;i=i+2) {
					System.out.print(i+" ");
				}
				
			}
		}
		
}


