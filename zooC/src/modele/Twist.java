package modele;

import java.util.Scanner;
//import java.util.StringTokenizer;
//import java.util.regex.Pattern;

public class Twist {

	// ###### Classe de test pour traitement de String() ######


	// ###### m�thode split();
	public static void main(String args[ ])	{
		Scanner output = new Scanner(System.in);

		String firstName="";
		String lastName="";
		String fullName="";
		String name[] = new String[2];
		int cpt=0;

		//On a cr�� un array string de 2
		//Maintenant on va spliter la chaine en 2 gr�ce � la m�thode split, on lui indiquera de spliter � partir de " "
		//On mettre ensuite la premi�re case du array name dans firstName 
		//Puis la seconde case du array name dans lastName:

		System.out.println("Entrez votre nom et pr�nom");
		fullName = output.nextLine();

		name = fullName.split(" ");
		firstName = name[0];
		lastName = name[1];
		cpt = fullName.length();



		//M�thode StringTokenize(); 
		//String tokenizer permet de spliter une chaine en token � partir d'un point pr�ciser
		//Cette m�thode prend en param�tre la chaine sur laquelle il doit travailler et la cract�re o� il va spliter la chaine

		/*System.out.println("Entrez votre nom et votre pr�nom");
		fullName = output.nextLine();


		StringTokenizer sc = new StringTokenizer(fullName, " ");
		firstName = sc.nextToken();
		lastName = sc.nextToken();*/


		System.out.println("La cha�ne contient : " + cpt + " caract�res");
		System.out.println("Your full name is : " + fullName);
		System.out.println("Votre pr�nom est : " + firstName);
		System.out.println("Votre nom est : " + lastName);

	}

}
