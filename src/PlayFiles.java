import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

public class PlayFiles {

	public static void main(String[] args) {
		String filepath="D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java";
				
				//check if the file exists or no
		System.out.println(Files.exists(Path.of(filepath)));
		
		String doesNotExistPath="D:\\Eclipse\\First Project\\src\\AdvancedArrayList.java";
		System.out.println(Files.exists(Path.of(filepath)));
		//check if its directory or a regular file
		System.out.println(Files.isRegularFile(Path.of(filepath)));
		String dirPath ="D:\\Eclipse\\First Project\\src";
		System.out.println(Files.isDirectory(Path.of(dirPath)));
		
		System.out.println("ALL FILES IN THE SRC DIRECTORY");
		//list all the files in the src directory just list till depth 1
		
		/*Stream<Path> paths = null;
		try {
			paths=Files.list(Path.of(dirPath));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		paths.forEach(path -> System.out.println(path.getFileName()));
		paths.close();*/
		try(Stream<Path> files = Files.list(Path.of(dirPath))){
			files.forEach(path -> System.out.println(path.getFileName()));
			
			//only resources implementing the AutoCLoseable interface can be put in try-with-resources
			//once the try block is done, files stream will be auto closed!
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println("*******All Files in the src directory recursive****");
		//listing all files  directories in src folder recursively
		try(Stream<Path> recursiveStream = Files.walk(Path.of(dirPath))){
			recursiveStream
			.filter(path-> Files.isRegularFile(path))
			.forEach(path -> System.out.println(path.getFileName()));
		}
			catch (IOException e) {
				throw new RuntimeException(e);
			}
		
		 
		
				

	}

}
