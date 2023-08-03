package test.level3;

import level3.SortedNumberDistinctCharacters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortedNumberDistinctCharacters {
    @Test
    public void testCountDistinctCharacters(){
        String str = "";
        int expectedResult = 0;
        int actualResult = SortedNumberDistinctCharacters.countDistinctCharacters(str);
        Assert.assertEquals(expectedResult,actualResult);

        String str2 = "a";
        int expectedResult2 = 1;
        int actualResult2 = SortedNumberDistinctCharacters.countDistinctCharacters(str2);
        Assert.assertEquals(expectedResult2,actualResult2);

        String str3 = "aaaa";
        int expectedResult3 = 1;
        int actualResult3 = SortedNumberDistinctCharacters.countDistinctCharacters(str3);
        Assert.assertEquals(expectedResult3,actualResult3);

        String str4 = "aaccbbb";
        int expectedResult4 = 3;
        int actualResult4 = SortedNumberDistinctCharacters.countDistinctCharacters(str4);
        Assert.assertEquals(expectedResult4,actualResult4);
    }

    @Test
    public void testSortedNumberDistinctCharacters(){
        String[] strings = {"xuan", "ha", "thu", "dong"};
        String[] expectedResult = {"ha", "thu", "xuan", "dong"};
        String[] actualResult = SortedNumberDistinctCharacters.sortStringsByDistinctCharacters(strings);
        Assert.assertEquals(actualResult,expectedResult);

        String[] strings2 = {"abcdf", "aacdf", "aaaaf", "aaadf"};
        String[] expectedResult2 = {"aaaaf", "aaadf", "aacdf", "abcdf"};
        String[] actualResult2 = SortedNumberDistinctCharacters.sortStringsByDistinctCharacters(strings2);
        Assert.assertEquals(actualResult2,expectedResult2);

        String[] strings3 = {"abcdef", "ab", "abcd", "abc", "abcdefg"};
        String[] expectedResult3 = {"ab", "abc", "abcd", "abcdef", "abcdefg"};
        String[] actualResult3 = SortedNumberDistinctCharacters.sortStringsByDistinctCharacters(strings3);
        Assert.assertEquals(actualResult3,expectedResult3);

        String[] strings4 = {"apple", "banana", "orange", "kiwi", "strawberry"};
        String[] expectedResult4 = {"banana", "kiwi", "apple", "orange", "strawberry"};
        String[] actualResult4 = SortedNumberDistinctCharacters.sortStringsByDistinctCharacters(strings4);
        Assert.assertEquals(actualResult4,expectedResult4);
    }
}
