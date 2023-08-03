package test.level3;

import level3.LongestIncreasingSubsequence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestIncreasingSubsequence {
    @Test
    public void testWithZeroElements(){
        int[] nums = {};
        int expectedResult = 0;
        int actualResult = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testWithOneElements(){
        int[] nums = {1};
        int expectedResult = 1;
        int actualResult = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testWithTwoElements(){
        int[] nums = {1,2};
        int expectedResult = 2;
        int actualResult = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums);
        Assert.assertEquals(actualResult,expectedResult);

        int[] nums2 = {1,2};
        int expectedResult2 = 2;
        int actualResult2 = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums2);
        Assert.assertEquals(actualResult2,expectedResult2);

        int[] nums3 = {2,1};
        int expectedResult3= 1;
        int actualResult3 = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums3);
        Assert.assertEquals(actualResult3,expectedResult3);
    }

    @Test
    public void testWithManyElements(){
        int[] nums = {1,2,3,4,1,4,5,6,7,3};
        int expectedResult = 7;
        int actualResult = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums);
        Assert.assertEquals(actualResult,expectedResult);

        int[] nums2 = {-2, -3, -1, 5, 7,3, -4};
        int expectedResult2 = 4;
        int actualResult2 = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums2);
        Assert.assertEquals(actualResult2,expectedResult2);

        int[] nums3 = {3, 10, 2, 1, 20};
        int expectedResult3= 3;
        int actualResult3 = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums3);
        Assert.assertEquals(actualResult3,expectedResult3);

        int[] nums4 = {50, 3, 10, 7, 40, 80};
        int expectedResult4= 4;
        int actualResult4 = LongestIncreasingSubsequence.findLongestIncreasingSubsequence(nums4);
        Assert.assertEquals(actualResult4,expectedResult4);
    }



}
