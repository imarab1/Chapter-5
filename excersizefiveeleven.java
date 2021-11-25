import java.util.*; //import util for random
public class excersizefiveeleven{
	public static void main(String[]args){
		threeHeads();//calls method
	}
	
	public static void threeHeads(){
		System.out.println("Welcome to the Coin Flip Game!"); //prints intro statement
		Random rand = new Random();//produces a random output everytime
		int side = 0;//starts num of flips at zero
		while(side < 3){ //this will occur when the it has been flipped under three times
			boolean heads;//defines boolean 
			heads = rand.nextBoolean();//randomizes the output
			if(heads){ //if random chooses this output, this is what will happen as follows
				side++;//number of flips increases
				System.out.print("H"); //prints h
				System.out.print(" "); // prints space
			}
			else{
				System.out.print("T"); //prints t 
				System.out.print(" "); //prints space
				side = 0;//stops the game when three h's are printed
			}
		}
    System.out.print("\nCongrats!"); //prints exit statement
    System.out.print(" You beat the system!");
	}
}
