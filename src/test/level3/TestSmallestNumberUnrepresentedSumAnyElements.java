package test.level3;

import level3.SmallestNumberUnrepresentedSumAnyElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSmallestNumberUnrepresentedSumAnyElements {
    @Test
    public void testWithZeroElement(){
        int[] nums = {};
        int expectedResult = 1;
        int actualResult = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testWithOneElement(){
        int[] nums = {0};
        int expectedResult = 1;
        int actualResult = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums);
        Assert.assertEquals(actualResult,expectedResult);

        int[] nums2 = {1};
        int expectedResult2 = 2;
        int actualResult2 = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums2);
        Assert.assertEquals(actualResult2,expectedResult2);

        int[] nums3 = {2};
        int expectedResult3 = 1;
        int actualResult3 = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums3);
        Assert.assertEquals(actualResult3,expectedResult3);

        int[] nums4 = {3};
        int expectedResult4 = 1;
        int actualResult4 = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums4);
        Assert.assertEquals(actualResult4,expectedResult4);
    }

    @Test
    public void testWithManyElement(){
        int[] nums = {1, 2, 3, 7, 8, 20};
        int expectedResult = 42;
        int actualResult = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums);
        Assert.assertEquals(actualResult,expectedResult);

        int[] nums2 = {1,2,6,7,8,9};
        int expectedResult2 = 4;
        int actualResult2 = SmallestNumberUnrepresentedSumAnyElements.findSmallestUnrepresentedInteger(nums2);
        Assert.assertEquals(actualResult2,expectedResult2);
    }
}
