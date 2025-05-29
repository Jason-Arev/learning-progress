# 💾 Java Serialization Cheat Sheet

## 🧱 What Is Serialization?

Serialization = converting an object into a byte stream  
Deserialization = converting byte stream back into an object

## 🧩 Requirements

- Class must implement `Serializable` interface  
```java
import java.io.Serializable;

class User implements Serializable {
    private String name;
    private int age;
}
```

## 💾 Writing to a File (Serialization)

```java
import java.io.*;

User user = new User("Jason", 21);

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
out.writeObject(user);
out.close();
```

## 📥 Reading from a File (Deserialization)

```java
ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
User user = (User) in.readObject();
in.close();
```

## ⚠️ Notes

- `serialVersionUID` is used to ensure class compatibility during deserialization  
```java
private static final long serialVersionUID = 1L;
```

- Transient fields (marked with `transient`) are skipped during serialization  
```java
private transient String password;
```