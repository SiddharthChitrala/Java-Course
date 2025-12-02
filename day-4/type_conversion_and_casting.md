---

# ✅ **Type Conversion & Casting in Java**

Java supports two types of conversions:

1. **Implicit Conversion (Widening)** → done automatically
2. **Explicit Casting (Narrowing)** → you must do it manually

---

# 1️⃣ **Widening (Implicit) Conversion**

Java **automatically** converts smaller data types into larger ones.

✔ No data loss
✔ No need for casting

### **Order of widening:**

```
byte → short → int → long → float → double
```

---

### **Example (Implicit Conversion)**

```java
public class WideningExample {
    public static void main(String[] args) {
        int a = 10;
        double b = a;      // int → double (automatic)
        System.out.println(b);  // 10.0
    }
}
```

---

# 2️⃣ **Narrowing (Explicit) Casting**

You convert a **larger type into a smaller one** manually.

❗ Risk of data loss
❗ Must use `(type)`

### **Order of narrowing:**

```
double → float → long → int → short → byte
```

---

### **Example (Explicit Casting)**

```java
public class NarrowingExample {
    public static void main(String[] args) {
        double x = 9.99;
        int y = (int) x;   // double → int (manual)
        System.out.println(y);  // 9 (decimal lost)
    }
}
```

---

# 3️⃣ **Type Conversion Examples for All Types**

### **byte → int**

```java
byte b = 10;
int i = b;   // widening
```

---

### **int → byte**

```java
int i = 130;
byte b = (byte) i;   // narrowing
System.out.println(b);  // output may overflow
```

---

### **char → int**

```java
char ch = 'A';
int code = ch;   // A → 65
System.out.println(code);
```

---

### **int → char**

```java
int code = 66;
char ch = (char) code;  // 66 → B
System.out.println(ch);
```

---

# 4️⃣ **String to Number Conversion**

### **String → int**

```java
String s = "123";
int a = Integer.parseInt(s);
```

---

### **String → double**

```java
String s = "45.67";
double d = Double.parseDouble(s);
```

---

# 5️⃣ **Number to String Conversion**

```java
int n = 100;
String s = String.valueOf(n);
```

---

# 6️⃣ **Automatic Type Promotion in Expressions**

If multiple data types appear in an expression:

* The result becomes the **largest** type.

```java
int a = 5;
double b = 3.2;
double c = a + b;  // int promoted to double
```

---
