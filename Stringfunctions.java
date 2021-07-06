package strings;

public class Stringfunctions {

	public static void main(String[] args) {
		System.out.println("output of important sting function");
             String str= "Raunit Singh";
             //char charAt(int index)
             char p=str.charAt(2);
             System.out.println(p);
             //String substring(int beginIndex)
             System.out.println(str.substring(2));
             // int length()
             System.out.println(str.length());
             //String substring(int beginIndex,int endIndex)
             System.out.println(str.substring(2, 11));
             //boolean contains(character sequence)
             System.out.println(str.contains("Raunit"));
             //boolean equals(object another)
             String str2="Raunit Singh";
             System.out.println(str.equals(str2));
             //boolean isEmpty()
             System.out.println(str2.isEmpty());
             //String concat(String Str)
             System.out.println(str.concat(str2));
             //another method for concatenation
             str=str +" Sanu Kumar";
             System.out.println(str);
             //String replace(char old,char new)
             System.out.println(str.replace('u','j'));
             //String[] split(String regex)
             String cars="hyundai,maruti,wagoNR,Ferrari";
             String[] allCars=cars.split(",");
             for(String car:allCars) {
            	 System.out.println(car);
             }
             //String toLowerCase()
             System.out.println(str.toLowerCase());
             System.out.println(str.toUpperCase());
             //String trim()
             String str3="    Raunit  Singh    ";
             System.out.println(str3.trim());
             //And many more but these are important functions to solve many problem
             
             
	}

}
