# 🛒 Java Queue Methods Cheat Sheet

```java
import java.util.Queue;
import java.util.LinkedList;

Queue<String> queue = new LinkedList<>();
```

## 🔁 Core Queue Methods

- `queue.add("item")` → adds to the tail (throws exception if fails)  
- `queue.offer("item")` → adds to tail (returns false if fails)  
- `queue.remove()` → removes from head (throws exception if empty)  
- `queue.poll()` → removes from head (returns null if empty)  
- `queue.element()` → retrieves head (throws exception if empty)  
- `queue.peek()` → retrieves head (returns null if empty)  
- `queue.isEmpty()` → checks if empty  
- `queue.size()` → gets number of elements  
- `queue.clear()` → clears the queue

## 🧪 Example

```java
queue.offer("A");
queue.offer("B");
System.out.println(queue.peek()); // A
queue.poll();                     // removes A
System.out.println(queue.peek()); // B
```

## 📦 Notes

- `LinkedList` is the most common `Queue` implementation.  
- Use `PriorityQueue` for sorted/priority-based behavior.  
- `Deque` can act as both queue and stack.