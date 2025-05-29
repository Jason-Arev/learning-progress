# 📋 Java List & ArrayList Methods Cheat Sheet

```java
import java.util.ArrayList;
import java.util.List;

List<String> list = new ArrayList<>();
```

## 🔧 Common List Methods

- `list.add("item")` → adds item to end  
- `list.add(index, "item")` → adds item at index  
- `list.get(index)` → gets element at index  
- `list.set(index, "item")` → replaces element at index  
- `list.remove(index)` → removes element at index  
- `list.remove("item")` → removes first occurrence of item  
- `list.size()` → returns number of elements  
- `list.contains("item")` → checks if item is in list  
- `list.indexOf("item")` → returns index of first match  
- `list.lastIndexOf("item")` → returns last match index  
- `list.isEmpty()` → checks if list is empty  
- `list.clear()` → removes all elements  
- `list.subList(start, end)` → returns portion of list  
- `Collections.sort(list)` → sorts list (need import)  
- `Collections.reverse(list)` → reverses list  

# ✅ Example

```java
List<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
System.out.println(numbers.get(1)); // 20
numbers.remove(Integer.valueOf(20));
System.out.println(numbers); // [10, 30]
```