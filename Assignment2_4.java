/*	WEEK 6 ASSIGNMENT 2 - BASIC INPUT AND OUTPUT 2
	BASIC INPUT AND OUTPUT EXERCISE 2
	
	4.	Create a file named: num1.txt and insert integers separated by some white space. Write a 
		program that reads three integers from the file nums.txt and displays (on the screen) the 
		total of the integers.
*/

package week6_A2_BASIC_INPUT_AND_OUTPUT2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment2_4 {

	public static void main(String[] args) throws IOException {
	
	//CALL METHOD TO ADD 3 INTEGERS SPACED OUT RANDOMLY
	addThree();
	}

		private static void addThree() throws FileNotFoundException {
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
			System.out.println("If we add them, they become: " + total); 
			
			//CLOSES SCANNER
			scanner.close();
		}
}
