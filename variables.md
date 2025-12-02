# **Variables in Java**

Variables in Java are containers used to store data values. Every variable has:

* **Name**
* **Data type**
* **Value**
* **Scope** (where it can be accessed)

---

## **1. Syntax of a Variable**

```java
dataType variableName = value;
```

### **Example**

```java
int age = 25;
String name = "Siddharth";
double price = 199.99;
```

---

## **2. Types of Variables in Java**

### **a) Local Variables**

* Declared inside methods, constructors, or blocks.
* Must be initialized before use.

```java
void test() {
    int x = 10;  // local variable
}
```

---

### **b) Instance Variables**

* Declared inside a class but **outside** any method.
* Each object gets its own copy.

```java
class Person {
    String name;  // instance variable
    int age;
}
```

---

### **c) Static Variables (Class Variables)**

* Declared with `static` keyword.
* Shared among all objects of the class.

```java
class Student {
    static String schoolName = "ABC School"; // static variable
}
```

---

## **3. Different Data Types**

### **Primitive Types**

| Type      | Size    | Example                 |
| --------- | ------- | ----------------------- |
| `byte`    | 1 byte  | `byte a = 5;`           |
| `short`   | 2 bytes | `short b = 300;`        |
| `int`     | 4 bytes | `int age = 20;`         |
| `long`    | 8 bytes | `long id = 123456789L;` |
| `float`   | 4 bytes | `float f = 3.14f;`      |
| `double`  | 8 bytes | `double d = 99.99;`     |
| `char`    | 2 bytes | `char grade = 'A';`     |
| `boolean` | 1 bit   | `boolean isOn = true;`  |

---

### **Non-Primitive Types**

Examples: `String`, `Array`, `Class`, `Object`, etc.

```java
String city = "Hyderabad";
int[] marks = {90, 85, 88};
```

---

## **4. Variable Naming Rules**

✔ Must start with a letter, `_`, or `$`
✔ Cannot start with a number
✔ No spaces allowed
✔ Case-sensitive
✔ Should be meaningful

**Valid:**

```java
int studentAge;
double totalPrice;
```

**Invalid:**

```java
int 2value;     // cannot start with number
int my value;   // spaces not allowed
```

---

## **5. Final Variables (Constants)**

Use `final` to make a variable constant.

```java
final double PI = 3.14159;
```

---

