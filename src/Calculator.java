
public class Calculator {

	public static int calculate(String input) {
		// TODO Auto-generated method stub
		String delimiter = ",|\n";
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
	private static int getAddition(String[] num) {
		int sum = 0;
		for(int i = 0; i < num.length ; i++) {
			sum+=StringToInteger(num[i]);
		}
		return sum;
	}
	private static int StringToInteger(String input){
		return Integer.parseInt(input);
	}
}
