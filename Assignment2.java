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

		       		
*/
//		---------------------------------------------------------------------------------------------------

		
package week6_A2_BASIC_INPUT_AND_OUTPUT2;

public class Assignment2 {

	public static void main(String[] args) {

		//QUESTION #1 METHOD WITH PARAMETERS (INFO IS FAKE, PLEASE DON'T DOX IT!)
		displayLetter("Adam Kim", "123-56 78th ave", "Bayside", "NY", "11111");
	}	
	
	//QUESTION 1 METHOD CONSTRUCTOR
	private static void displayLetter(String name, String address, String city, String state, String zipcode) {
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
}
