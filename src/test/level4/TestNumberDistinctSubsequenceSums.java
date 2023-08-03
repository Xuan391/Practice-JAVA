package test.level4;

import level4.NumberDistinctSubsequenceSums;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNumberDistinctSubsequenceSums {
    @Test
    public void testNumberDistinctSubsequenceSums(){
        int[] nums = {};
        int sum = 2;
        int expectedResult = 0;
        int actualResult = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums, sum);
        Assert.assertEquals(actualResult, expectedResult);

        int[] nums2 = {1, 2, 3, 4, 5};
        int sum2 = 5;
        int expectedResult2 = 2;
        int actualResult2 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums2, sum2);
        Assert.assertEquals(actualResult2, expectedResult2);

        int[] nums3 = {1, 2, 3, 4, 1};
        int sum3 = 5;
        int expectedResult3 = 4;
        int actualResult3 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums3, sum3);
        Assert.assertEquals(actualResult3, expectedResult3);

        int[] nums4 = {1,1,1};
        int sum4 = 2;
        int expectedResult4 = 3;
        int actualResult4 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums4, sum4);
        Assert.assertEquals(actualResult4, expectedResult4);

        int[] nums5 = {1,1,1,1};
        int sum5 = 3;
        int expectedResult5 = 4;
        int actualResult5 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums5, sum5);
        Assert.assertEquals(actualResult5, expectedResult5);

        int[] nums6 = {1,5,2,7,4,9};
        int sum6 =10;
        int expectedResult6 = 3;
        int actualResult6 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums6, sum6);
        Assert.assertEquals(actualResult6, expectedResult6);

        int[] nums7 = {3,5,6,2,6,8,3};
        int sum7 = 20;
        int expectedResult7 = 6;
        int actualResult7 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums7, sum7);
        Assert.assertEquals(actualResult7, expectedResult7);

        int[] nums8 = { 4, 5, 6, 7, 3};
        int sum8 = 10;
        int expectedResult8 = 2;
        int actualResult8 = NumberDistinctSubsequenceSums.countDistinctSubsequences(nums8, sum8);
        Assert.assertEquals(actualResult8, expectedResult8);
    }
}
