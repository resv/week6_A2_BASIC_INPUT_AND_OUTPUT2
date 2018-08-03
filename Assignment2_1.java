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

	4.	Create a file named: num1.txt and insert integers separated by some white space. Write a 
		program that reads three integers from the file nums.txt and displays (on the screen) the 
		total of the integers.

	5.	Create several more files in Notepad containing three integers separated by some whitespace. 
		Save them in your home directory as "nums2.txt", "nums3.txt", "nums4.txt", etc.

		Then write a program that asks the user which file to open. Then it should open that file, 
		and read the three integers from the file. It should then display (on the screen) the total 
		of the integers.

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

	7.	Create a file CrazyText.txt and write the following text:
	
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
//		---------------------------------------------------------------------------------------------------

		
		
package week6_A2_BASIC_INPUT_AND_OUTPUT2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment2_1 {

	public static void main(String[] args) throws IOException {

		//QUESTION #1 METHOD WITH PARAMETERS WHICH PRINTS OUT THE POST CARD TO CONSOLE 
		//(INFO IS FAKE, PLEASE DON'T DOX IT!)
		displayLetter("Adam Kim", "123-56 78th ave", "Bayside", "NY", "11111");
		
		//QUESTION #2 MODIFY QUESTION #1, INSTEAD OF DISPLAYING TO THE CONSOLE, 
		//OUTPUT THE LETTER TO A .TXT FILE
		writeLetter("Adam Kim", "123-56 78th ave", "Bayside", "NY", "11111");
		
		
		
	}	
	

	//QUESTION 1 METHOD
	private static void displayLetter(String name, String address, String city, String state, String zipcode) {
		System.out.println("QUESTION 1--------------------------------------------------------");
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
	
	
	//QUESTION 2 METHOD (ADDED POSTCARD TO ARRAY, PRINT ARRAY INTO THE TXTFILE
	private static void writeLetter(String name, String address, String city, String state, String zipcode) throws IOException {
		
		//INITIALIZE ABSOLUTE FILE ADDRESS 
		String fileName = "6_2_2.txt";
		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A2_BASIC_INPUT_AND_OUTPUT2\\FILE_BANK\\" + fileName);
		
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
		writer.close();
	}
}
