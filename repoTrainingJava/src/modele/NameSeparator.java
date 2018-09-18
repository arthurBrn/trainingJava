/*
 * # Class : NameSeparator
 * # Purpos : exercise on String - The user enter a name, which is processed by the conformity method which decide wether or not the name is conform
 * 			  The method return the boolean 'outcome'
 * */
package modele;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NameSeparator {
	public static boolean conformity(String fullName) {
		//Declaration of three String variable
		String firstName , lastName;
		boolean outcome=false;
		
		/*
		 * If fullName is either empty nor null set outcome as false. End the program there.
		 * */
		if(fullName.isEmpty() || fullName==null) {
			outcome=false;
		}
		else {
			//We create a new instance of StringTokenizer named 'st', which will separate the user input as soon as there is a blank " " detected.
			StringTokenizer st = new StringTokenizer(fullName, " ");
			firstName = st.nextToken();//We place the first part of the user input in 'Firstname' thanks to to the nextToekn() method
			lastName = st.nextToken();//We place the second part of the user input in 'LastName' thanks to the nextToken() method 

			/*
			 * We create condition if with two regex which are the same and would probably be more practicable through the forme of a single pattern.
			 * [A-Za-z]* --> mean that only the letter between 'a' and 'z' are accepted, maj or min, the '*' mean that there can be several of them
			 * If those condition are true we set 'outcome' as true 
			 * Else we set 'outcome' as false 
			 * */
			if(firstName.matches("[A-Za-z]*") && lastName.matches("[A-Za-z]*")) {
				outcome=true;
			}
			else {
				outcome=false;
			}	
		}
		return outcome; //We return outcome
	}

	public static void main(String[] args) throws IOException {
		String name;
		//We create a new instance of the Scanner object named 'output', which will allow us to recover the user input
		Scanner output = new Scanner(System.in);
		System.out.println("Enter your full name : ");
		name = output.nextLine(); //We place the user input inside the String variable 'name'
		//We display the outcome of the user input after being pass through the conformity method
		System.out.println("Your String is conform : " + conformity(name));


	}

}
