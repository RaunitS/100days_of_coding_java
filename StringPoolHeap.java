//this code shows the difference in string pool area and heap area
package strings;

public class StringPoolHeap {

	public static void main(String[] args) {
		String ani1=new String("dogs");
		String ani2="dogs";
		String ani3="dogs";
		System.out.println(ani1==ani2);//this is comparing heap area and pool area
		System.out.println(ani2==ani3);//both are in pool area

	}

}
