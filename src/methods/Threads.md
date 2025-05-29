# 🧵 Java Threads & Concurrency Cheat Sheet

```java
// Option 1: Extend Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }
}

// Option 2: Implement Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running...");
    }
}
```

## 🔧 Creating & Starting Threads

```java
Thread t1 = new MyThread();
t1.start();

Thread t2 = new Thread(new MyRunnable());
t2.start();
```

## 🛠️ Common Thread Methods

- `start()` → begins execution  
- `run()` → contains thread logic  
- `sleep(ms)` → pause thread  
- `join()` → waits for thread to finish  
- `isAlive()` → checks if thread is still running  
- `interrupt()` → signals interruption  

## 🔐 Synchronization (Avoiding Conflicts)

```java
synchronized void myMethod() {
    // only one thread at a time
}
```

## 🔁 Volatile

- `volatile` keyword ensures changes are visible to all threads  
```java
volatile boolean running = true;
```

## 🚦 Thread States

- NEW  
- RUNNABLE  
- BLOCKED  
- WAITING  
- TIMED_WAITING  
- TERMINATED

## ⚠️ Tips

- Always prefer `Runnable` over extending `Thread` for flexibility  
- Use `ExecutorService` or thread pools for advanced control