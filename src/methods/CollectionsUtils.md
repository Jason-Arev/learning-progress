# 🧺 Java Collections Utility Methods Cheat Sheet

```java
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
```

## 🧰 Sorting & Reversing

- `Collections.sort(list)` → sorts in natural order  
- `Collections.sort(list, comparator)` → custom sort  
- `Collections.reverse(list)` → reverses order  

## 🔄 Shuffling & Rotating

- `Collections.shuffle(list)` → random order  
- `Collections.rotate(list, distance)` → rotates elements  

## 🔍 Searching & Replacing

- `Collections.binarySearch(list, key)` → search sorted list  
- `Collections.replaceAll(list, oldVal, newVal)` → replace all occurrences  

## 📊 Min & Max

- `Collections.min(list)`  
- `Collections.max(list)`  

## 🧱 Immutable Collections

- `Collections.unmodifiableList(list)`  
- `Collections.emptyList()`  
- `Collections.singletonList(item)`  

## 🛡️ Thread-Safe Versions

- `Collections.synchronizedList(list)`  
- `Collections.synchronizedMap(map)`  

## ✅ Example

```java
List<String> list = new ArrayList<>();
list.add("C");
list.add("A");
list.add("B");

Collections.sort(list);
Collections.reverse(list);
Collections.shuffle(list);
```