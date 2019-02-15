package labString;

import static org.junit.Assert.assertEquals;
	import org.junit.jupiter.api.Test;
	
public class stringCalculatorTest {
	
	    @Test
	/// TC 7
	    void StringCalculatorTest() {
	// arrange
	        String expected = "7";
	// actual
	        String actual = stringCalculator.add("7");
	// assert
	        assertEquals(expected, actual);
	    }
	    @Test
	/// TC 0 
	    void StringCalculatorTest2() {
	// arrange
	        String expected = "0";
	// actual
	        String actual = stringCalculator.add("0");
	// assert
	        assertEquals(expected, actual);
	    }
	    @Test
	    void StringCalculatorTest3() {
	// arrange
	        String expected = "100";
	// actual
	        String actual = stringCalculator.add("100");
	// assert
	        assertEquals(expected, actual);
	    }
	    @Test
	    void StringCalculatorTest4() {
	// arrange
	        String expected = "5";
	// actual
	        String actual = stringCalculator.add("2,3");
	// assert
	        assertEquals(expected, actual);
	    }
	    
	    @Test
	    void StringCalculatorTest5() {
	    	// arrange
	        String expected = "101";
	// actual
	        String actual = stringCalculator.add("1,100");
	// assert
	        assertEquals(expected, actual);
	    }
	    @Test
	    void StringCalculatorTest6() {
	    	// arrange
	        String expected = "15.6";
	// actual
	        String actual = stringCalculator.add("7.5,8.1");
	// assert
	        assertEquals(expected, actual);
	    }
	    void StringCalculatorTest7() {
	    }
	    void StringCalculatorTest8() {
	    }
	    void StringCalculatorTest9() {
	    }
	    void StringCalculatorTest10() {
	    }
	    void StringCalculatorTest11() {
	    }
	    void StringCalculatorTest12() {
	    }
	}


