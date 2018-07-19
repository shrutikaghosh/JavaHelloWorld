import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 * 
 */

/**
 * @author SGhosh
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Hello, what is your name");	
	    String name = reader.readLine();
	    //inputStream = System.console().readLine();
		int age = getAge(reader, name);
		
		System.out.println("Hello" + name + " ,Your age is " + age);

	}

	private static int getAge(BufferedReader reader, String name) throws IOException {
		String inputStream;
		System.out.println("Hello " + name + "What is your age?");	
		inputStream =reader.readLine();
		return Integer.parseInt(inputStream); 
	}

}
