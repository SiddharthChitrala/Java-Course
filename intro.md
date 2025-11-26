# Java Learning Notes

## Introduction to Java

* Java is a high-level, object-oriented programming language.
* It is platform-independent because Java code runs on the Java Virtual Machine (JVM).
* Java is widely used for desktop applications, mobile development (especially Android), web applications, and enterprise systems.
* It follows the principle: **Write Once, Run Anywhere (WORA)**.
* Java is known for its simplicity, security, and strong community support.

---


## Basics of Java

### What is JDK?

* **JDK (Java Development Kit)** is the complete toolkit for Java developers.
* Includes: **JRE**, **compiler (javac)**, **debugger**, and other development tools.
* Required to write, compile, and run Java programs.

### What is JVM?

* **JVM (Java Virtual Machine)** runs Java bytecode.
* Converts bytecode to machine code using JIT (Just-In-Time) compiler.
* Provides platform independence.
* Handles memory management with Garbage Collection.

### What is JRE?

* **JRE (Java Runtime Environment)** contains JVM + libraries.
* Required only to run Java applications (not to develop).

### What is JShell?

* **JShell** is a REPL (Read–Eval–Print Loop) tool added in Java 9.
* Allows you to run Java code instantly without creating files.
* Great for beginners to test code quickly.
* Example usage:

  ```bash
  jshell
  jshell> System.out.println("Hello!");
  ```

---

## Java Syntax Basics

### Structure of a Java Program

Every Java program must have a class and a `main` method.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

* `public class Main` → Class declaration
* `public static void main` → Entry point of the program
* `System.out.println()` → Prints output to console

### Java Statements and Semicolons

* Each Java statement ends with a **;**

### Comments

```java
// Single-line comment
/* Multi-line 
   comment */
```