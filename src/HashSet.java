import java.util.Arrays;
import java.util.List;


public class HashSet {

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(4,1,6,7,9,10,3,5,1,7,9);
		java.util.HashSet<Integer> hashSet = new java.util.HashSet(nos);
		System.out.println(nos);
		
		java.util.HashSet<String> fruits = new java.util.HashSet();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("Lichi");
		
		System.out.println(fruits);
		
		fruits.remove("mango");
		System.out.println("fruits");
		
		System.out.println(fruits.contains("banana"));
		System.out.println(fruits.contains("lichi"));
		
				
		// TODO Auto-generated method stub

	}

}
