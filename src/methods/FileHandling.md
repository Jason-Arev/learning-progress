# 📂 Java File Handling Cheat Sheet

```java
import java.io.*;
```

## 📄 Reading Files

### 🔹 Using `BufferedReader`
```java
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
reader.close();
```

### 🔹 Using `Scanner`
```java
Scanner scanner = new Scanner(new File("file.txt"));
while (scanner.hasNextLine()) {
    System.out.println(scanner.nextLine());
}
scanner.close();
```

## 📝 Writing Files

### 🔹 Using `BufferedWriter`
```java
BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
writer.write("Hello World!");
writer.newLine();
writer.write("Second line");
writer.close();
```

### 🔹 Using `PrintWriter`
```java
PrintWriter writer = new PrintWriter("file.txt");
writer.println("Hello again!");
writer.close();
```

## ⚠️ Notes

- Always close readers/writers after use to avoid memory leaks.
- Use `FileWriter("file.txt", true)` to append instead of overwrite.

## 🔍 Useful Methods

- `new File("file.txt").exists()` → check if file exists  
- `file.delete()` → deletes file  
- `file.renameTo(new File("newname.txt"))` → renames file  
- `file.length()` → returns size in bytes