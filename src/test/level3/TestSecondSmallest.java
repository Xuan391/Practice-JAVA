package test.level3;

import level3.SecondSmallest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSecondSmallest {
    @Test
    public void testSecondSmallestWithLessThanTwoElements() {
        int[] numbers1 = new int[]{};
        Assert.assertThrows(IllegalArgumentException.class, () -> SecondSmallest.findSecondSmallest(numbers1));

        int[] numbers2 = new int[]{1};
        Assert.assertThrows(IllegalArgumentException.class, () -> SecondSmallest.findSecondSmallest(numbers2));
    }

    @Test
    public void testSecondSmallestWithDuplicateElements(){
        int[] numbers1 = {3,2,5,2,5,100,100,99,100};
        int expectedResult1 = 3;
        int actualResult1 = SecondSmallest.findSecondSmallest(numbers1);
        Assert.assertEquals(actualResult1, expectedResult1);

        int[] numbers2 = {-1,-1,-3,-2,-2,-3,1,2,3};
        int expectedResult2 = -2;
        int actualResult2 = SecondSmallest.findSecondSmallest(numbers2);
        Assert.assertEquals(actualResult2, expectedResult2);
    }

    @Test
    public void testSecondSmallestWith(){
        int[] numbers1 = {1,2,3,4,5,6,7,8,9};
        int expectedResult1 = 2;
        int actualResult1 = SecondSmallest.findSecondSmallest(numbers1);
        Assert.assertEquals(actualResult1, expectedResult1);

        int[] numbers2 = {-1,0,2,3,4,5,-4,-5,-6,-4};
        int expectedResult2 = -5;
        int actualResult2 = SecondSmallest.findSecondSmallest(numbers2);
        Assert.assertEquals(actualResult2, expectedResult2);

        int[] numbers3 = {7,8,3,9,2,6,4,5};
        int expectedResult3 = 3;
        int actualResult3 = SecondSmallest.findSecondSmallest(numbers3);
        Assert.assertEquals(actualResult3, expectedResult3);

        int[] numbers4 = {2,1,3,4,5,6,7};
        int expectedResult4 = 2;
        int actualResult4 = SecondSmallest.findSecondSmallest(numbers4);
        Assert.assertEquals(actualResult4, expectedResult4);

        int[] numbers5 = {2,2,3,4,5,6,7};
        int expectedResult5 = 3;
        int actualResult5 = SecondSmallest.findSecondSmallest(numbers5);
        Assert.assertEquals(actualResult5, expectedResult5);

        int[] numbers6 = {2,3};
        int expectedResult6 = 3;
        int actualResult6 = SecondSmallest.findSecondSmallest(numbers6);
        Assert.assertEquals(actualResult6, expectedResult6);
    }

    @Test
    public void testSecondSmallestDuplicateElements(){
        int[] numbers = {1,1};
        Assert.assertThrows(IllegalArgumentException.class,() -> SecondSmallest.findSecondSmallest(numbers));
    }

}
