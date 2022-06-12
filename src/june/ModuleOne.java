package june;

public class ModuleOne {

	public static void main(String[] args) {
		String line = "This website is aw3som3.";
	    int alphabets = 0, consonants = 0, digits = 0, spaces = 0;

	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);

	      // check if alphabet
	      if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
	        ++alphabets;
	      }

	      // check if character is in between consonants
	      if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )) {
	        ++consonants;
	      }
	      
	      // check if character is in between 0 to 9
	     if (ch >= '0' && ch <= '9') {
	        ++digits;
	      }
	    }

	    System.out.println("alphabets: " + alphabets);
	    System.out.println("Consonants: " + consonants);
	    System.out.println("Numbers: " + digits);
	    System.out.println("White spaces: " + spaces);
	  }
	}


