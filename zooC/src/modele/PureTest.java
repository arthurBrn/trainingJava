package modele;

import java.util.regex.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*;

public class PureTest {


	public static void main(String[] args) {

		char twoD[][] = {{'a','b','c','d','e','f','g','h','i','j'}, {'0','1','2','3','4','5','6','7','8','9'}};
		String crypt="baab.";
		int ind=0;

		StringBuffer st = new StringBuffer(crypt);

		boolean doNotStart= !crypt.startsWith(".");
		boolean start = crypt.startsWith(".");
		boolean ends = crypt.endsWith(".");

		int index=0;
		String bef;
		int numb=0;
		String aft;
		int numa=0;

		//Initialisation arrays
		char charAvantPoint[]= {};
		char charApresPoint[]= {};
		if(crypt.contains(".")) {
			/*
			 * Si la chaine crypt ne commence pas par un '.'
			 * on envoie dans la chaine string les caract�re entre le premier caract�re et le '.'
			 * Apr�s on met ces caract�re dans un tableau de char nomm� 'charAvantPoint'
			 * 
			 * Puis, on met tous les caract�re apr�s le '.' dans la variable aft
			 * on met ensuite le contenu de la variable aft dans le array de char 'charApresPoint'
			 * 
			 * Enfin, on met l'index o� se trouve le point dans la chaine dans la variable index
			 * et on utilise la m�thode 'deleteCharAt' pour supprimer le point � l'index o� il est
			 * */
			if(doNotStart) {
				bef = crypt.substring(0, crypt.indexOf("."));
				charAvantPoint = bef.toCharArray();

				aft=crypt.substring(crypt.indexOf(".")+1);
				charApresPoint = aft.toCharArray();

				index = st.indexOf(".");
				st.deleteCharAt(index);
				System.out.println("1ER IFOULALA");
				System.out.println("Chaine post op�: " + st);
				System.out.println("Char avant point :");
				for(int k=0;k<charAvantPoint.length;k++) {
					System.out.println("indice: " + k + " value: " + charAvantPoint[k]);
				}
				System.out.println("Char apr�s point :");
				for(int n=0;n<charApresPoint.length;n++) {
					System.out.println("indice: " + n + " value: " + charApresPoint[n]);
				}
			}
			/*
			 * SINON SI le chaine commence par un point, on ne prendra que les caract�re apr�s le point
			 * On r�cup�re via 'substring' tous les caract�res � partir de la position du point + 1, puisque la chaine commence au point ici.
			 * Le String aft contient donc tous les caract�res de la chaine apr�s le point
			 * On cr�e un array char 'charApresPoint' dans lequel on place tous les caract�res de la chaine aft
			 * 
			 * Puis on r�cup�re l'index o� se trouve le point qu'on stock dans index (puisqu'on utilisera index par la suite pr replacer le point)
			 * et on supprime le point avec la m�thode 'deleteCharAt()'
			 * */
			else if(start) {
				aft=crypt.substring(crypt.indexOf(".")+1);
				charApresPoint = aft.toCharArray();

				index = st.indexOf(".");
				st.deleteCharAt(index);
				System.out.println("1ER ELSE IF, START WITH A '.'");
				System.out.println("Char apr�s point :");
				System.out.println("Chaine post op�: " + st);
				for(int h=0;h<charApresPoint.length;h++) {
					System.out.println("indice: " + h + " value: " + charApresPoint[h]);
				}
			}
			/*
			 * SiNON SI la chaine fini par un '.', on r�cup�re tous les caract�res de la chaine jusque le position du point -1
			 * Apr�s on transforme la String bed en un array de char nomm� 'charAvantPoint'
			 * 
			 * Puis on r�cup�re l'index o� se trouve le point dans la chaine
			 * */
			else if(ends) {
				bef = crypt.substring(0, crypt.indexOf(".")-1);
				charAvantPoint = bef.toCharArray();

				index = st.indexOf(".");
				st.deleteCharAt(index);

				System.out.println("DERNIER ELSE IF, ENDS WITH A '.'");
				System.out.println("char Avant Point :");
				for(int d=0;d<charAvantPoint.length;d++) {
					System.out.println("indice: " + d +" value: " + charAvantPoint[d]);
				}

			}
		}



		/*
		 * On ne peut utiliser toCharArray() sur un String buffer donc on cr�e une nouvelle instance de String nomm� 'newC' et on lui donne en 
		 * param�tre le StringBuffer st
		 * */
		String newC = new String(st);

		/*
		 * On cr�e un array char, on place les valeurs de newC dedans, soit la chaine apr�s suppression du point tout simplement
		 * */
		char[] tab = newC.toCharArray();
		/*for(int i=0;i<tab.length;i++) {
			System.out.println("indice: " + i + "tab[i] : " + tab[i]);
		}*/


		/*
		 * La on va essay� d'expliquer ca simplement, on fait en sorte que les deux tableaux se parcours dans une boucle for, donc on a acc�s 
		 * aux valeurs de ses deux tableau et indices.
		 * On va en profiter pour �tablir la condition if:
		 * if(tab[c] == twoD[0][z]){ --> si � un moment donn� la valeur du array tab exprim� par 'tab[c]' est �gale � une des valeurs du premi�re
		 * 								 array de twoD exprim� par twoD[0][z] alors : 
		 * ind=z; --> on note l'indice � laquelle se trouve cette valeur
		 * tab[c] = twoD[1][ind] --> alors la valeur de tab[c] qui est �gale � la valeur du premier tableau sera remplac� par la valeur du deuxi�me
		 * 							 tableau de twoD exprim� par tab[1][ind];
		 * */
		for(int c=0;c<tab.length;c++) {
			for(int z=0;z<twoD.length;z++) {
				if(tab[c] == twoD[0][z]) {
					ind=z;
					tab[c] = twoD[1][ind];
					System.out.println("c: "+c+" z: "+z+"tab de c: "+ tab[c]);
				}
			}
		}

		/*
		 * Maintenant qu'on � r�ussi � d�chiffrer les comptes de cet enfoir�, on cr�e un nouveau tableau de char nomme 'tab2' auquel on attribu aucune 
		 * valeur, seulement la longueur du tableau qui contient maintenant nos chiffres ([tab.length+1]) plus une case, qui correspondra au 
		 * point que nous devons rajouter.
		 * */
		char tab2[] = new char[tab.length+1];
		/*
		 * On rajoute donc le point � l'index o� il se trouvait dans notre chaine lorsque nous l'avons supprim� plus haut.
		 * */
		tab2[index] = '.';

		//Now we have to use the if conditions and boolean variable established upthere to manage to find the right spot where to put the values we
		//still have to place ! GOOD WORK

		System.out.println("La on est dans tab2");
		for(int o=0;o<tab2.length;o++) {
			System.out.println("indice: " +o+" tab[o]: " + tab2[o]);
		}

		/*
		 * Now we're gonna place back the value of the arrays :
		 * 'charAvantPoint' & 'charApresPoint' if 'doNotStart == true'
		 * 'charApresPoint' if 'start == true'
		 * 'charAvantPoint' if 'ends == true'
		 * into the char array 'tab2[]', to do so we need to:
		 * 	--> go through the array(s) where the values are
		 * 	--> then go through the array 'tab2[]' where we want to place the values 
		 * 	--> then place the value with something like 'tab2[i] = charAvantPoint[x], let us try that !
		 * */
		//We intialise a counter name 'stop'
		int stop=0;
		if(doNotStart) {	
			for(int f=0;f<tab.length;f++) {
				for(int g=0; g<tab2.length;g++) {
					while(stop != index) { 
						tab2[g] = tab[f];
						stop = stop+1;
					}
				}
			} 
			int reste=charApresPoint.length;
			stop=stop+1;
			while(reste>0) {

				for(int y=0;y<tab2.length;y++) {
					for(int j=0;j<tab.length;j++) {
						tab2[stop] = tab[index];
					}
				}
				reste = reste -1;
				stop=stop+1;
				index = index+1;
			}
		}


		else if(start) {
			int reste=charApresPoint.length;
			int stopElseIf1=1;
			int cpt=0;
			while(reste>0) {
				
				for(int y=0;y<tab2.length;y++) {
					for(int j=0;j<tab.length;j++) {
						tab2[stopElseIf1] = tab[cpt];
					}
				}
				stopElseIf1=stopElseIf1+1;
				reste=reste-1;
				cpt=cpt+1;
			}
		}
		else if(ends) {
			int reste=charAvantPoint.length;
			int stopLast=0;
			int cpt1=0;
			
			while(reste>0) {
				for(int y=0;y<tab2.length;y++) {
					for(int g=0;g<tab.length;g++) {
						tab2[y] = tab[g];
					}
				}
				reste=reste-1;
				cpt1=cpt1+1;
				stopLast=stopLast+1;
			}
			
			
		}
		else {
			System.out.println("We're in the last else so there is for sure a problem here");
		}

		System.out.println("##### TEST #####");
		System.out.println("Stop: " + stop);
		System.out.println("Index: " + index);
		for(int u=0;u<tab2.length;u++) {
			System.out.println("Inidice: " + u + " value: " + tab2[u]);
		}

		//Transf�rer le tableau char en string 
		//Transformer la string en double !


	}
}



