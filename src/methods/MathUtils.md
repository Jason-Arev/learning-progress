# ➗ Java Math Utilities Cheat Sheet

```java
import java.lang.Math; // Auto-imported
```

## 🔢 Common Math Methods

- `Math.abs(x)` → absolute value  
- `Math.max(a, b)` → larger of two values  
- `Math.min(a, b)` → smaller of two values  
- `Math.pow(a, b)` → a raised to power b  
- `Math.sqrt(x)` → square root  
- `Math.cbrt(x)` → cube root  
- `Math.round(x)` → rounds to nearest long  
- `Math.floor(x)` → rounds down  
- `Math.ceil(x)` → rounds up  
- `Math.random()` → random number between 0.0 and 1.0  
- `Math.log(x)` → natural log (ln)  
- `Math.log10(x)` → base-10 log  
- `Math.exp(x)` → e^x  
- `Math.toRadians(degrees)` → converts to radians  
- `Math.toDegrees(radians)` → converts to degrees  
- `Math.PI`, `Math.E` → constants for π and e

## 🎲 Example

```java
int max = Math.max(10, 20);        // 20
double root = Math.sqrt(25);      // 5.0
double rand = Math.random();      // e.g., 0.6948
int rounded = Math.round(3.6f);   // 4
```