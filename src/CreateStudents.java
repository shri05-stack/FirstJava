import com.globalpayex.college.entities.StudentOld;

public class CreateStudents {
	public static void main(String[]args) {
		System.out.println(StudentOld.count);
		
		StudentOld s1= new StudentOld("Ravi",'m',57,90f);
		
		StudentOld s2= new StudentOld("pratik",'m',57,90f);
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.roll);
		System.out.println(s1.marks);
		
		s1.name ="Shrijan";
		s1.gender='m';
		s1.roll=32;
		s1.marks=10;
		s2.name ="jane";
		s2.gender ='f';
		s2.marks =67;
		s2.Roll =13;
		System.out.println(s1.name);
		System.out.println(s2.name);*/
		System.out.println(StudentOld.count);
		StudentOld s3= new StudentOld("Ravi",'m',57,90f);
		
		System.out.println(s1.getDetails());
		
		
	}
	


}
