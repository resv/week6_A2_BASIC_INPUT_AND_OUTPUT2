/*	WEEK 6 ASSIGNMENT 2 - BASIC INPUT AND OUTPUT 2
	BASIC INPUT AND OUTPUT EXERCISE 2
	6.	Create two files and name them: puzzle.txt and puzzle2.txt. Inside puzzle.txt, write the following text:

		MWTaahyiebt_e,c__hnyaoontuc;'e_rste_r_aynr_oert_e_gasoduoipdnp_got_shoeandtl__yty_oot_uhrree__apTdrH_oItgRhrDia_sml__eowtnotere.kr_ss_.
	
		Inside puzzle2.txt, write the following text:
		WTTohhriikssi__niigss,___ttbhhueet___wryrioogunh'gtr__emm_eessshssoaawggieen__gff_rrtoohmme___sswaarmmoppnllgee_22o..nttexxstt

		Open a file specified by the user. This file will contain a bunch of characters. You should 
		read in each character from the file, one character at a time. Display every third character 
		on the screen. Throw the other characters away.
		There is a sample input file called puzzle.txt, containing a little message you can use to 
		test your program.
		Sample Output:
		Open which file: puzzle2.txt
		This_is_the_right_message_from_sample2.txt


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
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2_6 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("\r\nQUESTION 6--------------------------------------------------------");
		
		//INITILIZE SCANNER
		Scanner scanner = new Scanner(System.in);
		
		//INSTRUCTIONS FOR THE USER
		System.out.println("Hello, which file would you like to open?");
		System.out.println("A. puzzle.txt \r\nB. puzzle2.txt");
		String choice = scanner.nextLine();

			
		//GET CHOICE FROM USER
		switch (choice.toLowerCase()) {
		case "a" :	puzzle();
					break;
		case "b" :	puzzle2();
					break;
	
		}
		//CLOSES SCANNER
		scanner.close();
	}



	private static void puzzle() throws FileNotFoundException {
		
		//INITIALIZE ARRAYLIST, FILE ADDRESS, AND SCANNER
		List<String> arr = new ArrayList<>();
		File puzzleFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
													+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\puzzle.txt");
		Scanner puzzleReader= new Scanner(puzzleFile);
		
		//SEPERATE EACH LETTER INTO AN ELEMENT INTO AN ARRAY
		String[] data = puzzleReader.nextLine().split("");
		
		//FOR LOOP TO ADD EACH SPLIT STRING/CHAR INTO ARRAYLIST
		for (int i = 0; i < data.length; i+=3) {
			arr.add(data[i]);
		}
		
		//APPENDS ARRAYLIST ELEMENTS
		String join = String.join("",arr);
		
		//PRINTS JOINED ARRAYLIST
		System.out.println(join);
		
		//CLOSES READER
		puzzleReader.close();
	}
	
	private static void puzzle2() throws FileNotFoundException {
		//INITIALIZE ARRAYLIST, FILE ADDRESS, AND SCANNER
		List<String> arr2 = new ArrayList<>();
		File puzzleFile2 = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
															+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\puzzle2.txt");
		Scanner puzzleReader2= new Scanner(puzzleFile2);
		
		//SEPERATE EACH LETTER INTO AN ELEMENT INTO AN ARRAY
		String[] data2 = puzzleReader2.nextLine().split("");
				
		//FOR LOOP TO ADD EACH SPLIT STRING/CHAR INTO ARRAYLIST
		for (int i = 0; i < data2.length; i+=3) {
			arr2.add(data2[i]);
		}
				
		//APPENDS ARRAYLIST ELEMENTS
		String join2 = String.join("",arr2);
				
		//PRINTS JOINED ARRAYLIST
		System.out.println(join2);
				
		//CLOSES READER
		puzzleReader2.close();
	}
}
