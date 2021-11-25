public class excersizefivetwentyfour{
	public static void main(String[]args){
		System.out.println(isAllVowels("aaaaaAagAaAauueeEoooUIII"));//prints method with string
	}
	
	public static boolean isAllVowels(String string){
	    String upperLowerV = "AaEeIiOoUu";//identifies vowels in uppercase and lowercase
	    int i;
			for(i = 0; i < string.length(); i++) { //it goes through each character 
				if(upperLowerV.indexOf(string.charAt(i)) == -1){//of the string to see if there are any constants
					return false;//if there are any constants, it returns false
				}
			}
    return true;//if there are no constants and only vowels, it returns true
	}

}


