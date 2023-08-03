package test.level3;

import level3.MedianNumbersTwoArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMedianNumbersTwoArray {
    @Test
    public void testMedianNumbersTwoArray(){
        int[] num1 = {1};
        int[] num2 = {};
        float expectResult = 1;
        float actualResult = MedianNumbersTwoArray.medianNumbersTwoArray(num1, num2);
        Assert.assertEquals(actualResult,expectResult);

        int[] num12 = {1,2,3};
        int[] num22= {4,5,6};
        float expectResult2 = 3.5f;
        float actualResult2 = MedianNumbersTwoArray.medianNumbersTwoArray(num12, num22);
        Assert.assertEquals(actualResult2,expectResult2);

        int[] num13 = {1,3,7,2,8,};
        int[] num23 = {5,9,6,4};
        float expectResult3 = 5;
        float actualResult3 = MedianNumbersTwoArray.medianNumbersTwoArray(num13, num23);
        Assert.assertEquals(actualResult3,expectResult3);

        int[] num14 = {1,7,3,4,8};
        int[] num24 = {5,9,2,6,10};
        float expectResult4 = 5.5f;
        float actualResult4 = MedianNumbersTwoArray.medianNumbersTwoArray(num14, num24);
        Assert.assertEquals(actualResult4,expectResult4);

        int[] num15 = {-1,-2,-3};
        int[] num25 = {-5,-4,-6,-8};
        float expectResult5 = -4;
        float actualResult5 = MedianNumbersTwoArray.medianNumbersTwoArray(num15, num25);
        Assert.assertEquals(actualResult5,expectResult5);
    }
}
