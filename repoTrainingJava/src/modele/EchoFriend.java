/*
 * # Class : EchoFriend 
 * # Purpos : exercise on String - repeating the input with no end
 * 
 * Frist class coded for several months, with no heavy back-ground in java programming so
 * */
package modele;

import java.util.Scanner;

public class EchoFriend {


	public static void main(String args[]) {
		/*We declare a new instance of the object scanner */
		Scanner sc = new Scanner(System.in);
		/*'cpt' used in the while loop as a counter*/
		int cpt = 0;
		/*'eco' used above and in the while to stock the answers of the user(s)*/
		String eco="";

		/*We ask a rethorical question to the user*/
		System.out.println("On joue à écho ??");
		/*We stock his response thanks to nextLine() function*/
		eco = sc.nextLine();
		/*We lunch a while loop that will last until cpt is different from 0, so for now she'll last forever*/
		while(cpt == 0) {
			/*In this loop we print back the user response*/
			System.out.println(eco);
			/*Then we stock the new resopnse*/
			eco = sc.nextLine();

		} 
	}
}
