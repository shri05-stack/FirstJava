
public class PlayArrays {
	public static void main(String[] args) {
		//create an array where we dont know the elements
		String[] cars = new String[4];
		
		//create an array where elements are known
		String[] fruits= {"mango","lichi","apple"};
		//access elements
		System.out.println(fruits[0]);
		System.out.println(fruits[2]);
		System.out.println(cars[0]);
		
		fruits[1]="banana";
		System.out.println(fruits);
		System.out.println(fruits[1]);
		cars[0]="audi";
		cars[1]="mercedes";
		System.out.println(cars.length);
		
		for(int i=0;i<=cars.length-1;i++) {
			System.out.println(cars[i]);
		}
		
	}
	
	

}
