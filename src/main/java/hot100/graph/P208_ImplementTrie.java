package hot100.graph;

/**
 * mybatis 208. 实现 Trie (前缀树)
 */
public class P208_ImplementTrie {

    public static class Trie {
        public Trie() {
            // TODO
        }
        public void insert(String word) {
            // TODO
        }
        public boolean search(String word) {
            // TODO
            return false;
        }
        public boolean startsWith(String prefix) {
            // TODO
            return false;
        }
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("apple");
        System.out.println("search apple = " + t.search("apple") + " (expect true)");
        System.out.println("search app = " + t.search("app") + " (expect false)");
        System.out.println("startsWith app = " + t.startsWith("app") + " (expect true)");
        t.insert("app");
        System.out.println("search app = " + t.search("app") + " (expect true)");
    }
}
