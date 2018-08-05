/*	WEEK 6 ASSIGNMENT 2 - BASIC INPUT AND OUTPUT 2
	BASIC INPUT AND OUTPUT EXERCISE 2
	7.	CREATE A FILE CRAZYTEXT.TXT AND WRITE THE FOLLOWING TEXT:
		Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
		tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
		quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
		consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
		cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
		proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
	
		Create a second file CrazyTextModified.txt and it should be empty initially.
		Write a program that would reads the text in CrazyText.txt and output it to 
		CrazyTextModified.txt with every vowel capitalize.
*/

package week6_A2_BASIC_INPUT_AND_OUTPUT2;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2_7 {

	public static void main(String[] args) throws IOException {

		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
				+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\CRAZYTEXT.TXT");
		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
				+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\CrazyTextModified.txt");

		Scanner reader = new Scanner(readin);
		String[] data;

		// USING WHILE LOOP TO SPLIT SPACES AND ADD INTEGERS INTO AN ARRAY
		while (reader.hasNextLine()) {
			data = reader.next().split("");
			for (int i = 0; i < data.length; i++) {
				if (data[i].equalsIgnoreCase("a")){
					data[i] = "A";
				} else if (data[i].equalsIgnoreCase("e")){
						data[i] = "E";
				}else if (data[i].equalsIgnoreCase("i")){
					data[i] = "I";
				}else if (data[i].equalsIgnoreCase("o")){
					data[i] = "O";
				}else if (data[i].equalsIgnoreCase("u")){
					data[i] = "U";
				}
			}
			
			for (int i = 0; i < data.length; i++) {
				while (i < data.length) {
					System.out.printf(data[i]);
					i++;
				}
				System.out.printf(" ");
			}
		}
		reader.close();
	}
}
