import com.globalpayex.college.entities.StudentOld;

public class studentarray {
	public static void main(String[] args) {
        StudentOld s1= new StudentOld();
		
		StudentOld s2= new StudentOld();
		
		
		s1.name ="Pratik";
		s1.gender='m';

		s1.Roll=32;
		s1.marks=10;
		s2.name ="prakash";

		
 
		s2.gender ='f';
		s2.marks =93;
		s2.Roll =13;
		StudentOld[] bikes= {s2,s1};
		for(int i=0;i<bikes.length-1;i++) {
			System.out.println(bikes[i].name+bikes[i].gender);
		}
	}


}
