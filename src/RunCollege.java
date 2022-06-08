import com.globalpayex.college.entities.Student;
import com.globalpayex.college.entities.professor;

public class RunCollege {
public static void main(String[] args) {
	int i=10;
	Student s = new Student("mehul", 'm', 10,90);
	
	String[] subjects= {"physics","chemistry"};
	professor p = new professor("jane",'f',subjects);
	/*System.out.println(i);
	System.out.println(s);
	System.out.println(p);*/
	
	/*System.out.println(s.name);
	System.out.println(s.gender);
	System.out.println(p.name);
	System.out.println(p.gender);*/
	System.out.println(s);
	
	System.out.println(p);
}
}
