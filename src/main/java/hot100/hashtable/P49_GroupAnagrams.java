package hot100.hashtable;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 49. GroupAnagrams
 */
public class P49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P49_GroupAnagrams s = new P49_GroupAnagrams();
        Assert.eq(s.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size(), 3);
        Assert.summary();
    }
}
