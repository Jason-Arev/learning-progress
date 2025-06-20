import java.util.*;
@SuppressWarnings("unused")
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

@SuppressWarnings("unused")
class Solution {
  public List<List<Integer>> verticalOrder(TreeNode root) {
    List<List<Integer>> output = new ArrayList<>();
    if (root == null) {
      return output;
    }

    Map<Integer, ArrayList<Integer>> columnTable = new HashMap<>();
    Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
    int column = 0;
    queue.offer(new Pair<>(root, column));

    while (!queue.isEmpty()) {
      Pair<TreeNode, Integer> p = queue.poll();
      root = p.getKey();
      column = p.getValue();

      if (root != null) {
        if (!columnTable.containsKey(column)) {
          columnTable.put(column, new ArrayList<>());
        }
        columnTable.get(column).add(root.val);

        queue.offer(new Pair<>(root.left, column - 1));
        queue.offer(new Pair<>(root.right, column + 1));
      }
    }

    List<Integer> sortedKeys = new ArrayList<>(columnTable.keySet());
    Collections.sort(sortedKeys);
    for(int k : sortedKeys) {
      output.add(columnTable.get(k));
    }

    return output;
  }
}