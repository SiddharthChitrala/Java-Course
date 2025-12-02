# **Java Conditional Statements — Complete Guide**

This file contains all Java conditional statements with syntax, examples, and tables.

---

# ## **1. if Statement**

Runs a block of code only if the condition is true.

### **Syntax**

```java
if (condition) {
    // code
}
```

### **Example**

```java
int age = 20;
if (age >= 18) {
    System.out.println("You are an adult.");
}
```

---

# ## **2. if-else Statement**

Runs one block if condition is true, otherwise runs the else block.

### **Syntax**

```java
if (condition) {
    // true block
} else {
    // false block
}
```

### **Example**

```java
int marks = 40;
if (marks >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

---

# ## **3. if-else-if Ladder**

Used when multiple conditions must be checked.

### **Syntax**

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else if (condition3) {
    // code
} else {
    // default
}
```

### **Example**

```java
int score = 85;

if (score >= 90) {
    System.out.println("A Grade");
} else if (score >= 80) {
    System.out.println("B Grade");
} else if (score >= 70) {
    System.out.println("C Grade");
} else {
    System.out.println("Fail");
}
```

---

# ## **4. Nested if Statement**

An **if inside another if**.

### **Syntax**

```java
if (condition1) {
    if (condition2) {
        // code
    }
}
```

### **Example**

```java
int age = 30;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry allowed");
    }
}
```

---

# ## **5. switch Statement**

Used when comparing one variable with multiple values.

### **Syntax**

```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}
```

### **Example**

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

# ## **6. Enhanced switch (Java 14+)**

Cleaner syntax.

### **Syntax**

```java
switch (value) {
    case 1 -> System.out.println("One");
    case 2 -> System.out.println("Two");
    default -> System.out.println("Other");
}
```

### **Example**

```java
int num = 2;

switch (num) {
    case 1 -> System.out.println("One");
    case 2 -> System.out.println("Two");
    default -> System.out.println("Other");
}
```

---

# ## **Comparison Table**

| Statement           | Use Case                     | Supports Multiple Conditions? |
| ------------------- | ---------------------------- | ----------------------------- |
| **if**              | Single condition             | ❌                             |
| **if-else**         | True/false branching         | ❌                             |
| **if-else-if**      | Multiple conditions          | ✔                             |
| **nested if**       | Condition inside a condition | ✔                             |
| **switch**          | Many equal-value checks      | ✔                             |
| **enhanced switch** | Cleaner switch syntax        | ✔                             |

---

# ## **Complete Program (All Conditional Statements)**

```java
public class ConditionalDemo {
    public static void main(String[] args) {
        int n = 10;

        if (n > 0) System.out.println("Positive");
        else System.out.println("Negative");

        if (n > 10) System.out.println("Greater than 10");
        else if (n == 10) System.out.println("Equal to 10");
        else System.out.println("Less than 10");

        switch (n) {
            case 5 -> System.out.println("Five");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("Other number");
        }
    }
}
```

---

## DSA-Style Conditional Statement Examples

### 1. **Check if a Number is Even or Odd**

```java
int n = 17;
if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### 2. **Find the Largest of Three Numbers**

```java
int a = 20, b = 50, c = 35;
if (a >= b && a >= c) {
    System.out.println("Largest: " + a);
} else if (b >= a && b >= c) {
    System.out.println("Largest: " + b);
} else {
    System.out.println("Largest: " + c);
}
```

### 3. **Check if Character is Vowel or Consonant**

```java
char ch = 'e';
if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||
    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    System.out.println("Vowel");
} else {
    System.out.println("Consonant");
}
```

### 4. **Check Leap Year**

```java
int year = 2028;
if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    System.out.println("Leap Year");
} else {
    System.out.println("Not a Leap Year");
}
```

### 5. **Absolute Value Without Math.abs()**

```java
int n = -9;
if (n < 0) {
    n = -n;
}
System.out.println("Absolute value: " + n);
```

### 6. **Grade Checker**

```java
int marks = 82;
if (marks >= 90) System.out.println("A");
else if (marks >= 80) System.out.println("B");
else if (marks >= 70) System.out.println("C");
else if (marks >= 60) System.out.println("D");
else System.out.println("F");
```

### 7. **Check if Number is Prime (Basic)**

```java
int n = 19;
boolean prime = true;
if (n <= 1) prime = false;
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        prime = false;
        break;
    }
}
if (prime) System.out.println("Prime");
else System.out.println("Not Prime");
```
