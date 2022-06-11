import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ListOperations {
	public static void main(String[] args) {
		//java 8
		//stream API
		
		//source data
		List<Integer> nos = Arrays.asList(4,1,6,7,9,10,3,5,1,7,9);
		Stream<Integer> stream=nos.stream();
		List<Integer> odds = stream
				.filter(element->element%2!=0 && element>3)
				.collect(Collectors.toList());
		System.out.println(odds);
		
		//create a string of elements seperate by comma , consisting of even numbers more than 2 from the nos list
		
		String s= nos.stream()
				.filter(element -> element%2 ==0 && element >2)
				.map(element -> element.toString())
				.collect(Collectors.joining(","));
		System.out.println(s);
		
		//create a new list
		// elements more than 4 from the nos list
		// squared up each of the elements
		// sorted in the descending order
		
		List<Integer> m = nos.stream()
				.distinct()
				.filter(element -> element > 4)
				.map(element ->element*element)
				.sorted(Comparator.reverseOrder())
				
				.collect(Collectors.toList());
		System.out.println(m);
		
		//source data
		int[]n= {6,4,5,9,10,3,4,8};
		//stream<Integer> intstream = Arrays.sttream(n);
		IntStream intstream = Arrays.stream(n);
		//build up stream from specific values
		Stream<Integer>st = Stream.of(5,4,8,9,2,8);
		
		//empty stream
		
		Stream stream1 = Stream.empty();		
		//create a new list consisting of odd numbers more than 3 from the nos list
		//print the new list
		/*nos.forEach(n ->{
			if(n%2!=0 && n>3) {
				System.out.println(n);
			}
		});*/
	}

}
