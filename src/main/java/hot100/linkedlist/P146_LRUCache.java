package hot100.linkedlist;

/**
 * mybatis 146. LRU 缓存
 *
 * 提示:基于双向链表 + 哈希表。容量满时淘汰最久未使用。
 */
public class P146_LRUCache {

    public static class LRUCache {
        public LRUCache(int capacity) {
            // TODO
        }
        public int get(int key) {
            // TODO
            return -1;
        }
        public void put(int key, int value) {
            // TODO
        }
    }

    public static void main(String[] args) {
        LRUCache c = new LRUCache(2);
        c.put(1, 1);
        c.put(2, 2);
        System.out.println("get(1) = " + c.get(1) + " (expect 1)");
        c.put(3, 3);
        System.out.println("get(2) = " + c.get(2) + " (expect -1)");
        c.put(4, 4);
        System.out.println("get(1) = " + c.get(1) + " (expect -1)");
        System.out.println("get(3) = " + c.get(3) + " (expect 3)");
        System.out.println("get(4) = " + c.get(4) + " (expect 4)");
    }
}
