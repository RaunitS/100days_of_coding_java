package switchcase;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number a");
	int a= sc.nextInt();
	System.out.println("enter number b");
	int b= sc.nextInt();
	float c=0;
	System.out.println("type any operator + - * /");
	char operator=sc.next().charAt(0);
	switch(operator) {
	
	case '+':
		c=a+b;
		break;
	case '-':
		c=a-b;
		break;
	case '*':
		c=a*b;
		break;
	case '/':
		c=a/b;
		break;
	default:
		System.out.println("choose correct operator");
		
	}
	System.out.println("result "+ c);

	}

}
