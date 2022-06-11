import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.globalpayex.college.entities.Student;

public class SearchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(10, new Student("mehul", 'm', 10, 98));
		map.put(13, new Student("jane", 'f', 13, 78));
		map.put(10, new Student("rock", 'm', 15, 80));
		map.put(10, new Student("john", 'm', 11, 90));
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		Collection<Student> students = map.values();
		System.out.println(students);
		System.out.println(map.containsKey(13));
		
		Set<Map.Entry<Integer, Student>> entries = map.entrySet();
		for(Entry<Integer, Student> entry : entries) {
			System.out.println(entry.getValue().name);
			System.out.println(entry.getKey());
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter roll number to search:");
		int roll = scanner.nextInt();
		boolean isFound = map.containsKey(roll);
		System.out.println(isFound ? "Student found": "Student not found");
		Student student = map.get(roll);
		if(student!=null) {
			System.out.println(student.getDetails());
		} else {
			System.out.println("student not found");
		}


	}

}
