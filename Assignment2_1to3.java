/*	WEEK 6 ASSIGNMENT 2 - BASIC INPUT AND OUTPUT 2
	BASIC INPUT AND OUTPUT EXERCISE 2

	1.	Write a program that displays your name and address on the console as if it were a letter. 
		Your output should look something like that below.
	+----------------------------------------------------------------+
	|                                                           #### |
	|                                                           #### |
	|                                                           #### |
	|                                                                |
	|                                                                |
	|                                              Bill Gates        |
	|                                         1 Microsoft Way        |
	|                                      Redmond, WA 98104         |
	|                                                                |
	+----------------------------------------------------------------+

	2.	Modify question #1, instead of displaying to the console, output the letter to a .txt file

	3.	Write a program that asks the user for their name and a number. Then store the following 
		message in a file named: score.txt: “[name] got a [number] in the Math test.
*/


//		---------------------------------------------------------------------------------------------------


package week6_A2_BASIC_INPUT_AND_OUTPUT2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2_1to3 {

	public static void main(String[] args) throws IOException {

	//QUESTION #1 METHOD WITH PARAMETERS WHICH PRINTS OUT THE POST CARD TO CONSOLE (INFO IS FAKE, PLEASE DON'T DOX IT!)
		displayLetter("Adam Kim", "123-56 78th ave", "Bayside", "NY", "11111");
		
	//QUESTION #2 MODIFY QUESTION #1, INSTEAD OF DISPLAYING TO THE CONSOLE, OUTPUT THE LETTER TO A TXT FILE
		writeLetter("Adam Kim", "123-56 78th ave", "Bayside", "NY", "11111");
		
	//QUESTION #3 Write a program that asks the user for their name and a number. Then store the following 
	//message in a file named: score.txt: “[name] got a [number] in the Math test.
		writeNameNumber();
	}	

//--QUESTION 1 METHOD (USED STRING FORMAT TO PRINT OUT POST CARD TO CONSOLE)
	private static void displayLetter(String name, String address, String city, String state, String zipcode) {
		System.out.println("QUESTION 1--------------------------------------------------------");
		System.out.println("(PRINTING OUT POST CARD)\r\n");
		String dottedLine = "----------------------------------------------------------------";
		System.out.println(String.format("+%63s%1s" ,dottedLine, "+" ));
		System.out.println(String.format("|%63s%2s","####","|" ));
		System.out.println(String.format("|%63s%2s","####","|" ));
		System.out.println(String.format("|%63s%2s","####","|" ));
		System.out.println(String.format("|%65s","|" ));
		System.out.println(String.format("|%65s","|" ));
		System.out.println(String.format("|%56s%9s",name," |" ));
		System.out.println(String.format("|%56s%9s",address,"|" ));
		System.out.println(String.format("|%47s%3s%6s%9s",city,state,zipcode,"|"));		
		System.out.println(String.format("|%65s","|" ));
		System.out.println(String.format("+%63s%1s" ,dottedLine, "+" ));
	}
	
	
//--QUESTION 2 METHOD (ADDED POSTCARD TO ARRAY, PRINT ARRAY INTO THE TXTFILE)
	private static void writeLetter(String name, String address, String city, String state, String zipcode) throws IOException {
		System.out.println("\r\nQUESTION 2--------------------------------------------------------");
		
		//NOTIFY USER OF WRITE EXECUTION
		System.out.println("(THE POSTCARD HAS BEEN WRITTEN INTO THE 6_2_2.TXT FOUND IN THE FILE_BANK.)");
				
		
		//INITIALIZE ABSOLUTE FILE ADDRESS 
		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\6_2_2.txt");
		
		//*********//IMPORTANT************ TAKE NOTE THAT FILE WRITER HAS AN ADDITIONAL PARAMETER
		//TO CREATE NEW FILE (FALSE) WHILE FALSE WOULD BE TO RECREATE FILE
		FileWriter writer = new FileWriter(writeTo,false);
		
		
		// INSTANCIATE ARRAYLIST & DOTTED LINE STRING
		List<String> arr = new ArrayList<>();
		String dottedLine = "----------------------------------------------------------------";
		
		//ADD VALUES TO ARRAY
		arr.add(String.format("+%63s%1s" ,dottedLine, "+" ));
		arr.add(String.format("|%63s%2s","####","|" ));
		arr.add(String.format("|%63s%2s","####","|" ));
		arr.add(String.format("|%63s%2s","####","|" ));
		arr.add(String.format("|%65s","|" ));
		arr.add(String.format("|%65s","|" ));
		arr.add(String.format("|%56s%9s",name," |" ));
		arr.add(String.format("|%56s%9s",address,"|" ));
		arr.add(String.format("|%47s%3s%6s%9s",city,state,zipcode,"|"));		
		arr.add(String.format("|%65s","|" ));
		arr.add(String.format("+%63s%1s" ,dottedLine, "+" ));
		
		//ITERATE AND PRINT EASY ELEMENT OF ARRAY TO THE TXT FILE, WE CHECK FOR n-1 TO MAKE SURE WE DON'T ADD AN EXTRA LINEBREAK
		for (int i = 0; i < arr.size(); i++) {
			String data = arr.get(i).toString();
			writer.write(data);
			if (i < arr.size()-1) {
				writer.write("\r\n");
			}
		}
		//CLOSING WRITER
		writer.close();
	}
	
//--QUESTION 3 METHOD (ASKS FOR NAME & GRADE, PRINT TO A FILE)
	private static void writeNameNumber() throws IOException {
		System.out.println("\r\nQUESTION 3--------------------------------------------------------");
		
		//INITIALIZE ABSOLUTE FILE ADDRESS 
		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\6_2_3.txt");
		
		//*********IMPORTANT************ TAKE NOTE THAT FILE WRITER HAS AN ADDITIONAL PARAMETER
		//TO CREATE NEW FILE (FALSE) WHILE FALSE WOULD BE TO RECREATE FILE
		//INITIALIZE WRITER & SCANNER
		FileWriter writer = new FileWriter(writeTo,false);
		Scanner reader = new Scanner(System.in);
		
		//INSTRUCTIONS FOR USER
		System.out.println("Hello, what is your name?");
		String name = reader.nextLine();
		System.out.println("Okay got it, and your grade? (0 - 100)");
		int grade = reader.nextInt();
		
		//PRINT VALUES TO THE TXT FILE
		writer.write(name + " got a " + grade + " in the Math test.");
		
		//NOTIFY USER OF WRITE EXECUTION
		System.out.println("([" + name + "]'s grade of [" + grade + "] HAS BEEN WRITTEN INTO THE 6_2_3.TXT FOUND IN THE FILE_BANK.)");
		
		//CLOSING WRITER & SCANNER
		reader.close();
		writer.close();
	}
}
