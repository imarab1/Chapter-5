public class excersizefiveeighteen{
	public static void main(String[]args){
		System.out.println(digitSum(-456));//prints method with given number
	}
	
	public static int digitSum(int number){
		int total = 0; //starts number out at zero, if it was one then the outcome would be one number more than the expected output
		number = Math.abs(number); // we need to have this defined outside, if we define it in the while loop, we will still get a negative number, it omits the negative sign
			while(number > 0){ // this will run if the number when the number is greater than zero
				total += number % 10;// total plus the number then tthe remainder is taken
				number /= 10; // the number divided by ten
			}	
		return total; //the total is return, it is printed above in the main method
	}
}
