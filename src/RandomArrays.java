import java.util.Random;

public class RandomArrays {
	
	static <T extends Number> T randomElement(T[] elements){
		Random random = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
	}
	public static void main(String[] args) {
		/*String[]cars= {"porsche","mercedes","bmw"};
		String element = randomElement(cars);
		System.out.println(element);*/
		Integer[] nos = {10,1,3,6,2};
		int n = randomElement(nos);
		System.out.println(n);
		
		Double[] d = {10.0,1.0,3.0,6.0,2.0};
		double dd = randomElement(d);
		System.out.println(dd);
		
	}

}
