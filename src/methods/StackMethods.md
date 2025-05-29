# 🥞 Java Stack Methods Cheat Sheet

```java
import java.util.Stack;

Stack<String> stack = new Stack<>();
```

## 🔁 Core Stack Methods

- `stack.push("item")` → adds item to the top  
- `stack.pop()` → removes and returns top item (throws exception if empty)  
- `stack.peek()` → returns top item without removing  
- `stack.isEmpty()` → checks if stack is empty  
- `stack.size()` → number of elements  
- `stack.search("item")` → returns 1-based position from top, -1 if not found  

## 🧪 Example

```java
stack.push("A");
stack.push("B");
System.out.println(stack.peek()); // B
stack.pop();                      // removes B
System.out.println(stack.peek()); // A
```

## ⚠️ Notes

- Stack uses **LIFO**: Last In, First Out  
- Consider using `Deque` for modern stack usage (`ArrayDeque`)