package testing.unittesting;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest1{
@Test
@ParameterizedTest
@CsvSource({"1,2,3,6","2,2,4,8","2,3,6,9","0,0,0,1"})
void testAdd(int first,int second,int third,int expected) {
	Calculator cal=new Calculator();
	assertEquals(expected,cal.dosum(first,second,third));
}
	
	
	
	
	
}
