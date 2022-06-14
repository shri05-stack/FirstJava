import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FilePlusMathsMultithreaded {

	public static void main(String[] args) {
		// send the IO logic for execution on a seperate thread
		Thread thread = new Thread(()->{
			//IO logic
			String source ="D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java";
			String destination ="D:\\Eclipse\\First Project\\src";
			
			try {
				Files.copy(Path.of(source), Path.of(destination), StandardCopyOption.REPLACE_EXISTING);
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
			System.out.println("FILE COPIED");
			
			
		});
		thread.start();//schedules your thread for execution
				
				
				//CPU operation code		
				
				int n=30;
				MathSeries mathseries = new MathSeries(new Random());
				System.out.println(mathseries.fibo(n));
				System.out.println("Fibo series!!!");
			

	}

}
