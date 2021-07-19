//this code consists of constructors and how to use this keyword
package strings;
class NewKeyword{
	int wheels;
	NewKeyword(int wheels){
		this.wheels=wheels;
		 String color="blue";
		
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		NewKeyword bike=new NewKeyword(2);
		NewKeyword truck=new NewKeyword(10);
		
		System.out.println(truck.wheels+" and " +bike.wheels +" are no of wheels of in truck and bike");

	}

}
