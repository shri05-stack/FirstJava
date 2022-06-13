import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Student;
import com.globalpayex.college.entities.address;

public class StudentStream {

	public static void main(String[] args) {
//		List<Student> students= Arrays.asList(
//				 new Student("mehul", 'm', 10, 98, new address("IND", 82660,"JH")),
//				 new Student("jane", 'f', 13, 78, new address("USA",76786,"JH")),
//				 new Student("rock", 'm', 15, 80, new address("USA",65446,"CO"),
//				 new Student("john", 'm', 11, 90, new address("USA",65446,"CO"))
//				 );
//		
				 List <Student> students=Arrays.asList(
				            new Student("hridyes",'m',3,44, new address("MH", 1, "USA")),
				            new Student("rides",'m',2,4,new  address("UK", 3, "IN")),
				            new Student("hdyes",'m',1,94,new address("TN", 5, "BL")),
				            new Student("Jkh",'m',2,45)
				            );
		//print the names of all students comma seperated as a string who belong to the USA country
		String add = students.stream().filter(ele ->ele.getAddress()!=null && ele.getAddress().getCountry().equals("USA"))
				.map(ele->ele.name)
				.collect(Collectors.joining(" ,"));
		System.out.println(add);
				
		//find names of all the students comma separated , who have scored more than 80 marks
		//stream API
		
		String str = students.stream().filter(element -> element.marks >80)
				.map(element -> element.name)
				.collect(Collectors.joining(","));
		System.out.println(str);
		
		//find the average marks scored by all the elements
		//student -> stream -> terminal ?? collectors.??
		double average = students.stream()
				.collect(Collectors.averagingDouble(student -> student.marks));
		System.out.println(average);
		
		//statistics of the marks scored by all the students
		DoubleSummaryStatistics ds = students.stream()
				.collect(Collectors.summarizingDouble(student -> student.marks));
		System.out.println(ds);
		System.out.println(ds.getAverage());
		System.out.println(ds.getMax());
		System.out.println(ds.getMin());
		System.out.println(ds.getSum());
		
		//group the above student list by gender
		Map<Character, List<Student>> genderMap=students.stream()
		.collect(Collectors.groupingBy(student -> student.getGender()));
		System.out.println(genderMap);
		
		// from the above student list make two groups of students
		//1. scored more than or equal 80 marks
		//2. scored less than 80 marks
		Map<Boolean,List<Student>>marksMap=students.stream()
		.collect(Collectors.partitioningBy(student -> student.marks>=80));
		System.out.println(marksMap);
		
		
				
				
				
				
		

	}

}
