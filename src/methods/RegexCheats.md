# 🔍 Java Regex (Regular Expressions) Cheat Sheet

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;
```

## 🛠️ Core Regex Classes

- `Pattern` → compiles regex  
- `Matcher` → applies pattern to input string  

## 🔧 Common Pattern Methods

- `Pattern.compile("regex")` → creates regex pattern  
- `pattern.matcher("input")` → returns matcher for input  

## 🔧 Common Matcher Methods

- `matcher.find()` → finds next match  
- `matcher.matches()` → checks if entire string matches  
- `matcher.group()` → gets matched substring  
- `matcher.start()` → start index of match  
- `matcher.end()` → end index of match  

# 🧪 Useful Regex Patterns

- `\d` → digit  
- `\D` → non-digit  
- `\w` → word character (a-z, A-Z, 0-9, _)  
- `\W` → non-word  
- `\s` → whitespace  
- `\S` → non-whitespace  
- `.` → any character  
- `^` → start of string  
- `$` → end of string  
- `[a-z]` → lowercase letters  
- `[^abc]` → any char except a, b, or c  
- `(abc|def)` → matches "abc" or "def"  
- `a*`, `a+`, `a?`, `a{3}`, `a{2,5}` → quantifiers  

# ✅ Example

```java
String input = "abc123";
Pattern pattern = Pattern.compile("\\d+");
Matcher matcher = pattern.matcher(input);

while (matcher.find()) {
    System.out.println("Match: " + matcher.group());
}
```