package hot100.slidingwindow;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 3. LongestSubstringWithoutRepeating
 */
public class P3_LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P3_LongestSubstringWithoutRepeating s = new P3_LongestSubstringWithoutRepeating();
        Assert.eq(s.lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.eq(s.lengthOfLongestSubstring("bbbbb"), 1);
        Assert.eq(s.lengthOfLongestSubstring("pwwkew"), 3);
        Assert.summary();
    }
}
