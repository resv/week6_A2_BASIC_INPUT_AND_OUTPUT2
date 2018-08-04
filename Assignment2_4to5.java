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
//--QUESTION 4 PRINTING TOTAL VALUES OF 3 RANDOM SPACED OUT INTEGERS FROM A FILE
		addThree();
		
//--QUESTION 5 
		pickOne();
	}
	
	//--QUESTION 4 METHOD (SCANNER ADDED 3 INTEGERS, SPLIT SPACED FROM FILE,
//--LOOPED TO ADD INTO ARRAYLIST THEN ADDED ALL ELEMENTS OF THE ARRAYLIST
	private static void addThree() throws FileNotFoundException {
		System.out.println("QUESTION 4--------------------------------------------------------");
		
		//INITIALIZING VARIABLES, SCANNER, ARRAY, ARRAYLIST
		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
													+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\num1.txt");
		Scanner scanner = new Scanner(readin);
		List<Integer> arr = new ArrayList<>();
		String[] data;
		int total = 0;

		//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
		while (scanner.hasNextLine()) {
			data = (scanner.next().split(" "));
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
		scanner.close();
	}
	
//--QUESTION 5 (PICKONE) 
	private static void pickOne() throws FileNotFoundException {
		System.out.println("\r\nQUESTION 5--------------------------------------------------------");
		
		String pathQ5 = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
													+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\";
				
		System.out.println("Hello, which file would you like to read and get total sum for?");
		System.out.println("A. num2.txt \r\nB. num3.txt \r\nC. num4.txt\r\n(Choose a letter)");
			
		Scanner scannerQ5 = new Scanner(System.in);
		String choice = scannerQ5.next();
		
		
		switch (choice.toLowerCase()) {
			case "a" :	File fileQ5 = new File(pathQ51 + "num2.txt");
				
						Scanner fileScannerQ51 = new Scanner(fileQ51);
						List<Integer> arrQ51 = new ArrayList<>();
						String[] dataQ51;
						int totalQ51 = 0;
			
						//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
						while (fileScannerQ51.hasNextLine()) {
							dataQ51 = (fileScannerQ51.next().split(" "));
							for (int i = 0; i < dataQ51.length; i++) {
								arrQ51.add(Integer.parseInt(dataQ51[i]));
							}
						}
						
						for (int k = 0; k < arrQ51.size(); k++) {
							totalQ51 += arrQ51.get(k);
						}
			
						//PRINTING OUT RESULTS TO USER
						System.out.println("File consisted of random spaces between 3 numbers : " + arrQ51);
						System.out.println("They add up to : " + totalQ51);
			
						//CLOSES SCANNER
						fileScannerQ51.close();
						scannerQ51.close();
						break;
				
			case "b" : 	File fileQ52 = new File(pathQ52 + "num3.txt");
			
						Scanner fileScannerQ52 = new Scanner(fileQ52);
						List<Integer> arrQ52 = new ArrayList<>();
						String[] dataQ52;
						int totalQ52 = 0;
			
						//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
						while (fileScannerQ52.hasNextLine()) {
							dataQ52 = (fileScannerQ52.next().split(" "));
							for (int i = 0; i < dataQ52.length; i++) {
								arrQ52.add(Integer.parseInt(dataQ52[i]));
							}
						}
						
						for (int k = 0; k < arrQ52.size(); k++) {
							totalQ52 += arrQ52.get(k);
						}
			
						//PRINTING OUT RESULTS TO USER
						System.out.println("File consisted of random spaces between 3 numbers : " + arrQ52);
						System.out.println("They add up to : " + totalQ52);
			
						//CLOSES SCANNER
						fileScannerQ52.close();
						scannerQ52.close();
						break;
						
			case "c" :	File fileQ53 = new File(pathQ53 + "num4.txt");
						
						Scanner fileScannerQ53 = new Scanner(fileQ53);
						List<Integer> arrQ53 = new ArrayList<>();
						String[] dataQ53;
						int totalQ53 = 0;
			
						//USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
						while (fileScannerQ53.hasNextLine()) {
							dataQ53 = (fileScannerQ53.next().split(" "));
							for (int i = 0; i < dataQ53.length; i++) {
								arrQ53.add(Integer.parseInt(dataQ53[i]));
							}
						}
						
						for (int k = 0; k < arrQ53.size(); k++) {
							totalQ53 += arrQ53.get(k);
						}
			
						//PRINTING OUT RESULTS TO USER
						System.out.println("File consisted of random spaces between 3 numbers : " + arrQ53);
						System.out.println("They add up to : " + totalQ53);
			
						//CLOSES SCANNER
						fileScannerQ53.close();
						scannerQ53.close();
						break;		
		}
	}
}
