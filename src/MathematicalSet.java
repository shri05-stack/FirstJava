import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class MathematicalSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> d1 = Arrays.asList(1,3,9,10);
		List<Integer> d2 = Arrays.asList(3,9,8);
		
		LinkedHashSet<Integer> sd1 = new LinkedHashSet<>(d1);
		LinkedHashSet<Integer> sd2 = new LinkedHashSet<>(d2);
		
		LinkedHashSet<Integer> csd1 = (LinkedHashSet<Integer>) sd1.clone();
		System.out.println(csd1);
		
		//union
		csd1.addAll(sd2);
		System.out.println(csd1);
		
		//intersection
		csd1= (LinkedHashSet<Integer>) sd1.clone();
		csd1.retainAll(sd2);
		System.out.println(csd1);


	}

}
