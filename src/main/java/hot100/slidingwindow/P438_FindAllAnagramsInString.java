package hot100.slidingwindow;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 438. FindAllAnagramsInString
 */
public class P438_FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P438_FindAllAnagramsInString s = new P438_FindAllAnagramsInString();
        Assert.eq(s.findAnagrams("cbaebabacd", "abc").toString(), "[0, 6]");
        Assert.summary();
    }
}
