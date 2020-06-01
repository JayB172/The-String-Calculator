
public class Calculator {

	public static int calculate(String input) {
		// TODO Auto-generated method stub
		String delimiter = ",";
		String[] num = input.split(delimiter);
		if (input.isEmpty()) {
			return 0;
		}
		else if(input.length()==1) {
			return Integer.parseInt(input);
		}
		else {
			return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
		}
	}
}
