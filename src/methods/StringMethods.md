# 📌 Java String Methods Cheat Sheet

```java
String str = " Hello World ";
```

## 🔤 Basic String Methods

- `str.length()` → returns the length of the string.  
- `str.toLowerCase()` → converts to lowercase.  
- `str.toUpperCase()` → converts to uppercase.  
- `str.trim()` → removes leading/trailing whitespace.  
- `str.substring(start, end)` → gets substring from start to end-1.  
- `str.replace("old", "new")` → replaces old with new.  
- `str.charAt(index)` → gets character at index.  
- `str.indexOf("text")` → gets first index of substring.  
- `str.equals("text")` → checks exact match.  
- `str.equalsIgnoreCase("text")` → match ignoring case.  
- `str.contains("text")` → returns true if text found.  
- `str.startsWith("text")` → checks prefix.  
- `str.endsWith("text")` → checks suffix.  
- `str.split("regex")` → splits string into array.  
- `str.replaceAll("regex", "replacement")` → replace with regex.  
- `str.isEmpty()` → true if string is empty.  
```

# ✅ Example

```java
String[] words = str.split(" ");
for (String word : words) {
    System.out.println(word);
}
```