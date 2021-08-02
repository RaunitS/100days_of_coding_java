//this code is to print reversing string word by word
package strings;
import java.util.Scanner;

public class ReverseStingsWordByWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string which you want to reverse");
	     String s = in.nextLine();
	     String ans="";
		int i=s.length()-1;
		while (i>=0) {
			while(i>=0 && s.charAt(i) ==' ') i--;
			int j=i;
			if(i<0) break;
			while(i>=0&&s.charAt(i)!=' ')i--;
			if(ans.isEmpty()) {
			ans=ans.concat(s.substring(i+1, j+1));
			}
			else
			{
				ans=ans.concat(" "+s.substring(i+1, j+1));
			}
			
			
		}
		System.out.println(ans);

	}

}
