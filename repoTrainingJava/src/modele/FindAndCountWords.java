/*
 * # Class : FinAndCountWords
 * # Purpos : exercise on String - Take a String, go through it and make a count of 
 * 		--> The positive words "good" and "awesome"
 * 		--> The negative words "bad" and "terrible"
 * # Return a String of the form :  "5P2N" with 'P' standing for Positiv and 'N' for Negatif
 * 
 * # Left to do : Turn that class into a method which will take a String in parameter
 * */
package modele;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndCountWords {

	public static void main(String[] args) {



		int cptg=0;
		int cptaw=0;

		int cptb=0;
		int cptte=0;
		String text="What an AWESOME product. The good color is good, and the cost is awesome. The only thing I did not like is the delivery times, which are really Terrible";

		String newT = text.toLowerCase();

		//For good
		Pattern go= Pattern.compile("good");
		Matcher m = go.matcher(newT);
		while(m.find()) {
			cptg++;
		}

		//For awesome
		Pattern aw = Pattern.compile("awesome");
		Matcher mm = aw.matcher(newT);
		while(mm.find()) {
			cptaw++;
		}

		int pos=cptg+cptaw;

		//For bad
		Pattern bad= Pattern.compile("bad");
		Matcher mmm = bad.matcher(newT);
		while(mmm.find()) {
			cptb++;
		}

		//For terrible 
		Pattern ter = Pattern.compile("terrible");
		Matcher mmmm = ter.matcher(newT);
		while(mmmm.find()) {
			cptte++;
		}
		int neg=cptb+cptte;

		String posi="";
		String negi="";

		String P = posi.valueOf(pos);
		String N = negi.valueOf(neg);

		String F = P+"P"+N+"N";
		System.out.println(F);
	}
}
