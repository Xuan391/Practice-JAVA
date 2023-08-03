package test.level4;

import level4.LongestCommonSubstringWithMinLengthTarget;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestCommonSubstringWithMinLengthTarget {
    @Test
    public void testLongestCommonSubstringWithMinLengthTarget(){
        String[] strings = {"ab", "abc","af"};
        int target = 2;
        String[] expected = {"ab", "abc"};
        String[] actual = LongestCommonSubstringWithMinLengthTarget.getLargestOverlap(strings,target);
        Assert.assertEquals(actual,expected);

        String[] strings2 = {"ab", "abc","af"};
        int target2 = 3;
        String[] expected2 = {};
        String[] actual2 = LongestCommonSubstringWithMinLengthTarget.getLargestOverlap(strings2,target2);
        Assert.assertEquals(actual2,expected2);

        String[] strings3 = {"ab", "abc","af"};
        int target3 = 2;
        String[] expected3 = {"ab", "abc"};
        String[] actual3 = LongestCommonSubstringWithMinLengthTarget.getLargestOverlap(strings3,target3);
        Assert.assertEquals(actual3,expected3);

        String[] strings4 = {"ab", "abc","af"};
        int target4 = 2;
        String[] expected4 = {"ab", "abc"};
        String[] actual4 = LongestCommonSubstringWithMinLengthTarget.getLargestOverlap(strings4,target4);
        Assert.assertEquals(actual4,expected4);

        String[] strings5 = {"ab", "abc","af"};
        int target5 = 2;
        String[] expected5 = {"ab", "abc"};
        String[] actual5 = LongestCommonSubstringWithMinLengthTarget.getLargestOverlap(strings5,target5);
        Assert.assertEquals(actual5,expected5);
    }
    @Test
    public void testGetSubstrings() {
        String str = "abcdefg";
        int k = 3;
        String[] expected = {"abc", "bcd", "cde", "def", "efg"};
        Assert.assertEquals(expected, LongestCommonSubstringWithMinLengthTarget.getSubstrings(str, k));
    }

    @Test
    public void testContainsSubstring() {
        String str = "abcdefg";
        String substring = "cde";
        Assert.assertTrue(LongestCommonSubstringWithMinLengthTarget.containsSubstring(str, substring));

        substring = "xyz";
        Assert.assertFalse(LongestCommonSubstringWithMinLengthTarget.containsSubstring(str, substring));
    }

    @Test
    public void testGetLargestOverlap() {
        String[] strings = {"abcdefg", "abcde", "abcdef", "ab", "abc"};
        int k = 5;
        String[] expected = {"abcdefg", "abcdef"};
        Assert.assertEquals(expected, LongestCommonSubstringWithMinLengthTarget.getLargestOverlap(strings, k));
    }
}
