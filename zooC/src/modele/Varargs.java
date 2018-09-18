package modele;

public class Varargs {


	public static void showMsg(String... words) {
		System.out.println("vide ou non : ");

		String tab[]= {"","","","",""};

		/*for(String s : words) {
			System.out.println("arg : " + s);
		}*/

		for(int i=0;i<words.length;i++) {
			for(int x=0;x<tab.length;x++) {
				tab[x]=words[i];
			}
		}

		for(int x=0;x<tab.length;x++) {
			System.out.println("indice: " + x + " values : " + tab[x]);
		}

	}


	public static void main(String[] args) {

		showMsg("salut", "on", "essaye", "un", "ensemble", "arguments");
	}

}
