package test.level2;

import level2.MaxSubarraySum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaxSubarraySum {
    @Test
    public void TestMaxSubarraySumWithPositiveNumArray(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int expectedResult = 45;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void TestMaxSubarraySumWithNegativeNumArray(){
        int[] arr = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
        int expectedResult = -1;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMaxSubarraySumWithNegativeAndZeroNumArray(){
        int[] arr = {-1,-2,-3,-4,0,-5,-6,-7,-8,-9};
        int expectedResult = 0;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMaxSubarraySumWithNegativeAndPositiveNumArray1(){
        int[] arr = {-1,-2,-3,4,0,5,-6,-7,-8,-9};
        int expectedResult = 9;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMaxSubarraySumWithNegativeAndPositiveNumArray2(){
        int[] arr = {-1,-2,-3,9,0,5,-6,-7,-8,-9, 11};
        int expectedResult = 14;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMaxSubarraySumWithNegativeAndPositiveNumArray3(){
        int[] arr = {-1,-2,-3,9,0,5,6,-7,-8,-9, 11};
        int expectedResult = 20;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMaxSubarraySumWithNegativeAndPositiveNumArray4(){
        int[] arr = {-1,-2,-3,9,0,5,6,-7,-8,-9, 100};
        int expectedResult = 100;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMaxSubarraySumWithNegativeAndPositiveNumArray5(){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int expectedResult = 7;
        int actualResult = MaxSubarraySum.findMaximumSubarraySum(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
