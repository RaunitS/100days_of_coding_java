package bitwise;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping");
		System.out.println("a="+a+" b="+b);

	}

}
