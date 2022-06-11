import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Student;

public class StudentStream {

	public static void main(String[] args) {
		List<Student> students= Arrays.asList(
				 new Student("mehul", 'm', 10, 98),
				 new Student("jane", 'f', 13, 78),
				 new Student("rock", 'm', 15, 80),
				 new Student("john", 'm', 11, 90)
				 );
		
		//find names of all the students comma separated , who have scored more than 80 marks
		//stream API
		
		String str = students.stream().filter(element -> element.marks >80)
				.map(element -> element.name)
				.collect(Collectors.joining(","));
		System.out.println(str);
				
				
				
				
		

	}

}
