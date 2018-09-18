package modele;


public class EmailVerifyer {

	public static void main(String[] args) {
		String email="ss.i.?n@tgrefd";
		boolean tot=false;


		/*
		 * Here we verify wether or not the String 'email' is empty or null, if one of this assesments are true, we set tot to false and stop the process
		 * */
		if(email.isEmpty() || email == null){
			tot=false;
		}
		/*
		 * IF email is not null, 
		 * */
		else {
			/*
			 * We use the indexOf() method which return an int, to see if there is an @ inside the String 'email', is the result is inferior to 1
			 * 		we can conclude that there is less than 1 @ in the String, so we set tot to false and stop the process.
			 * */
			if(email.indexOf('@')<1) {
				tot=false;
			}
			/*
			 * Here we use once more the indexOf() method which return an int and pass the character ('.') in parameter, if it return less than one,
			 * 		it will mean there is less than 1 '.' in the String and the 'email' String is not conform.
			 * */
			else if(email.indexOf('.')<1) {
				tot = false;
			}
			/*email.indexOf("@")+1 -->We position ourselves after the "@", by getting the index of the @ and going one index further with the +1
			 * Then, we use email.substring before this argument to get all the character after the index we passe in argument, and the index we use 
			 * 		here is the 'email.indexOf("@") method explained above.
			 * Once we have those charachters after the '@' we verifiy through the 'isEmpty()' method wether or not the result we get is empty, and if
			 * 		it is, we declare 'tot = false' and stop the action.
			 * */
			else if(email.substring(email.indexOf("@")+1).isEmpty()) {
				tot=false;
				System.out.println("On s'arrête la je crois bien");
			}
			else {
				/*
				 * Or, if the String 'email' passed all the previous verification it mean the chain contain a '@', a '.' and there is something after
				 * 	the '@'.
				 * Here we create the array of type String s[], we initialised it with 3 String (Not sure it is of much use to initialise it), then
				 * 		we split the String 'email' with the regex @|\\. and place the result in three peaces into the array we just created.
				 * s[0] contains the first part before the '@'
				 * s[1] contains the second part between the '@' and the '.'
				 * s[2] conatins the third part after the '.'
				 * */
				String s[] = {"bla","bla","bla"};
				s = email.split("@|\\.");

				/*
				 * Here we verify that s[0] is nor empty, nor null or that it's length is not inferior to 1, if one of those conditions is validate,
				 * 		we set tot to false. Then we do the same thing for s[1] and s[2]
				 * */
				if(s[0].isEmpty() || s[0] == null || s[0].length()<1) {	
					tot=false;
				}
				else if(s[1].isEmpty() || s[1] == null || s[1].length()<1) {	
					tot = false;
				}
				else if(s[2].isEmpty() || s[2] == null || s[2].length()<1) {	
					tot=false;
				}
				/*
				 * If none of the part of the array are empty, null or inferior to 1, we create 3 boolean variables, in which we place the three part of
				 * 		the array with the method 'matches' which is use with the regex the take in parameter.
				 * 		The first two methods take the same regex which only allow letters in capital or not, and numbers or digits, the star '*' 
				 * 			enable us to specify that there can be a plurality of letter or number not just one.
				 * 		The last regex (after the .) allow only letter in capital or not. 
				 * */
				else{
					boolean test = s[0].matches("[A-Za-z0-9]*");
					boolean tes = s[1].matches("[A-Za-z0-9]*");
					boolean te = s[2].matches("[A-Za-z]*");
					/*
					 * Then we verify that the three conditions we coined are true, if they are we set tot as true, if not tot will be set as false.
					 * */
					if(test == true && tes == true && te == true){
						tot = true;
					}
					else{
						tot = false;
					}
				}
			}
		}
		System.out.println("RES : "+tot);;
	}
	
	
}
