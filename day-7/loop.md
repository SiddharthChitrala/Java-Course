# **Java Loops — Complete Markdown Guide**

This file covers all **Java loops** with explanations, tables, and examples.

---

# ## **1. for Loop**

Used when you know the number of repetitions.

### **Syntax:**

```java
for (initialization; condition; update) {
    // code
}
```

### **Example:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### **Table:**

| Part           | Meaning                   |
| -------------- | ------------------------- |
| Initialization | Runs once at the start    |
| Condition      | Loop runs while true      |
| Update         | Runs after each iteration |

---

# ## **2. while Loop**

Used when you don't know the number of repetitions.

### **Syntax:**

```java
while (condition) {
    // code
}
```

### **Example:**

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

# ## **3. do-while Loop**

Executes the body **at least once**.

### **Syntax:**

```java
do {
    // code
} while (condition);
```

### **Example:**

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

# ## **4. Enhanced for Loop (for-each)**

Used for arrays and collections.

### **Syntax:**

```java
for (type variable : arrayName) {
    // code
}
```

### **Example:**

```java
int[] numbers = {10, 20, 30};
for (int n : numbers) {
    System.out.println(n);
}
```

---

# ## **5. Nested Loops**

Loops inside another loop.

### **Example:**

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println(i + ", " + j);
    }
}
```

---

# ## **6. Loop Control Statements**

### **break** → exit the loop

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

### **continue** → skip one iteration

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```

---

# ## **Comparison Table of Loops**

| Loop Type | Runs at least once? | Best Use               |
| --------- | ------------------- | ---------------------- |
| for       | No                  | Fixed repetitions      |
| while     | No                  | Unknown repetitions    |
| do-while  | **Yes**             | Must run at least once |
| for-each  | No                  | Arrays & collections   |

---

# ## **Complete Example Using All Loops**

```java
public class LoopDemo {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("for: " + i);
        }

        // while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("while: " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("do-while: " + k);
            k++;
        } while (k <= 3);

        // for-each loop
        int[] nums = {1, 2, 3};
        for (int n : nums) {
            System.out.println("for-each: " + n);
        }
    }
}
```