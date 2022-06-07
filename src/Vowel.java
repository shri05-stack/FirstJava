
public class Vowel {
	static boolean isVowel(char ch) {
		switch(ch) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			return true;
		default:
			return false;
			
		
		}
	}
	public static void main(String[]args) {
		char c='e';
		System.out.println(isVowel(c));
	}
	

}

