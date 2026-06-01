package hot100.common;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** 简单断言工具:打印 PASS/FAIL,不抛异常,便于 main 中跑多条 case */
public class Assert {
    private static int pass = 0;
    private static int fail = 0;

    public static void eq(Object actual, Object expected) {
        eq("case " + (pass + fail + 1), actual, expected);
    }

    public static void eq(String name, Object actual, Object expected) {
        boolean ok;
        if (actual instanceof int[] a && expected instanceof int[] e) {
            ok = Arrays.equals(a, e);
            actual = Arrays.toString(a);
            expected = Arrays.toString(e);
        } else if (actual instanceof int[][] a && expected instanceof int[][] e) {
            ok = Arrays.deepEquals(a, e);
            actual = Arrays.deepToString(a);
            expected = Arrays.deepToString(e);
        } else if (actual instanceof Object[] a && expected instanceof Object[] e) {
            ok = Arrays.deepEquals(a, e);
            actual = Arrays.deepToString(a);
            expected = Arrays.deepToString(e);
        } else {
            ok = Objects.equals(actual, expected);
        }
        if (ok) { pass++; System.out.println("[PASS] " + name + " => " + actual); }
        else    { fail++; System.out.println("[FAIL] " + name + " => actual=" + actual + " expected=" + expected); }
    }

    public static void summary() {
        System.out.println("---- " + pass + " passed, " + fail + " failed ----");
        pass = 0; fail = 0;
    }
}
