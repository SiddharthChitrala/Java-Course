# ✅ **Java Data Types**

Java has **2 types** of data types:

---

# **1️⃣ Primitive Data Types (8 types)**

These are basic built-in data types.

| Data Type   | Size    | Example                      |
| ----------- | ------- | ---------------------------- |
| **byte**    | 1 byte  | `byte a = 10;`               |
| **short**   | 2 bytes | `short b = 200;`             |
| **int**     | 4 bytes | `int age = 25;`              |
| **long**    | 8 bytes | `long mobile = 9876543210L;` |
| **float**   | 4 bytes | `float price = 99.5f;`       |
| **double**  | 8 bytes | `double salary = 45000.75;`  |
| **char**    | 2 bytes | `char grade = 'A';`          |
| **boolean** | 1 bit   | `boolean isJavaFun = true;`  |

---

## **👉 Primitive Data Type Full Example**

```java
public class PrimitiveExample {
    public static void main(String[] args) {

        byte a = 10;
        short b = 200;
        int c = 5000;
        long d = 123456789L;

        float e = 5.75f;
        double f = 99.99;

        char letter = 'A';
        boolean isGood = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(letter);
        System.out.println(isGood);
    }
}
```

---

# **2️⃣ Non-Primitive Data Types**

Used for objects and collections.

| Type                   | Example            |
| ---------------------- | ------------------ |
| **String**             | `"Siddharth"`      |
| **Array**              | `{1, 2, 3}`        |
| **Class**              | `class Student {}` |
| **Object**             | `new Student()`    |
| **Interface**          | `Runnable`         |
| **User-defined types** | custom classes     |

---

## 👉 Non-Primitive Example

```java
public class NonPrimitiveExample {
    public static void main(String[] args) {

        String name = "Siddharth";
        int[] marks = {85, 90, 95};

        System.out.println(name);
        System.out.println(marks[0]);
    }
}
```

---
