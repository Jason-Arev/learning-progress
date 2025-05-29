# 🗺️ Java Map & HashMap Methods Cheat Sheet

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> map = new HashMap<>();
```

## 🔧 Common Map Methods

- `map.put(key, value)` → adds or updates key-value pair  
- `map.get(key)` → gets value by key  
- `map.containsKey(key)` → checks if key exists  
- `map.containsValue(value)` → checks if value exists  
- `map.remove(key)` → removes key and its value  
- `map.size()` → returns number of entries  
- `map.isEmpty()` → checks if map is empty  
- `map.clear()` → removes all entries  
- `map.keySet()` → returns set of keys  
- `map.values()` → returns collection of values  
- `map.entrySet()` → returns set of key-value pairs  

# ✅ Example

```java
Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);

System.out.println(scores.get("Alice")); // 90
System.out.println(scores.containsKey("Bob")); // true

for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```