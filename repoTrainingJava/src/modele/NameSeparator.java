/*
 * # Class : NameSeparator
 * # Purpos : exercise on String - Take a name, split it in two and return it
 * 
 * # Left to do : Turn that class into a method which will take a String and return one
 * */
package modele;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NameSeparator {


	public static void main(String[] args) throws IOException {
		/* Scanner sc = new Scanner(System.in);
	    String firstName="";
	    String lastName="";
	    String fullName="";
	    String names[] = new String[2];

	    System.out.println("Entrez votre nom et pr�nom :");
	    fullName = sc.nextLine();
	    names = fullName.split(" ");
	    firstName = names[0];
	    lastName = names[1];
	    System.out.println("Full name: "+fullName+" First name :"+firstName+" Last Name :"+lastName);

	}*/

		String Fullname , Firstname , Lastname;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Full Name");
		Fullname = input.nextLine();

		StringTokenizer st = new StringTokenizer(Fullname, " ");
		Firstname = st.nextToken();
		Lastname = st.nextToken();
		System.out.println("First Name: "+Firstname);
		System.out.println("Last Name: "+Lastname);
	}
	
}
