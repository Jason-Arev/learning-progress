# 📂 Java File Paths Cheat Sheet

```java
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
```

## 🧱 Using `File`

```java
File file = new File("data.txt");

file.exists();          // true if file exists
file.getAbsolutePath(); // full path
file.getParent();       // parent directory
file.isDirectory();     // is it a directory?
file.createNewFile();   // create if doesn't exist
```

## 🛣️ Using `Path` and `Paths` (Modern Java)

```java
Path path = Paths.get("data.txt");

System.out.println(path.toAbsolutePath());
System.out.println(path.getFileName());
System.out.println(path.getParent());
System.out.println(path.getRoot());
```

## 🔧 Files Utility Methods

```java
import java.nio.file.Files;

Files.exists(path);       // check existence
Files.createFile(path);   // create file
Files.delete(path);       // delete file
Files.readAllLines(path); // read lines
```

## 🔁 Convert Between `File` and `Path`

```java
File file = new File("data.txt");
Path path = file.toPath();

File fileAgain = path.toFile();
```