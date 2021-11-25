import java.util.Scanner;

public final class projectfivefive {
    
    public static void main(String[] args) {
		RockPaperScissors();// Calls method 
	}
	public static void RockPaperScissors () {
        Scanner input = new Scanner(System.in);
        String[] choice = {"Rock", "Paper", "Scissors"}; // choices
			System.out.println("Choose your character!"); // gives the opening of the game
			System.out.println("\nWe have the Mighty ,Everpowerful, Unbreakable ROCK!");
			System.out.println("\nNext up... The Unperishable, Unstopable, Unrippable PAPER!");
			System.out.println("\nLast but not least the Unsnippable, Sharp, Pointy SCISSORS!");
			System.out.println("\nTo choose Rock type 0, to choose Paper type 1, to choose Scissors type 2, to exit type 3");
		int u = input.nextInt(); //allows for user input
		 while (u != 3)  { // the program continues until user wants to quit and enters 3
			if (u >= 0 && u < 3){ //expects input from 0 - 2, it runs the program when it is entered
				int c;
				c = (int)(Math.random() * 3); //random output of 0 - 2
				System.out.println("\nInteresting choice you have chosen a formidable weapon " + choice[u] + "!"); // print user choice
				System.out.println("\nThe computer has also chosen a worthy weapon to weild, the " + choice[c] + "!");	//print comp choice
				Win(u, c);//calls method which is further down, it determines whether you win or loose
			}	
			System.out.println("\nTo choose Rock type 0, to choose Paper type 1, to choose Scissors type 2, to exit type 3");
			u = input.nextInt();  // allows for the user to repeat the game as many times as desired
		}
	}
	public static void Win(int playerinput, int computerinput) {
		boolean winner = false; // sets win to false
		if (playerinput == computerinput) // if options are the same, it is a draw
			System.out.println("\n You both have very good experience in choosing players, it is a ... DRAW!");
		else { //gives win option
			winner = (playerinput == 0 && computerinput == 2)||(playerinput == 1 && computerinput == 0)||(playerinput == 2 && computerinput == 1);  //checks user choice with computer choice

			if(winner) //prints win statement
				System.out.println("\nCongratulations oh chosen one, you have defeated the enemey! \nYou shall be paid handsomely in fake money!");
		
			else //prints lose statement
				System.out.println("\nMy apologies, you are not chosen one who must save us. \nPlease train harder and try again.");
		}
	}
}
	
	
		
