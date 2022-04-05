package se.lexicon;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void test_multiply_return_25 (){
        double expectedResult = 25;
        double actualResult = Calculator.multiply(5,5);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void test_division_return5 (){

        double expectedResult = 5;
        double actualResult = Calculator.division(25,5);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

}
