import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class TestCalculate {
	
	public void EmptyString() {
		Calculator calculator = new Calculator();
		assertEquals(Calculator.calculate("") , 0);
	}

}
