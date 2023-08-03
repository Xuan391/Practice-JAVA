package test.level3;

import level3.LongestPalindromeLength;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestPalindromeLength {
    @Test
    public void TestWithEmptyString(){
        String str = "";
        int expectedResult = 0;
        int actualResult = LongestPalindromeLength.findLongestPalindromeLength(str);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void TestWithOneCharacter(){
        String str = "a";
        int expectedResult = 1;
        int actualResult = LongestPalindromeLength.findLongestPalindromeLength(str);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void TestWithTwoCharacter(){
        String str = "ab";
        int expectedResult = 1;
        int actualResult = LongestPalindromeLength.findLongestPalindromeLength(str);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void TestWithManyCharacter(){
        String str = "abcdef";
        int expectedResult = 1;
        int actualResult = LongestPalindromeLength.findLongestPalindromeLength(str);
        Assert.assertEquals(actualResult,expectedResult);

        String str2 = "abca";
        int expectedResult2 = 3;
        int actualResult2 = LongestPalindromeLength.findLongestPalindromeLength(str2);
        Assert.assertEquals(actualResult2,expectedResult2);

        String str3 = "abcab";
        int expectedResult3 = 5;
        int actualResult3 = LongestPalindromeLength.findLongestPalindromeLength(str3);
        Assert.assertEquals(actualResult3,expectedResult3);

        String str4 = "thanhxuan";
        int expectedResult4 = 7;
        int actualResult4 = LongestPalindromeLength.findLongestPalindromeLength(str4);
        Assert.assertEquals(actualResult4,expectedResult4);

        String str5 = "nguyenthanhxuan";
        int expectedResult5 = 11;
        int actualResult5 = LongestPalindromeLength.findLongestPalindromeLength(str5);
        Assert.assertEquals(actualResult5,expectedResult5);

        String str6 = "A man a plan a canal Panama";
        int expectedResult6 = 23;
        int actualResult6 = LongestPalindromeLength.findLongestPalindromeLength(str6);
        Assert.assertEquals(actualResult6,expectedResult6);

    }
}
