import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilePlusMethodExecutorService {
	public static void main(String[] args) {
		ExecutorService executorservice= Executors.newSingleThreadExecutor();
		executorservice.execute(()->{
			Path source =Paths.get("D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java");
			Path destination =Paths.get("D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\destination");
			
			try {
				Files.copy(source,destination, StandardCopyOption.REPLACE_EXISTING);
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
			System.out.println("FILE COPIED");
		});
		
		int n=30;
		MathSeries mathseries = new MathSeries(new Random());
		System.out.println(mathseries.fibo(n));
		System.out.println("Fibo series!!!");
		
		executorservice.shutdown();
		
	}

}
