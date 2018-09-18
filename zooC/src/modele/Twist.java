package modele;

import java.util.Scanner;
//import java.util.StringTokenizer;
//import java.util.regex.Pattern;

public class Twist {

	// ###### Classe de test pour traitement de String() ######


	// ###### méthode split();
	public static void main(String args[ ])	{
		Scanner output = new Scanner(System.in);

		String firstName="";
		String lastName="";
		String fullName="";
		String name[] = new String[2];
		int cpt=0;

		//On a créé un array string de 2
		//Maintenant on va spliter la chaine en 2 grâce à la méthode split, on lui indiquera de spliter à partir de " "
		//On mettre ensuite la première case du array name dans firstName 
		//Puis la seconde case du array name dans lastName:

		System.out.println("Entrez votre nom et prénom");
		fullName = output.nextLine();

		name = fullName.split(" ");
		firstName = name[0];
		lastName = name[1];
		cpt = fullName.length();



		//Méthode StringTokenize(); 
		//String tokenizer permet de spliter une chaine en token à partir d'un point préciser
		//Cette méthode prend en paramètre la chaine sur laquelle il doit travailler et la cractère où il va spliter la chaine

		/*System.out.println("Entrez votre nom et votre prénom");
		fullName = output.nextLine();


		StringTokenizer sc = new StringTokenizer(fullName, " ");
		firstName = sc.nextToken();
		lastName = sc.nextToken();*/


		System.out.println("La chaîne contient : " + cpt + " caractères");
		System.out.println("Your full name is : " + fullName);
		System.out.println("Votre prénom est : " + firstName);
		System.out.println("Votre nom est : " + lastName);

	}

}
