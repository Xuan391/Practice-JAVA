package test.level4;

import level4.MaximumProductThreeElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaximumProductThreeElements {
    @Test
    public void testWithLessThan3Elements(){
        int[] nums1 = {};
        Assert.assertThrows(IllegalArgumentException.class, () -> MaximumProductThreeElements.getMaxProduct(nums1));

        int[] nums2 = {1};
        Assert.assertThrows(IllegalArgumentException.class, () -> MaximumProductThreeElements.getMaxProduct(nums2));

        int[] nums3 = {1,2};
        Assert.assertThrows(IllegalArgumentException.class, () -> MaximumProductThreeElements.getMaxProduct(nums3));

    }

    @Test
    public void testMaximumProductThreeElements(){
        int[] nums={-1,-2,-3};
        int expected = -6;
        int actual = MaximumProductThreeElements.getMaxProduct(nums);
        Assert.assertEquals(actual,expected);

        int[] nums1={1,2,3,-1};
        int expected1 = 6;
        int actual1 = MaximumProductThreeElements.getMaxProduct(nums1);
        Assert.assertEquals(actual1,expected1);

        int[] nums2={-10, -5, 0, 1, 2, 3, 4};
        int expected2 = 200;
        int actual2 = MaximumProductThreeElements.getMaxProduct(nums2);
        Assert.assertEquals(actual2,expected2);

        int[] nums3={-3, -4, 5, 1, 2};
        int expected3 = 60;
        int actual3 = MaximumProductThreeElements.getMaxProduct(nums3);
        Assert.assertEquals(actual3,expected3);

        int[] nums4={2,3,5,10,-10};
        int expected4 = 150;
        int actual4 = MaximumProductThreeElements.getMaxProduct(nums4);
        Assert.assertEquals(actual4,expected4);

        int[] nums5={10, 34, 1, -1};
        int expected5 = 340;
        int actual5 = MaximumProductThreeElements.getMaxProduct(nums5);
        Assert.assertEquals(actual5,expected5);

    }
}
