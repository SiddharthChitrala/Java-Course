# **Java Operators — Complete Guide**

This Markdown file covers **all Java operators** with tables and examples.

---

# ## **1. Arithmetic Operators**

| Operator | Description         | Example  | Output |
| -------- | ------------------- | -------- | ------ |
| `+`      | Addition            | `10 + 3` | `13`   |
| `-`      | Subtraction         | `10 - 3` | `7`    |
| `*`      | Multiplication      | `10 * 3` | `30`   |
| `/`      | Division            | `10 / 3` | `3`    |
| `%`      | Modulus (Remainder) | `10 % 3` | `1`    |

**Example:**

```java
int a = 10, b = 3;
System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3
System.out.println(a % b);  // 1
```

---

# ## **2. Assignment Operators**

| Operator | Meaning           | Example  |
| -------- | ----------------- | -------- |
| `=`      | Assign            | `x = 10` |
| `+=`     | Add & assign      | `x += 5` |
| `-=`     | Subtract & assign | `x -= 3` |
| `*=`     | Multiply & assign | `x *= 2` |
| `/=`     | Divide & assign   | `x /= 4` |
| `%=`     | Mod & assign      | `x %= 2` |

**Example:**

```java
int x = 5;
x += 3; // x = 8
```

---

# ## **3. Relational Operators**

| Operator | Description      | Example  |
| -------- | ---------------- | -------- |
| `==`     | Equal to         | `a == b` |
| `!=`     | Not equal        | `a != b` |
| `>`      | Greater than     | `a > b`  |
| `<`      | Less than        | `a < b`  |
| `>=`     | Greater or equal | `a >= b` |
| `<=`     | Less or equal    | `a <= b` |

**Example:**

```java
int a = 10, b = 20;
System.out.println(a < b);  // true
```

---

# ## **4. Logical Operators**

| Operator | Description | Example         | Result     |       |   |        |        |
| -------- | ----------- | --------------- | ---------- | ----- | - | ------ | ------ |
| `&&`     | Logical AND | `true && false` | `false`    |       |   |        |        |
| `        |             | `               | Logical OR | `true |   | false` | `true` |
| `!`      | Logical NOT | `!true`         | `false`    |       |   |        |        |

**Example:**

```java
int age = 25;
System.out.println(age > 18 && age < 30); // true
```

---

# ## **5. Unary Operators**

| Operator | Description | Example |
| -------- | ----------- | ------- |
| `++`     | Increment   | `x++`   |
| `--`     | Decrement   | `x--`   |
| `+`      | Unary plus  | `+x`    |
| `-`      | Unary minus | `-x`    |
| `!`      | Logical NOT | `!flag` |

**Example:**

```java
int x = 5;
x++;  // 6
```

---

# ## **6. Ternary Operator**

Syntax:

```java
condition ? value1 : value2;
```

**Example:**

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Child";
```

---

# ## **7. Bitwise Operators**

| Operator | Description          | Example    | Binary Operation | Result          |       |       |            |
| -------- | -------------------- | ---------- | ---------------- | --------------- | ----- | ----- | ---------- |
| `&`      | Bitwise AND          | `5 & 3`    | `0101 & 0011`    | `0001 (1)`      |       |       |            |
| `        | `                    | Bitwise OR | `5               | 3`              | `0101 | 0011` | `0111 (7)` |
| `^`      | Bitwise XOR          | `5 ^ 3`    | `0101 ^ 0011`    | `0110 (6)`      |       |       |            |
| `~`      | Bitwise NOT          | `~5`       | `~0101`          | Depends on sign |       |       |            |
| `<<`     | Left shift           | `8 << 1`   | `1000 → 10000`   | `16`            |       |       |            |
| `>>`     | Right shift          | `8 >> 1`   | `1000 → 0100`    | `4`             |       |       |            |
| `>>>`    | Unsigned right shift | `-8 >>> 1` | Logical shift    | Positive result |       |       |            |

**Example:**

```java
int a = 5;  // 0101
int b = 3;  // 0011
System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

---

# ## **8. Shift Operators**

| Operator | Description          | Example    | Output              |
| -------- | -------------------- | ---------- | ------------------- |
| `<<`     | Left shift           | `8 << 1`   | `16`                |
| `>>`     | Right shift          | `8 >> 1`   | `4`                 |
| `>>>`    | Unsigned right shift | `-8 >>> 1` | Big positive number |

**Example:**

```java
int x = 8;
System.out.println(x << 1); // 16
```

---

# ## **Complete Java Example (All Operators)**

```java
public class OperatorsDemo {
    public static void main(String[] args) {

        // Arithmetic
        System.out.println(10 + 3);

        // Assignment
        int x = 5;
        x += 3;

        // Relational
        System.out.println(10 > 3);

        // Logical
        System.out.println(true && false);

        // Unary
        int y = 5;
        y++;

        // Ternary
        String s = (y > 5) ? "Big" : "Small";

        // Bitwise
        System.out.println(5 & 3);
    }
}
```

---
