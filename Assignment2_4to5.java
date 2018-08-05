/*	WEEK 6 ASSIGNMENT 2 - BASIC INPUT AND OUTPUT 2
	BASIC INPUT AND OUTPUT EXERCISE 2
	
	4.	Create a file named: num1.txt and insert integers separated by some white space. Write a 
		program that reads three integers from the file nums.txt and displays (on the screen) the 
		total of the integers.
*/

package week6_A2_BASIC_INPUT_AND_OUTPUT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2_4to5 {

	public static void main(String[] args) throws IOException {	
		//QUESTION 4 PRINTING TOTAL VALUES OF 3 RANDOM SPACED OUT INTEGERS FROM A FILE
		addThree();
		
		//QUESTION 5 (USER CHOOSES FROM 3 FILES, ADD AND RETURN THE RANDOM SPACED INTEGERS
		pickOne();
	}
	
//--QUESTION 4 METHOD (SCANNER ADDED 3 INTEGERS, SPLIT SPACED FROM FILE,
//--LOOPED TO ADD INTO ARRAYLIST THEN ADDED ALL ELEMENTS OF THE ARRAYLIST
	private static void addThree() throws FileNotFoundException {
		System.out.println("QUESTION 4--------------------------------------------------------");
		
		//INITIALIZING VARIABLES, SCANNER, ARRAY, ARRAYLIST
		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												   + "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\num1.txt");
		Scanner Q4Scanner = new Scanner(readin);
		String[] data;
		List<Integer> arr = new ArrayList<>();
		int total = 0;

		//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
		while (Q4Scanner.hasNextLine()) {
			data = (Q4Scanner.next().split(" "));
			for (int i = 0; i < data.length; i++) {
				arr.add(Integer.parseInt(data[i]));
			}
		}

		//FORLOOP TO ADD ARRAYLIST ELEMENTS
		for (int k = 0; k < arr.size(); k++) {
			total += arr.get(k);
		}

		//PRINTING OUT RESULTS TO USER
		System.out.println("File consisted of random spaces between 3 numbers : " + arr);
		System.out.println("If we add them, the sum is : " + total);

		//CLOSES SCANNER
		Q4Scanner.close();
	}
	
//--QUESTION 5 (PICKONE) 
	private static void pickOne() throws FileNotFoundException {
		System.out.println("\r\nQUESTION 5--------------------------------------------------------");
		
		//INSTRUCTIONS FOR THE USER
		System.out.println("Hello, which file would you like to read and get total sum for?");
		System.out.println("A. num2.txt \r\nB. num3.txt \r\nC. num4.txt\r\n(Choose a letter)");
			
		//INITIALIZE VARIABLES BEING USED FOR THE SWITCH CASE STATEMENT
		String Q5path = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
													+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\";
		Scanner Q5scanner = new Scanner(System.in);
		String choice = Q5scanner.next();
		String[] Q5data;
		List<Integer> Q5arr = new ArrayList<>();
		int Q5total = 0;
		
		
		//SWITCH STATEMENT TAKES USER'S CHOICE AND SELECTS FILE ACCORDINGLY
		//DO NOT GET OVERWHELMED WITH THIS SWITCH CASE STATEMENT AS
		//ALL CHOICES ARE THE SAME EXCEPT VARIABLE NAME DIFFERENCES AND FILE PATH
		switch (choice.toLowerCase()) {
			case "a" :	//INITIALIZE ABSOLUTE FILE ADDRESS AND FILE SCANNER
						File Q5file2 = new File(Q5path + "num2.txt");
						Scanner Q51FileScanner2 = new Scanner(Q5file2);
									
						//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
						while (Q51FileScanner2.hasNextLine()) {
							Q5data = (Q51FileScanner2.next().split(" "));
							for (int i = 0; i < Q5data.length; i++) {
								Q5arr.add(Integer.parseInt(Q5data[i]));
							}
						}
						
						//USING FOR LOOP TO ADD EACH ELEMENT IN THE ARRAY 
						for (int k = 0; k < Q5arr.size(); k++) {
							Q5total += Q5arr.get(k);
						}
			
						//PRINTING OUT RESULTS TO USER
						System.out.println("File consisted of random spaces between 3 numbers : " + Q5arr);
						System.out.println("They add up to : " + Q5total);
			
						//CLOSES SCANNER
						Q51FileScanner2.close();
						break;
				
			case "b" : 	//INITIALIZE ABSOLUTE FILE ADDRESS AND FILE SCANNER
						File Q5file3 = new File(Q5path + "num3.txt");
						Scanner Q51FileScanner3 = new Scanner(Q5file3);
									
						//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
						while (Q51FileScanner3.hasNextLine()) {
							Q5data = (Q51FileScanner3.next().split(" "));
							for (int i = 0; i < Q5data.length; i++) {
								Q5arr.add(Integer.parseInt(Q5data[i]));
							}
						}
						
						//USING FOR LOOP TO ADD EACH ELEMENT IN THE ARRAY 
						for (int k = 0; k < Q5arr.size(); k++) {
							Q5total += Q5arr.get(k);
						}
			
						//PRINTING OUT RESULTS TO USER
						System.out.println("File consisted of random spaces between 3 numbers : " + Q5arr);
						System.out.println("They add up to : " + Q5total);
			
						//CLOSES SCANNER
						Q51FileScanner3.close();
						break;
						
			case "c" :	//INITIALIZE ABSOLUTE FILE ADDRESS AND FILE SCANNER
						File Q5file4 = new File(Q5path + "num4.txt");
						Scanner Q51FileScanner4 = new Scanner(Q5file4);
									
						//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
						while (Q51FileScanner4.hasNextLine()) {
							Q5data = (Q51FileScanner4.next().split(" "));
							for (int i = 0; i < Q5data.length; i++) {
								Q5arr.add(Integer.parseInt(Q5data[i]));
							}
						}
						
						//USING FOR LOOP TO ADD EACH ELEMENT IN THE ARRAY 
						for (int k = 0; k < Q5arr.size(); k++) {
							Q5total += Q5arr.get(k);
						}
			
						//PRINTING OUT RESULTS TO USER
						System.out.println("File consisted of random spaces between 3 numbers : " + Q5arr);
						System.out.println("They add up to : " + Q5total);
			
						//CLOSES SCANNER
						Q51FileScanner4.close();
						break;	
		}
		Q5scanner.close();
	}
}
