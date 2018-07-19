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
	    String inputStream = null;
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Hello, what is your name");	
	    String name=null;
		name = reader.readLine();
		
	    //inputStream = System.console().readLine();
		System.out.println("Hello " + name + "What is your age?");	
		inputStream =reader.readLine();
		System.out.println("What are your interests?");	
		String interest = inputStream =reader.readLine();
		System.out.println(interest);	
	}

}
