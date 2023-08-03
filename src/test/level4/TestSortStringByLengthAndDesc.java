package test.level4;

import level4.SortStringByLengthAndDesc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortStringByLengthAndDesc {
    @Test
    public void testSortStringByLengthAndDesc(){
        String[] strings = {};
        String[] expected = {};
        String[] actual = SortStringByLengthAndDesc.sortedStrings(strings);
        Assert.assertEquals(actual, expected);

        String[] strings2 = {"ab", "abcdef", "a", "abc"};
        String[] expected2 = {"abcdef", "abc", "ab", "a"};
        String[] actual2 = SortStringByLengthAndDesc.sortedStrings(strings2);
        Assert.assertEquals(actual2, expected2);

        String[] strings3 = {"bcd", "ab", "abcd", "abc"};
        String[] expected3 = {"abcd", "abc","bcd","ab"};
        String[] actual3 = SortStringByLengthAndDesc.sortedStrings(strings3);
        Assert.assertEquals(actual3, expected3);

        String[] strings4 = {"xuan", "ha", "thu", "dong"};
        String[] expected4 = {"dong", "xuan", "thu", "ha"};
        String[] actual4 = SortStringByLengthAndDesc.sortedStrings(strings4);
        Assert.assertEquals(actual4, expected4);

        String[] strings5 = {"the quick brown fox", "the lazy dog jumps over the fence", "the cat in the hat"};
        String[] expected5 = {"the lazy dog jumps over the fence", "the quick brown fox", "the cat in the hat"};
        String[] actual5 = SortStringByLengthAndDesc.sortedStrings(strings5);
        Assert.assertEquals(actual5, expected5);

        String[] strings6 = {"aabbdd", "abc", "aabbcc","aa"};
        String[] expected6 = {"aabbcc", "aabbdd", "abc", "aa"};
        String[] actual6 = SortStringByLengthAndDesc.sortedStrings(strings6);
        Assert.assertEquals(actual6, expected6);
    }
}
