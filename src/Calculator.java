
public class Calculator {

	public static int calculate(String input) {
		// TODO Auto-generated method stub
		String delimiter = ",|\n";
		if(input.matches("//(.*)\n(.*)")){
			delimiter = Character.toString(input.charAt(2));
			input = input.substring(4);
		};
		String[] num = input.split(delimiter);
		if (input.isEmpty()) {
			return 0;
		}
		else if(input.length()==1) {
			return Integer.parseInt(input);
		}
		else {
			return (getAddition(num));
		}
	}
	private static int getAddition(String[] num) {       //Made a global method for addition
		int sum = 0;
		for(int i = 0; i < num.length ; i++) {
			sum+=StringToInteger(num[i]);
		}
		return sum;
	}
	private static int StringToInteger(String input){      //Made a global method for Integer.parseint()
		return Integer.parseInt(input);
	}
}
