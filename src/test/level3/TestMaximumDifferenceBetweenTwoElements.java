package test.level3;

import level3.MaximumDifferenceBetweenTwoElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaximumDifferenceBetweenTwoElements {
    @Test
    public void testWithArrayLessThanTwoElements() {
        int[] nums1 = {};
        Assert.assertThrows(IllegalArgumentException.class, () -> MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums1));

        int[] nums2 = {1};
        Assert.assertThrows(IllegalArgumentException.class, () -> MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums2));
    }

    @Test
    public void testWithDuplicateElements(){
        int[] nums = {1,1,1,1,1,1,1,1};
        int expectedResult = 0;
        int actualResult = MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test(){
        int[] nums1 = {1,1,1,1,2,1,1,1};
        int expectedResult1 = 1;
        int actualResult1 = MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums1);
        Assert.assertEquals(actualResult1,expectedResult1);

        int[] nums2 = {1,3,1,1,2,1,1,10,10};
        int expectedResult2 = 9;
        int actualResult2 = MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums2);
        Assert.assertEquals(actualResult2,expectedResult2);

        int[] nums3 = {1,2,3,4,5,6,7,8,9,10};
        int expectedResult3 = 9;
        int actualResult3 = MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums3);
        Assert.assertEquals(actualResult3,expectedResult3);

        int[] nums4 = {-3,-4,-5,-1,-2,-6,-7,-8,-9,-10};
        int expectedResult4 = 9;
        int actualResult4 = MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums4);
        Assert.assertEquals(actualResult4,expectedResult4);

        int[] nums5 = {1,5,-3,-4,-5,6,7,-9,-10};
        int expectedResult5 = 17;
        int actualResult5 = MaximumDifferenceBetweenTwoElements.findMaximumDifferenceBetweenTwoElements(nums5);
        Assert.assertEquals(actualResult5,expectedResult5);

    }



}
