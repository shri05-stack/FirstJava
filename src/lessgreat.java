
public class lessgreat {
	static char lessgreat(float marks) {
		char grade='I';
		if (marks<0||marks>100) {
			grade='I';
		}
		else if(marks>=70){
			grade ='A';
		}
		else if(marks>=60) {
			grade ='B';
		}
		return grade;
	}
	public static void main (String[]args) {
		int marks =56;
		System.out.println(lessgreat(marks));
	}

}
