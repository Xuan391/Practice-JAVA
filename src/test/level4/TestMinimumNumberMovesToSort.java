package test.level4;

import level4.MinimumNumberMovesToSort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMinimumNumberMovesToSort {
    @Test
    public void testMinimumNumberMovesToSortWithEmptyArray(){
        int[] numbers = {};
        int expectedResult = 0;
        int actualResult = MinimumNumberMovesToSort.minimumNumberMovesToSort(numbers);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinimumNumberMovesToSortWithOneElement(){
        int[] numbers = {1};
        int expectedResult = 0;
        int actualResult = MinimumNumberMovesToSort.minimumNumberMovesToSort(numbers);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinimumNumberMovesToSortWithAscArray(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int expectedResult = 0;
        int actualResult = MinimumNumberMovesToSort.minimumNumberMovesToSort(numbers);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinimumNumberMovesToSortWithArray(){
        int[] numbers = {6, 5, 4, 3, 2, 1};
        int expectedResult = 15;
        int actualResult = MinimumNumberMovesToSort.minimumNumberMovesToSort(numbers);
        Assert.assertEquals(actualResult, expectedResult);

        int[] numbers2 = {3, 1, 4, 2, 6, 5};
        int expectedResult2 = 4;
        int actualResult2 = MinimumNumberMovesToSort.minimumNumberMovesToSort(numbers2);
        Assert.assertEquals(actualResult2, expectedResult2);
    }
}
