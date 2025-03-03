package testing.unittesting;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;



public class CalculatorTest {
Calculator cal=new Calculator();
	
@Test
public void testAdd() {
	assertEquals(13,cal.dosum(3,6,4));
	assertEquals(-1,cal.dosum(3,6,-10));
	assertEquals(13,cal.dosum(3,6,4));
}
	
@Test
public void Mul() {
	assertEquals(4,cal.doProduct(2,2));
	assertEquals(10,cal.doProduct(5,2));
	assertEquals(8,cal.doProduct(4,2));
}
}
