# ⏰ Java Date & Time API Cheat Sheet

```java
import java.time.*;
```

## 📆 Core Classes

- `LocalDate` → date (YYYY-MM-DD)  
- `LocalTime` → time (HH:MM:SS)  
- `LocalDateTime` → date + time  
- `ZonedDateTime` → with time zone  
- `Period` → date-based amount (years, months, days)  
- `Duration` → time-based amount (hours, minutes, seconds)

## 🧪 Getting Current Date & Time

```java
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();
ZonedDateTime zoned = ZonedDateTime.now();
```

## 📐 Creating Specific Date/Time

```java
LocalDate birthday = LocalDate.of(2000, 5, 27);
LocalTime lunch = LocalTime.of(12, 30);
LocalDateTime meeting = LocalDateTime.of(2025, 6, 1, 9, 0);
```

## 🔧 Useful Methods

- `plusDays()`, `plusWeeks()`, `plusMonths()`  
- `minusDays()`, `minusYears()`  
- `getDayOfWeek()`, `getMonth()`, `getYear()`  
- `isBefore()`, `isAfter()`, `isEqual()`  

## 🧮 Period & Duration

```java
LocalDate start = LocalDate.of(2025, 1, 1);
LocalDate end = LocalDate.of(2025, 12, 31);
Period period = Period.between(start, end);
System.out.println(period.getMonths()); // 11

Duration duration = Duration.ofHours(3);
System.out.println(duration.toMinutes()); // 180
```

## 🕹️ Formatting & Parsing (Optional)

```java
import java.time.format.DateTimeFormatter;

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
String formatted = date.format(formatter);
LocalDate parsed = LocalDate.parse("27-05-2025", formatter);
```