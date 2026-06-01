package hot100.stack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 394. DecodeString
 */
public class P394_DecodeString {

    public String decodeString(String s) {
        // TODO
        return "";
    }

    public static void main(String[] args) {
        P394_DecodeString s = new P394_DecodeString();
        Assert.eq(s.decodeString("3[a]2[bc]"), "aaabcbc");
        Assert.summary();
    }
}
