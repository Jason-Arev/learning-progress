# 🚨 Java Exception Handling Cheat Sheet

## 🔁 Basic Structure

```java
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Handle exception
} finally {
    // Code that always runs (optional)
}
```

## ⚠️ Common Exception Types

- `ArithmeticException` → divide by zero  
- `NullPointerException` → accessing null object  
- `ArrayIndexOutOfBoundsException` → invalid index  
- `NumberFormatException` → bad number parse  
- `IOException` → file or input/output issues  
- `FileNotFoundException` → file doesn't exist  
- `IllegalArgumentException` → bad argument passed  
- `ClassCastException` → invalid type cast

## 🧰 Throwing Exceptions

```java
throw new IllegalArgumentException("Invalid input");
```

## ✋ Creating Custom Exceptions

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

## 🔐 Multiple Catch Blocks

```java
try {
    // risky code
} catch (IOException e) {
    // handle IO errors
} catch (Exception e) {
    // fallback for any other exception
}
```

## ✅ Example

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Can't divide by zero!");
}
```