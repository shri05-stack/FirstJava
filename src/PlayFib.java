import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class PlayFib {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		String source ="D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java";
		String destination ="D:\\Eclipse\\First Project\\src";
		
		try {
			Files.copy(Path.of(source), Path.of(destination), StandardCopyOption.REPLACE_EXISTING);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println("FILE COPIED");
		
		//CPU operation code		
		
		int n=30;
		MathSeries mathseries = new MathSeries(new Random());
		System.out.println(mathseries.fibo(n));
		System.out.println("Fibo series!!!");
	}

}
