public class excersizefivenine{
	public static void main(String[] args){
	printFactors(100);	//calls method and gives all the factors of 100, it will change for each number you input
	}
	
	public static void printFactors(int factor){
		int num;
			for (num = 1; num <= factor; num++) {//Starts the program at 1 and increases the number to see if it is a factor
				if (factor % num == 0) { //This factors the number, if we didn't have this, it would just print out the numbers from 1 - n
					if (num == 1) {//This starts the program with 1
						System.out.print(num);
					}
					else {
						System.out.print(" and "); //prints the "and", and the spaces
						System.out.print(num); // This prints the numbers following 1
					}
				}
			}
	}
}
