import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput {

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number n:");
		try {
		
		int n = scanner.nextInt();	
		System.out.println(n%2 ==0 ? "it is even": "it is odd");
		} catch (InputMismatchException e) {
			System.out.println("please enter only integer value");
			
		}
		
		scanner.close();
		System.out.println("program ended");
	}
}
