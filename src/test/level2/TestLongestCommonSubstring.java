package test.level2;
import level2.LongestCommonsubString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestCommonSubstring {
    @Test
    public void testLongestCommonSubstring() {

        String result1 = LongestCommonsubString.longestCommonSubString("abcdgef","abcdefgh");
        Assert.assertEquals(result1,"abcd");

        String result2 = LongestCommonsubString.longestCommonSubString("a bc def","abcdef");
        Assert.assertEquals(result2, "def");

        String result3 = LongestCommonsubString.longestCommonSubString("NguyenThanhXuan", "nguyenthanhxuan");
        Assert.assertEquals(result3,"guyen");

        String result4 = LongestCommonsubString.longestCommonSubString("qưer1cdeftg","hsbvgtqưer1");
        Assert.assertEquals(result4, "qưer1");

        String result5 = LongestCommonsubString.longestCommonSubString("Nguyễn Thanh Xuân", "Thanh Xuân Hoàng");
        Assert.assertEquals(result5, "Thanh Xuân");

        String result6 = LongestCommonsubString.longestCommonSubString(" "," a");
        Assert.assertEquals(result6," ");

        String result7 = LongestCommonsubString.longestCommonSubString("","");
        Assert.assertEquals(result7,"");

        String result8 = LongestCommonsubString.longestCommonSubString("abcdef","abczyzcdef");
        Assert.assertEquals(result8,"cdef");

        String result9 = LongestCommonsubString.longestCommonSubString("abcdeabcdefef","abcdvaeabcdmfef");
        Assert.assertEquals(result9, "eabcd");

        String result10 = LongestCommonsubString.longestCommonSubString("thanhxuan","xuanthanh");
        Assert.assertEquals(result10, "thanh");
    }
}
