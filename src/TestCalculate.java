import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class TestCalculate {
	
	private Calculator calculator;         //Made it global as using this function repeatedly 
	
	@BeforeTest
	public void init() {
		calculator=new Calculator();
	}
	
	public void EmptyString() {
		assertEquals(Calculator.calculate("") , 0);
	}
	public void SingleString() {
		assertEquals(Calculator.calculate("1"), 1);
	}
	public void TwoStringsDelimitedByCommaReturnsTheSum() {
		assertEquals(Calculator.calculate("1,2"), 3);
	}
	public void TwoNumbersDelimitedByNewLineReturnsTheSum() {
		assertEquals(Calculator.calculate("1\n2"), 3);
	}

}
