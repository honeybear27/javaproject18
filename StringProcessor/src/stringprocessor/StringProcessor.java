package stringprocessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StringProcessor {

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
