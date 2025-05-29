# 🔗 Java Set & HashSet Methods Cheat Sheet

```java
import java.util.HashSet;
import java.util.Set;

Set<String> set = new HashSet<>();
```

## 🔧 Common Set Methods

- `set.add("item")` → adds element (no duplicates)  
- `set.remove("item")` → removes element  
- `set.contains("item")` → checks if element exists  
- `set.size()` → number of elements  
- `set.isEmpty()` → true if empty  
- `set.clear()` → removes all elements  
- `set.iterator()` → returns iterator for loop  
- `set.addAll(otherSet)` → adds all elements from another set  
- `set.retainAll(otherSet)` → keeps only elements in both  
- `set.removeAll(otherSet)` → removes all in other set

## 🧪 Iterating Over a Set

```java
for (String item : set) {
    System.out.println(item);
}
```

## 🔁 HashSet vs LinkedHashSet vs TreeSet

- `HashSet` → no order, fast performance  
- `LinkedHashSet` → maintains insertion order  
- `TreeSet` → sorted order (implements `NavigableSet`)