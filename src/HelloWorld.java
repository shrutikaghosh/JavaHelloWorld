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
	    int calcOption = getCalcOption(reader);
	    
		System.out.print("You selected:" + calcOption + "\n");
		System.out.println("Provide two integers of your choice-\n");
		String number1 = reader.readLine();
		String number2 = reader.readLine();
		
	}

	/**
	 * @param reader
	 * @throws IOException
	 */
	private static int getCalcOption(BufferedReader reader) throws IOException {
		String inputStream;
		System.out.println("Hello ");
		System.out.println("Choose one of the options:\n");
		System.out.println("1.Add:\n");
		System.out.println("2.Subtract\n");
		System.out.println("3.Division\n");
					
		System.out.println("4.Multiplication:\n");
		inputStream = reader.readLine();
		return Integer.parseInt(inputStream);
	}

}
