// this code is for finding reverse of string without using reverse()
package strings;

public class Reversestrings {

	public static void main(String[] args) {
		String str="Raunit Singh Rajput";
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		

	}

}
