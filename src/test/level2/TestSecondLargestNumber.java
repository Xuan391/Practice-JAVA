package test.level2;

import level2.SecondLargestNumber;
import level3.SecondSmallest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSecondLargestNumber {
    @Test
    public void testSecondLargestNumberWithLessThanTwoElements(){
        int[] nums1 = {};
        Assert.assertThrows(IllegalArgumentException.class, () -> SecondLargestNumber.findSecondLargestNumber(nums1));

        int[] nums2 ={1};
        Assert.assertThrows(IllegalArgumentException.class, () -> SecondLargestNumber.findSecondLargestNumber(nums2));
    }

    @Test
    public void testSecondLargestWithDuplicateElements(){
        int[] numbers1 = {3,2,5,2,5,100,100,99,100};
        int expectedResult1 = 99;
        int actualResult1 = SecondLargestNumber.findSecondLargestNumber(numbers1);
        Assert.assertEquals(actualResult1, expectedResult1);

        int[] numbers2 = {-1,-1,-3,-2,-2,-4};
        int expectedResult2 = -2;
        int actualResult2 = SecondLargestNumber.findSecondLargestNumber(numbers2);
        Assert.assertEquals(actualResult2, expectedResult2);
    }

    @Test
    public void testSecondLargestWith(){
        int[] numbers1 = {1,2,3,4,5,6,7,8,9};
        int expectedResult1 = 8;
        int actualResult1 = SecondLargestNumber.findSecondLargestNumber(numbers1);
        Assert.assertEquals(actualResult1, expectedResult1);

        int[] numbers2 = {-1,0,2,3,4,5,-4,-5,-6,-4};
        int expectedResult2 = 4;
        int actualResult2 = SecondLargestNumber.findSecondLargestNumber(numbers2);
        Assert.assertEquals(actualResult2, expectedResult2);

        int[] numbers3 = {7,8,3,9,2,6,4,5};
        int expectedResult3 = 8;
        int actualResult3 = SecondLargestNumber.findSecondLargestNumber(numbers3);
        Assert.assertEquals(actualResult3, expectedResult3);

        int[] numbers4 = {2,1,3,4,5,6,7};
        int expectedResult4 = 6;
        int actualResult4 = SecondLargestNumber.findSecondLargestNumber(numbers4);
        Assert.assertEquals(actualResult4, expectedResult4);

        int[] numbers5 = {2,1};
        int expectedResult5 = 1;
        int actualResult5 = SecondLargestNumber.findSecondLargestNumber(numbers5);
        Assert.assertEquals(actualResult5, expectedResult5);
    }

    @Test
    public void testSecondLargestDuplicateElements(){
        int[] numbers = {1,1,1,1,1};
        Assert.assertThrows(IllegalArgumentException.class, () -> SecondLargestNumber.findSecondLargestNumber(numbers));
    }
}
