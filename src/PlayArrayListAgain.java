import java.util.ArrayList;
import java.util.Comparator;

public class PlayArrayListAgain {
	public static void main(String[] args) {
		ArrayList<Integer>nos =new ArrayList<>();
		
		nos.add(1);
		nos.add(23);
		nos.add(56);
		
		//inner class
		/*class DescendingComperator2 implements Comparator<Integer> {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			

		}

		
		nos.sort(new DescendingComperator2());*/
		
		//anonymous inner class
		/*nos.sort( new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		} );*/
		
		//lambda expressions
		nos.sort((o1,o2) -> o2.compareTo(o1));
			
			
		
		
		
		System.out.println(nos);
	}

	
}
