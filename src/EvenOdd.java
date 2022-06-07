
public class EvenOdd {
	static boolean isEven(int n) {
		return n%2==0; 
	}
	public static void main(String[]args) {
		int n=12;
		if(isEven(n)) {
			System.out.println("It is Even");
		} else {
			System.out.println("it is odd");
		}
		System.out.println(isEven(n)? "it is even":"it is odd");
	}
}


