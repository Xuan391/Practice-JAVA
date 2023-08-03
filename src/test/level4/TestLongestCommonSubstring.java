package test.level4;

import level4.LongestCommonSubstring;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestCommonSubstring {
    @Test
    public void testLongestCommonSubstring(){
        String[] strings = {};
        int expected = 0;
        int actual = LongestCommonSubstring.findLongestCommonSubstring(strings);
        Assert.assertEquals(actual, expected);

        String[] strings1 = {"abcdefg", "abcde", "abcdef", "ab", "abc"};
        int expected1 = 2;
        int actual1 = LongestCommonSubstring.findLongestCommonSubstring(strings1);
        Assert.assertEquals(actual1, expected1);

        String[] strings2 = {"programming", "programmer", "program"};
        int expected2 = 7;
        int actual2 = LongestCommonSubstring.findLongestCommonSubstring(strings2);
        Assert.assertEquals(actual2, expected2);

        String[] strings3 = {"hello", "world", "jelly"};
        int expected3 = 1;
        int actual3 = LongestCommonSubstring.findLongestCommonSubstring(strings3);
        Assert.assertEquals(actual3, expected3);

        String[] strings4 = {"abcd", "ab", "abcd", "ab", "abcd"};
        int expected4 = 2;
        int actual4= LongestCommonSubstring.findLongestCommonSubstring(strings4);
        Assert.assertEquals(actual4, expected4);
    }

}
