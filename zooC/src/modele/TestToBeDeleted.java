package modele;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*;



public class TestToBeDeleted {

	public static void main(String[] args) {
		
		String twoD[][] = {{"a","b","c","d","e","f","g","h","i","j"}, {"0","1","2","3","4","5","6","7","8","9"}};
		String crypt="b.aab";

		/*
		 * On cr�e une nouvelle instence de StringBuffer nomm� 'st' qui prend en param�tre la chaine crypt initiale
		 * */
		StringBuffer st = new StringBuffer(crypt);




		/*On trouve si la chaine contient un "." ou non.
		 * Si elle contient un . on met l'index o� il se trouve dans la variable index
		 * Puis on utiliser deleteCharAt(index) pour supprimer le . de la chaine
		 * 
		 * --> On utilisera la variable par la suite pour remettre le . � l'indice o� il se trouvait
		 * */

		int index=0;
		if(crypt.contains(".")) {
			index = st.indexOf(".");
			st.deleteCharAt(index);
		}

		/*
		 * Pour pouvoir utiliser la m�thode toCharArray sur la chaine de caract�re on doit avec une chaine Stirng et non StringBuffer comme st.
		 * Donc on cr�e une nouvelle instance String nomm� 'newC' et on lui passe en param�tre le StringBuffer 'st'
		 * On peut mtn utilier newC (qui est �gal a la chaine sans le point) avec la m�thode toCharArray();
		 * */
		String newC = new String(st);

		/* On cr�e un array char[] nomm� 'tab', dans lequel on d�compose le String 'crypt' char by char gr�ce � la m�thode 'toCharArray()'
		 * On passe en revu l'array 'tab' via le for 
		 * 
		 * */
		char[] tab = newC.toCharArray();
		for(int c=0; c<tab.length;c++) {
			System.out.println("N� : " + c + "value : " + tab[c]);

			
			
			
			//Il y a matches avec pattern aussi
			//if(newC.valueOf(tab[c]) == "a") {
			
			if(newC.contains("a")) {
				//tab[c] = '0';
				System.out.println("INCH ON EST LA");
			}
			/*else if(newC.contains("b")) {}
			else if(newC.contains("c")) {}
			else if(newC.contains("d")) {}
			else if(newC.contains("e")) {}
			else if(newC.contains("f")) {}
			else if(newC.contains("g")) {}
			else if(newC.contains("h")) {}
			else if(newC.contains("i")) {}
			else if(newC.contains("j")) {}//FOR 9*/
		}



		/*
		 * 
		 * Use indexOf() or charAt()to find a letter like a or b, if text.indexOf(a)>0, on cr�e while(text.indexOf("a")>0){remplacer a par 0
		 * Use the method replace blabla to replace the letter by a number
		 * 
		 * */



	}
}
