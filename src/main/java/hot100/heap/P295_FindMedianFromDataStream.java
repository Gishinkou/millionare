package hot100.heap;

/**
 * mybatis 295. 数据流的中位数
 */
public class P295_FindMedianFromDataStream {

    public static class MedianFinder {
        public MedianFinder() {
            // TODO
        }
        public void addNum(int num) {
            // TODO
        }
        public double findMedian() {
            // TODO
            return 0.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder m = new MedianFinder();
        m.addNum(1); m.addNum(2);
        System.out.println("median = " + m.findMedian() + " (expect 1.5)");
        m.addNum(3);
        System.out.println("median = " + m.findMedian() + " (expect 2.0)");
    }
}
