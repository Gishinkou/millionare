package hot100.greedy;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 763. PartitionLabels
 */
public class P763_PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P763_PartitionLabels s = new P763_PartitionLabels();
        Assert.eq(s.partitionLabels("ababcbacadefegdehijhklij").toString(), "[9, 7, 8]");
        Assert.summary();
    }
}
