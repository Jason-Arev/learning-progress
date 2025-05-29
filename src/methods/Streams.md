# 🌊 Java Streams API Cheat Sheet

```java
import java.util.*;
import java.util.stream.*;
```

## 🔧 Creating Streams

```java
Stream<String> stream = list.stream();
IntStream intStream = Arrays.stream(new int[]{1, 2, 3});
```

## 🛠️ Common Stream Methods

- `stream.filter(predicate)` → filter elements  
- `stream.map(func)` → transform each element  
- `stream.forEach(action)` → perform action on each  
- `stream.collect(Collectors.toList())` → gather results  
- `stream.sorted()` → sort elements  
- `stream.distinct()` → remove duplicates  
- `stream.limit(n)` → limit result size  
- `stream.skip(n)` → skip first n elements  
- `stream.reduce(identity, accumulator)` → reduce to single value  
- `stream.anyMatch()`, `allMatch()`, `noneMatch()` → match checks  
- `stream.count()` → count elements  
- `stream.findFirst()` → get first match (optional)  
- `stream.max()`, `stream.min()` → find max/min (with comparator)

## ✅ Example

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

List<String> filtered = names.stream()
    .filter(name -> name.startsWith("A"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());

filtered.forEach(System.out::println);
```

## 🧠 Notes

- Streams don’t modify the original collection.  
- They support **lazy evaluation** (ops aren’t run until terminal method like `.collect()` or `.forEach()`).