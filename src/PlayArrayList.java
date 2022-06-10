import java.util.ArrayList;

public class PlayArrayList {
	public static void main(String[] args) {
		ArrayList<String>cars = new ArrayList<>();
		
		cars.add("116");
		cars.add("120");
		
		System.out.println(cars);
		
		cars.add(1,"bmw");
		System.out.println(cars);
		
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println(cars.contains("120"));
		System.out.println(cars.contains("bmw"));
		
		System.out.println(cars.size());
		
		System.out.println(cars.remove(0));
		System.out.println(cars);
		
		cars.remove("bmw");
		System.out.println(cars);
		
		cars.set(0, "120");
		System.out.println(cars);
	}

}
