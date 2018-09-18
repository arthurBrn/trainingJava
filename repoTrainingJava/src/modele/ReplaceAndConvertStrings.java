/*
 * # Class : ReplaceAndConvertStrings
 * # Purpos : exercise on String - Take a String like 'abcd' return a number like '0123'
 * # Return a double number through the var named 'finalC'
 * 
 *  # Left to do : Turn the class into a method which will take a String and return a double
 * 
 * */
package modele;

public class ReplaceAndConvertStrings {

	public static void main(String[] args) {
		String crypt="ghjd";

		//Initialisation arrays
		char charAvantPoint[]= {};
		char charApresPoint[]= {};
		char twoD[][] = {{'a','b','c','d','e','f','g','h','i','j'}, {'0','1','2','3','4','5','6','7','8','9'}};



		System.out.println("Phrase initiale: " + crypt);

		//DeencryptedNumber

		int index=0;
		String bef;
		int numb=0;
		String aft;
		int numa=0;

		if(crypt.contains(".")) {//SI la chaine contient un point
			if(crypt.endsWith(".")) {//SI la chaine commence par un point
				bef = crypt.substring(0, crypt.indexOf(".")-1);//R�cup�re toute la chaine sauf le point, on place la chaine dans bef
				charAvantPoint = bef.toCharArray();//On transforme bef en array de char 


				int ind=0;
				for(int c=0;c<charAvantPoint.length;c++) {
					for(int z=0;z<twoD[0].length;z++) {
						if(charAvantPoint[c] == twoD[0][z]) {
							ind=z;
							charAvantPoint[c] = twoD[1][ind];
						}
					}
				}

				String convertion= new String(charAvantPoint);
				System.out.println("Le tableau avec des valeurs : 1er if " + convertion);

				String point=".";
				String concatenation = convertion.concat(point);

				double finalC=Double.parseDouble(concatenation);
				System.out.println("R�sultat de type double 1er if : " + finalC);


			}
			else if(crypt.startsWith(".")) { //SINON SI la chaine commence par un '.'
				aft=crypt.substring(crypt.indexOf(".")+1); //On r�cup�re les caract�res de la chaine avec substring � partir de indeOf(".")+1
				charApresPoint = aft.toCharArray();//On met le reste des caract�res de la chaine dans l'array 'charApresPoint'


				//int ind=0;
				for(int c=0;c<charApresPoint.length;c++) {
					for(int z=0;z<twoD[0].length;z++) {
						if(charApresPoint[c] == twoD[0][z]) {

							charApresPoint[c] = twoD[1][z];
						}
					}
				}

				String first = new String(charApresPoint);
				String point=".";
				System.out.println("first : " + first);


				String concatenation = point.concat(first);
				double finalC = Double.parseDouble(concatenation);
				System.out.println("R�sultat de type double 2 eme if : " + finalC);

			}

			else if(!crypt.startsWith(".") && !crypt.endsWith(".")){
				bef = crypt.substring(0, crypt.indexOf("."));
				charAvantPoint = bef.toCharArray(); 

				aft=crypt.substring(crypt.indexOf(".")+1);
				charApresPoint = aft.toCharArray();

				System.out.println("bef : " + bef);
				System.out.println("aft : " + aft);


				for(int c=0;c<charAvantPoint.length;c++) {
					for(int z=0;z<twoD[0].length;z++) {
						if(charAvantPoint[c] == twoD[0][z]) {
							charAvantPoint[c] = twoD[1][z];
						}
					}
				}
				System.out.println("char 0 : " + charAvantPoint[0]);
				System.out.println("char 1 : " + charAvantPoint[1]);

				/*
				 * On d�lcare compteur inde 
				 * Via le for on transforme les valeurs du tableau en nombre qu'on place dans le arrat 'charApresPoint'
				 * */
				for(int c=0;c<charApresPoint.length;c++) {
					for(int z=0;z<twoD[0].length;z++) {
						if(charApresPoint[c] == twoD[0][z]) {
							charApresPoint[c] = twoD[1][z];
						}
					}
				}

				System.out.println("char 2 : " + charApresPoint[0]);
				System.out.println("char 3 : " + charApresPoint[1]);

				//On transforme l'array 'charAvantPoint' en String nomm� 'first'
				String first = new String(charAvantPoint);

				//On transforme la deuxi�me partie du tableau 'charApresPoint' en String nomm� 'second'
				String second = new String(charApresPoint);
				//On d�finit un String contenant le '.' qu'on a supprim� plus haut de la chaine
				String point=".";
				//On cr�e un nouveau String nomm� 'test' qui va nous permettre de concat�n� la premi�re partie de la chaine avec le point
				String firstConvertion= first.concat(point);
				//On cr�e un deuxi�me String nomm� 'test' qui va nous permettre de concat�n� la premiere chaine qui contient le '.' avec la deuxi�me
				String secondConvertion=firstConvertion.concat(second);

				//On cr�e une variable de type double nomm� 'resF' et on utilise la m�thode Double.doubleParse() pour transformer notre String en double
				double finalC = Double.parseDouble(secondConvertion);

				System.out.println("R�sultat de type double dernier if : " + finalC);

			}			
		}
		else if(!crypt.contains(".")) {

			char tab[] = crypt.toCharArray();

			for(int z=0;z<twoD[0].length;z++) {
				for(int c=0;c<tab.length;c++) {
					while(tab[c] == twoD[0][z]) {
						if(tab[c] == twoD[0][z]) {
							tab[c] = twoD[1][z];
						}
					}
				}
			}

			System.out.println("tests sans les points : ");
			for(int i=0;i<tab.length;i++) {
				System.out.println("Indice : " + i + " value: " + tab[i]);
			}

			/*
			 * On va transformer le tableau tab en String puis la string en double 
			 * */

			String tabString = new String(tab);

			double finalC = Double.parseDouble(tabString); 
			System.out.println("FINAL C : " + finalC);


		}
	}
}


