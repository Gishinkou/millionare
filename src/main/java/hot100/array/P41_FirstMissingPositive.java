package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 41. FirstMissingPositive
 */
public class P41_FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        // 以原位置做 hash
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // 合法范围 1 - n
            int x = nums[i];
            while (x - 1 != i  && x > 0 && x <= n && nums[x - 1] != nums[i]) {
                // 交换直到 x 处于正确的位置 -> nums 数组的 x - 1 下标
                // 当前对应位置的内容
                int tmp = nums[x - 1];
                nums[x - 1] = nums[i];
                nums[i] = tmp;
                x = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        P41_FirstMissingPositive s = new P41_FirstMissingPositive();
        Assert.eq(s.firstMissingPositive(new int[]{1,2,0}), 3);
        Assert.eq(s.firstMissingPositive(new int[]{3,4,-1,1}), 2);
        Assert.summary();
    }
}
