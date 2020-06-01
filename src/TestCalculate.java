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
	public void ThreeNumberDelimitedEitherWay() {
		assertEquals(Calculator.calculate("1,2\n3"), 6);
	}
	public void CustomDelimiter() {
		assertEquals(Calculator.calculate("//;\n1;2"), 3);
	}
	@Test (expectedExceptions= Exception.class)
	public void NegativeNumbersThrowexception() {
		Calculator.calculate("-1");
	}
	public void TheNegativeNumberReturnInTheExceptionMessage(){
		try {
			Calculator.calculate("-1");
		}
		catch(IllegalArgumentException e){
			assertEquals(e.getMessage() , "Negatives are not allowed: -1");
		}
		finally {}
		try {
			Calculator.calculate("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives are not allowed: -4,-5");
		}
		finally {}

	}
	public void IgnoreNumbersGreaterThanThousand() {
		assertEquals(Calculator.calculate("1,2\n1001"), 3);
	}

}
