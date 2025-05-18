import java.util.*;

class TrieNode {
    HashMap<Character, TrieNode> children = new HashMap<>();// takes in character to get end of a word
    boolean endOfWord = false; //default
}

public class PrefixTree {
    private final TrieNode root; //current

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) { //create a new word
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            cur.children.putIfAbsent(c, new TrieNode()); // put if !contains(c)
            cur = cur.children.get(c);
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (!cur.children.containsKey(c)) {
                return false;
            }
            cur = cur.children.get(c);
        }
        return cur.endOfWord; //returns true if the word is found
    }

    public boolean startsWith(String prefix) { //returns true if there is a word in the trie that starts with the given prefix
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (!cur.children.containsKey(c)) {
                return false;
            }
            cur = cur.children.get(c);
        }
        return true;
    }

    public int countWordsStartingWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (!cur.children.containsKey(c)) {
                return 0;
            }
            cur = cur.children.get(c);
        }
        return countFromNode(cur); // count words from this node
    }

    private int countFromNode(TrieNode node) {
        int count = node.endOfWord ? 1 : 0; // count this word if endOfWord is true
        // count all children
        for (TrieNode child : node.children.values()) { 
            count += countFromNode(child);  // recursive call to count words in the subtree
        }
        return count;
    }

}