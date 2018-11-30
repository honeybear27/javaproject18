package stringprocessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CommandProcessor {
	private String filename;

	public CommandProcessor(String filename) {
		this.filename = filename;
	}

	public void run() throws FileNotFoundException {
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		
		String input1;
		String input2;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] splited = line.split("<SEP>");
			splited[0] = splited[0].trim();
			
			input1 = splited.length < 2 ? "" : splited[1].trim();
			input2 = splited.length < 3 ? "" : splited[2].trim();
			switch (splited[0]) {
			case "countYZ":
				System.out.println(splited[0] + "(\"" + input1 + "\") -> " + StringMethod.countYZ(input1));
				break;
			case "withoutString":
				System.out.println(splited[0] + "(" + input1 +", " + input2 + ") -> " + StringMethod.withoutString(input1, input2));
				
				break;
			case "equalIsNot":
				System.out.println(splited[0] + "(" + input1 + ") -> " + StringMethod.equalIsNot(input1));
				break;
			case "startWord":
				System.out.println(splited[0] + "(" + input1 + ") -> " + StringMethod.startWord(input1, input2));
				break;
			case "nTwice":
				System.out.println(splited[0] + "(\"" + input1 + "\") -> " + StringMethod.nTwice(input1, Integer.valueOf(input2)));
				break;
			case "twoChar":
				System.out.println(splited[0] + "(" + input1 + ") -> " + StringMethod.twoChar(input1, Integer.valueOf(input2)));
				break;
			case "comboString":
				System.out.println(splited[0] + "(" + input1 + ", " + input2 + ") -> " + StringMethod.comboString(input1, input2));
				break;
			case "theEnd":
				System.out.println(splited[0] + "(" + input1 + ") -> " + StringMethod.theEnd(input1, Boolean.valueOf(input2)));
				break;
			case "withoutX":
				System.out.println(splited[0] + "(" + input1 + ") -> " + StringMethod.withoutX(input1));
				break;
			case "endsLy":
				System.out.println(splited[0] + "(" + input1 + ") -> " + StringMethod.endsLy(input1));
				break;
			
			case "":
				break;
			default:
				System.out.println("Cannot find command[" + splited[0] + "]");
			}
			
//			for (String s : splited) {
//				System.out.print("[" + s.trim() + "] ");
//			}
		}
		scan.close();
	}
}
