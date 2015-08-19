/**
 * 
 */
package problems.internship;

/**
 * @author cristina.sabau
 *
 */
public class StringToInteger {
	
	public static char sign ;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		String numberString= "-1456";
		System.out.println("String representation: " + numberString );
		///char sign = ' ';
		int numberInt = convertToInt(numberString);
		System.out.println("Converted to int : " + sign + "" + numberInt);
		
	}

	/**
	 * 
	 * @param numberString
	 * @return the conversion to int 
	 */
	public static int convertToInt(String numberString){
		
		int numberInt =  0;
		int n = 1;
		//check the sign 
		if (numberString.charAt(0) == '-'){
			sign = '-';
			///numberString.replace("", "-");
		} else {
			sign = '+';
			numberInt+=(numberString.charAt(0) - 48) * n;
		}
		for (int i = numberString.length() -1 ; i>0; i--){
			///if(numberString.charAt(i) == '.')
				//test if the input string is not a number
			if ((numberString.charAt(i) >= 'a' && numberString.charAt(i) <='z') || (numberString.charAt(i) >= 'A' && 
					numberString.charAt(i)<='Z')){
				System.out.println("Not good format"); 
				return 0;
			}
			//parse to int
			numberInt += (numberString.charAt(i) - 48) * n;
			n *=10;
		}

	
		return numberInt;
		
	}

}
