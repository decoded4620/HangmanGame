import java.util.Date;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		String word = "Grandma";
		System.out.println("Welcome to hang man");
		
		String guesses = "";
		while(true){
			
			Scanner sc = new Scanner(System.in);

			boolean wasCorrect = false;
			boolean wasDuplicateGuess = false;
			
			System.out.println("What is your guess?");
			String guess = "";

			while(sc.hasNextLine()){
	        	guess = sc.nextLine();
	        	
	        	if(guesses.indexOf(guess) > -1){
	        		wasDuplicateGuess = true;
	        		wasCorrect = false;
	        		
	        		break;
	        	}
	        	
	        	guesses = guesses + guess;
	        	
	        	System.out.println(word.indexOf(guess));
				if(word.indexOf(guess) != -1){
					wasCorrect = true;
					break;
				}
		        
			
	        	break;
	        }
	        
			System.out.println("Your guess was: " + (wasCorrect ? "correct" : ( wasDuplicateGuess ? "duplicate guess" : "not correct")));
	        
		}
	}
}
