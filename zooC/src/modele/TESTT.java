package modele;

public class TESTT {

	public static void main(String[] args) {
		// on va créer deux Strings pour les comparer et savoir ce qui marche ou ne marche pas !
		
		String s1 = "yes";
		String s2 = "yes";
		int m = s1.length();
		

		System.out.println("Second bash");
		String s = new String("abc");
		//Frist try 
		System.out.println(s.trim());
		// Second try
		System.out.println(s.replace('a','A'));
		//Third try 
		System.out.println(s.substring(3));
		//Fourth try
		System.out.println(s.toUpperCase());
		//Fifth try
		//s.setCharAt(1,'A');
		//Sixth try 
		//s.append("xyz");		
		System.out.println(s1.compareTo(s2));
		System.out.println(m);
		
		
		
	}
}
