package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 17. LetterCombinationsOfPhoneNumber
 */
public class P17_LetterCombinationsOfPhoneNumber {

    public List<String> letterCombinations(String digits) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P17_LetterCombinationsOfPhoneNumber s = new P17_LetterCombinationsOfPhoneNumber();
        Assert.eq(s.letterCombinations("23").size(), 9);
        Assert.summary();
    }
}
