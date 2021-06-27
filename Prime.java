package forloop;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

	boolean prime = false;
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		if (n%i!=0) {
			prime=true;
			System.out.println(prime);
			
			
		}
		break;
	}
		
	if(n<2) {
		prime = false;
				System.out.println(prime);
	}
			
	
}
}