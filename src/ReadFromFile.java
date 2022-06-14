import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFile {

	public static void main(String[] args) {
		String filePath = "D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java";
		
		//read from above file
		try (Stream<String> lines=  Files.lines(Path.of(filePath))){
			lines.forEach(System.out::println);
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
		
		//read from above file in one go
		try {
		List<String> lines = Files.readAllLines(Path.of(filePath));
		System.out.println(lines);
		}
		catch(IOException e) {
			throw new RuntimeException(e);
		}
		//write a program to copy the files to your java code
		
		String targetSource="D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java";
	
		try{
			Path copyFiles= Files.copy(Path.of(filePath), Path.of(targetSource));
			System.out.println();
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
				
		
		

	}

}
