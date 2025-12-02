# ✅ **Java Operators (Full List + Easy Examples)**

Operators are symbols used to perform operations on variables and values.

Java has **8 categories** of operators:

---

# 1️⃣ **Arithmetic Operators**

| Operator | Meaning             | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus (remainder) | `a % b` |

### Example:

```java
int a = 10, b = 3;
System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3
System.out.println(a % b);  // 1
```

---

# 2️⃣ **Assignment Operators**

| Operator | Meaning             |
| -------- | ------------------- |
| `=`      | Assign              |
| `+=`     | Add and assign      |
| `-=`     | Subtract and assign |
| `*=`     | Multiply and assign |
| `/=`     | Divide and assign   |
| `%=`     | Mod and assign      |

### Example:

```java
int x = 5;
x += 3;  // x = x + 3 → 8
```

---

# 3️⃣ **Relational (Comparison) Operators**

| Operator | Meaning          |
| -------- | ---------------- |
| `==`     | Equal to         |
| `!=`     | Not equal        |
| `>`      | Greater than     |
| `<`      | Less than        |
| `>=`     | Greater or equal |
| `<=`     | Less or equal    |

### Example:

```java
int a = 10, b = 20;
System.out.println(a > b);  // false
System.out.println(a < b);  // true
```

---

# 4️⃣ **Logical Operators**

| Operator | Meaning     |   |            |
| -------- | ----------- | - | ---------- |
| `&&`     | Logical AND |   |            |
| `        |             | ` | Logical OR |
| `!`      | Logical NOT |   |            |

### Example:

```java
int age = 25;
System.out.println(age > 18 && age < 30); // true
```

---

# 5️⃣ **Unary Operators**

| Operator | Meaning     |
| -------- | ----------- |
| `++`     | Increment   |
| `--`     | Decrement   |
| `+`      | Unary plus  |
| `-`      | Unary minus |
| `!`      | NOT         |

### Example:

```java
int x = 5;
x++;  // 6
System.out.println(x);
```

---

# 6️⃣ **Ternary Operator**

```java
condition ? value1 : value2
```

### Example:

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Child";
System.out.println(result);
```

---

# 7️⃣ **Bitwise Operators**

| Operator | Meaning     |            |
| -------- | ----------- | ---------- |
| `&`      | Bitwise AND |            |
| `        | `           | Bitwise OR |
| `^`      | XOR         |            |
| `~`      | NOT         |            |
| `<<`     | Left shift  |            |
| `>>`     | Right shift |            |

### Example:

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
```

---

# 8️⃣ **Shift Operators**

| Operator | Meaning              |
| -------- | -------------------- |
| `<<`     | Left shift           |
| `>>`     | Right shift          |
| `>>>`    | Unsigned right shift |

### Example:

```java
int x = 8;       // 1000
System.out.println(x << 1); // 16 (10000)
```

---