package stringprocessor;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * The Class StringProcessor.
 */
public class StringProcessor {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Type File Name: ");
//		String filename = scan.nextLine();
		String filename = "input.txt";
		System.out.println("Processing [" + filename + "] ing...");
		
		CommandProcessor cm = new CommandProcessor(filename);
		cm.run();
		System.out.println("Completed [" + filename + "]");
		
		
	}

}
