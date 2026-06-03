package hot100.hashtable;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 49. GroupAnagrams
 */
public class P49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent(String.valueOf(arr), k -> new ArrayList<>()).add(strs[i]);
        }
        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        P49_GroupAnagrams s = new P49_GroupAnagrams();
        Assert.eq(s.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size(), 3);
        Assert.summary();
    }
}
