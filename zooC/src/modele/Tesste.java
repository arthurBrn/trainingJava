package modele;

import java.util.Scanner;

public class Tesste {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int family;
		int q2;
		String q3;
		int cpt = 1;

		do {
			System.out.println("There are 5 important family :");
			System.out.println("1. Lannister");
			System.out.println("2. Stark");
			System.out.println("3. Greyjoy");
			System.out.println("4. Targaryen");
			System.out.println("5. Baratheon");

			System.out.println("Which one are your from ? (answer with a number)");
			family = clavier.nextInt();

			if(family == 1) {

				System.out.println("Alright, look at that list of song :");
				System.out.println("1. The rains of castamere");
				System.out.println("2. The normal rain");
				System.out.println("3. Renault");
				System.out.println("Which one is your family song ? (answer with a number)");
				q2 = clavier.nextInt();
				if(q2 == 1) {
					System.out.println("I've a lot on my mind but won't tell much");
				}
				else {
					System.out.println("You don't even know that you inbread person");
				}
			}
			else if(family == 2) {
				System.out.println("Alright, look at those moto :");
				System.out.println("1. Familly, duty and all");
				System.out.println("2. Travail, famille, party");
				System.out.println("3. Winter is coming");
				System.out.println("Which one is the Stark motto?");
				q2 = clavier.nextInt();
				if(q2 == 3) {
					System.out.println("YOU GOD DAMN RIGHT");
				}
				else {
					System.out.println("The fuck it is not");
				}
			}
			else if(family == 3) {
				System.out.println("Look at those moto :");
				System.out.println("1. What is dead may nerver die");
				System.out.println("2. What is dead is dead hein");
				System.out.println("3. What's not dead will die");
				System.out.println("Which one is the one of house greyjoy?");
				q2 = clavier.nextInt();
				if(q2 == 1) {
					System.out.println("You got that right for once");
				}
				else {
					System.out.println("Even that you can't get it right");
				}
			}
			else if(family == 4) {
				System.out.println("Look at those moto :");
				System.out.println("1. Blood and fire ");
				System.out.println("2. Fire and blood");
				System.out.println("3. A litlle bit of both");
				System.out.println("Which one is the one of house Targaryen?");
				q2 = clavier.nextInt();
				if(q2 == 2) {
					System.out.println("Burn the damn thing to the ground already");
				}
				else {
					System.out.println("USERPEUR");
				}
			}
			else if(family == 5) {
				System.out.println("Look at the following list");
				System.out.println("1. A wolf");
				System.out.println("2. A deer");
				System.out.println("3. A dragon");
				q2 = clavier.nextInt();
				if(q2 == 2) {
					System.out.println("Yeah, well let's hope gendry do something of this name");
				}
				else {
					System.out.println("Yeah right, you poor fool");
				}
			}
			else {
				System.out.println("WHAT");		
			}

			System.out.println("Voulez-vous recommencer? 1/2");
			q2 = clavier.nextInt();
			if(q2 == 1) {
				cpt = 0;
			}
			else {
				System.out.println("Merci d'avoir jouer !");
				cpt = cpt + 100;
			}

		} while(cpt == 0);

	}
}