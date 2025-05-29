# 📦 Java Imports & Utilities Cheat Sheet

## 🔁 `java.util.*`
- `ArrayList<T>` → resizable array
- `HashMap<K,V>` → key-value map
- `HashSet<T>` → unique set
- `Stack<T>` → LIFO stack
- `Queue<T>` → FIFO queue
- `Collections` → utility functions

## 🧾 `java.io.*`
- `File`, `FileReader`, `FileWriter`
- `BufferedReader`, `BufferedWriter`

## 🔢 `java.math.*`
- `BigInteger`, `BigDecimal`

## ⏰ `java.time.*`
- `LocalDate`, `LocalTime`, `LocalDateTime`
- `Period`, `Duration`

## 🔍 `java.util.regex.*`
- `Pattern`, `Matcher`

## 📂 `java.nio.file.*`
- `Files`, `Paths`

## 💡 `java.lang.*` *(Auto-imported)*
- `Math`, `System`, `String`, etc.

# ✅ Examples

```java
ArrayList<String> list = new ArrayList<>();
HashMap<String, Integer> map = new HashMap<>();
Stack<Integer> stack = new Stack<>();
Queue<String> queue = new LinkedList<>();

LocalDate today = LocalDate.now();

Pattern pattern = Pattern.compile("\\d+");
```