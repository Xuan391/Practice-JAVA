package test.level2;

import level2.SumNumberDivisibleBoth3And5;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSumNumberDivisible3And5 {
    @Test
    public void testSumNumberDivisibleBoth3And5() {
        int[] arr = {15, 30, 45, 10, 20, 25, 35};
        int expectedSum = 15 + 30 + 45;
        int actualSum = SumNumberDivisibleBoth3And5.sumNumberDivisibleBoth3And5(arr);
        Assert.assertEquals(actualSum,expectedSum );
    }

    @Test
    public void testSumNumberDivisibleBoth3And5WithEmptyArray() {
        int[] arr = {};
        int expectedSum = 0;
        int actualSum = SumNumberDivisibleBoth3And5.sumNumberDivisibleBoth3And5(arr);
        Assert.assertEquals(actualSum,expectedSum );
    }

    @Test
    public void testSumNumberDivisibleBoth3And5WithNoNumberDivisible() {
        int[] arr = {10, 20, 25};
        int expectedSum = 0;
        int actualSum = SumNumberDivisibleBoth3And5.sumNumberDivisibleBoth3And5(arr);
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testSumNumberDivisibleBoth3And5WithEmptyStringInput() {
        int[] arr = {15, 30, 45, 10, 20, 25, 35, 40, 55};
        int expectedSum = 15 + 30 + 45;
        int actualSum = SumNumberDivisibleBoth3And5.sumNumberDivisibleBoth3And5(arr);
        Assert.assertEquals(expectedSum, actualSum);
    }

}
