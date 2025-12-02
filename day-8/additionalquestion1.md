# Java Solutions for DSA Logic Building Questions

## **Section 1: Variables & Data Types**

### **Question 1: Swapping Numbers**
```java
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Method 1: Using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (with temp): a = " + a + ", b = " + b);
        
        // Reset values
        temp = a;
        a = b;
        b = temp;
        
        // Method 2: Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);
        
        // Method 3: Using XOR (bitwise)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping (using XOR): a = " + a + ", b = " + b);
        
        sc.close();
    }
}
```

### **Question 2: Type Conversion**
```java
public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        System.out.println("=== Implicit Type Conversion ===");
        int intVal = 100;
        long longVal = intVal; // int → long
        float floatVal = longVal; // long → float
        double doubleVal = floatVal; // float → double
        
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);
        
        char charVal = 'A';
        int charToInt = charVal; // char → int (ASCII value)
        System.out.println("char 'A' to int: " + charToInt);
        
        // Explicit Type Conversion (Narrowing)
        System.out.println("\n=== Explicit Type Conversion ===");
        double d = 100.04;
        long l = (long) d; // double → long
        int i = (int) l; // long → int
        byte b = (byte) i; // int → byte
        
        System.out.println("double to long: " + l);
        System.out.println("long to int: " + i);
        System.out.println("int to byte: " + b);
        
        // String conversions
        System.out.println("\n=== String Conversions ===");
        String strNum = "123";
        int strToInt = Integer.parseInt(strNum);
        double strToDouble = Double.parseDouble("123.45");
        
        System.out.println("String to int: " + strToInt);
        System.out.println("String to double: " + strToDouble);
        
        // Int to String
        int num = 456;
        String intToStr1 = Integer.toString(num);
        String intToStr2 = String.valueOf(num);
        String intToStr3 = num + "";
        
        System.out.println("int to String (method 1): " + intToStr1);
        System.out.println("int to String (method 2): " + intToStr2);
        System.out.println("int to String (method 3): " + intToStr3);
    }
}
```

### **Question 3: Average with Precision**
```java
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        // Wrong way - loses decimal precision
        int wrongAverage = (num1 + num2 + num3) / 3;
        System.out.println("Wrong average (integer division): " + wrongAverage);
        
        // Correct way 1 - using type casting
        double correctAverage1 = (double)(num1 + num2 + num3) / 3;
        System.out.println("Correct average (method 1): " + correctAverage1);
        
        // Correct way 2 - using floating-point numbers
        double correctAverage2 = (num1 + num2 + num3) / 3.0;
        System.out.println("Correct average (method 2): " + correctAverage2);
        
        // Correct way 3 - using float
        float floatAverage = (num1 + num2 + num3) / 3.0f;
        System.out.println("Float average: " + floatAverage);
        
        // Formatting output
        System.out.printf("Formatted average (2 decimal places): %.2f\n", correctAverage1);
        System.out.printf("Formatted average (3 decimal places): %.3f\n", correctAverage1);
        
        sc.close();
    }
}
```

---

## **Section 2: Operators**

### **Question 4: Number Operations**
```java
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Find largest number
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Largest number: " + largest);
        
        // Check divisibility
        boolean divisibleByBoth = (a % b == 0) && (a % c == 0);
        System.out.println(a + " is divisible by both " + b + " and " + c + ": " + divisibleByBoth);
        
        // Using ternary operator for largest
        int largestTernary = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        System.out.println("Largest (using ternary): " + largestTernary);
        
        // Check if numbers can form sides of right triangle
        boolean isRightTriangle = (a*a + b*b == c*c) || 
                                  (a*a + c*c == b*b) || 
                                  (b*b + c*c == a*a);
        System.out.println("Can form right triangle: " + isRightTriangle);
        
        sc.close();
    }
}
```

### **Question 5: Operator Differences**
```java
public class OperatorDifferences {
    public static void main(String[] args) {
        System.out.println("=== Pre-increment vs Post-increment ===");
        int x = 5;
        int y = 5;
        
        System.out.println("Initial: x = " + x + ", y = " + y);
        
        // Pre-increment
        System.out.println("++x: " + ++x); // Increments first, then prints (6)
        System.out.println("After ++x: x = " + x); // 6
        
        // Post-increment  
        System.out.println("y++: " + y++); // Prints first (5), then increments
        System.out.println("After y++: y = " + y); // 6
        
        System.out.println("\n=== Bitwise AND vs Logical AND ===");
        int a = 4;  // Binary: 100
        int b = 5;  // Binary: 101
        
        System.out.println("Bitwise AND (a & b): " + (a & b)); // 100 & 101 = 100 (4)
        System.out.println("Bitwise OR (a | b): " + (a | b));  // 100 | 101 = 101 (5)
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // 100 ^ 101 = 001 (1)
        
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("Logical AND (bool1 && bool2): " + (bool1 && bool2));
        System.out.println("Logical OR (bool1 || bool2): " + (bool1 || bool2));
        
        // Short-circuit evaluation
        int counter = 0;
        boolean result = (counter != 0) && (10/counter > 2); // No division by zero error
        System.out.println("Short-circuit evaluation result: " + result);
        
        System.out.println("\n=== Division vs Modulus ===");
        int num1 = 17;
        int num2 = 5;
        
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // 3
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // 2
        
        // Floating point division
        System.out.println(num1 + " / " + num2 + " (float) = " + (num1 / (float)num2));
        
        // Check if number is divisible
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is NOT divisible by " + num2);
        }
    }
}
```

### **Question 6: Even/Odd without Modulus**
```java
import java.util.Scanner;

public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Method 1: Using bitwise AND
        if ((num & 1) == 0) {
            System.out.println(num + " is even (using bitwise AND)");
        } else {
            System.out.println(num + " is odd (using bitwise AND)");
        }
        
        // Method 2: Using division and multiplication
        if ((num / 2) * 2 == num) {
            System.out.println(num + " is even (using division/multiplication)");
        } else {
            System.out.println(num + " is odd (using division/multiplication)");
        }
        
        // Method 3: Using bitwise XOR
        if ((num ^ 1) == num + 1) {
            System.out.println(num + " is even (using bitwise XOR)");
        } else {
            System.out.println(num + " is odd (using bitwise XOR)");
        }
        
        // Method 4: Using shift operators
        if (((num >> 1) << 1) == num) {
            System.out.println(num + " is even (using shift operators)");
        } else {
            System.out.println(num + " is odd (using shift operators)");
        }
        
        sc.close();
    }
}
```

---

## **Section 3: Conditional Statements**

### **Question 7: Student Grade Calculator**
```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for three subjects (out of 100):");
        System.out.print("Subject 1: ");
        int marks1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int marks2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int marks3 = sc.nextInt();
        
        // Input validation
        if (marks1 < 0 || marks1 > 100 || marks2 < 0 || marks2 > 100 || marks3 < 0 || marks3 > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }
        
        double average = (marks1 + marks2 + marks3) / 3.0;
        
        System.out.printf("\nMarks: %d, %d, %d\n", marks1, marks2, marks3);
        System.out.printf("Average: %.2f\n", average);
        
        // Determine grade using if-else ladder
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Alternative using switch expression (Java 14+)
        String gradeDescription = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Good";
            case 'C' -> "Average";
            case 'D' -> "Below Average";
            case 'F' -> "Fail";
            default -> "Invalid Grade";
        };
        
        System.out.println("Grade: " + grade + " - " + gradeDescription);
        
        // Check if passed all subjects individually
        if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
            System.out.println("Status: Passed all subjects");
        } else {
            System.out.println("Status: Failed in some subjects");
            System.out.print("Failed in: ");
            if (marks1 < 40) System.out.print("Subject 1 ");
            if (marks2 < 40) System.out.print("Subject 2 ");
            if (marks3 < 40) System.out.print("Subject 3 ");
            System.out.println();
        }
        
        sc.close();
    }
}
```

### **Question 8: Simple Calculator**
```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Operations: +, -, *, /, %");
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
                
            case '-':
                result = num1 - num2;
                break;
                
            case '*':
                result = num1 * num2;
                break;
                
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    validOperation = false;
                }
                break;
                
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulus by zero is not allowed!");
                    validOperation = false;
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operator, num2, result);
            
            // Additional operations
            if (operator == '/' && num2 != 0) {
                System.out.printf("Integer division: %d / %d = %d\n", 
                    (int)num1, (int)num2, (int)num1 / (int)num2);
            }
        }
        
        sc.close();
    }
}
```

### **Question 9: Triangle Validator**
```java
import java.util.Scanner;
import java.util.Arrays;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three sides of triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        
        // Sort sides in ascending order
        double[] sides = {side1, side2, side3};
        Arrays.sort(sides);
        double a = sides[0];
        double b = sides[1];
        double c = sides[2]; // Largest side
        
        System.out.println("\n=== Triangle Analysis ===");
        
        // Check if valid triangle
        if (a + b > c) {
            System.out.println("✓ Valid triangle");
            
            // Check triangle type by sides
            if (a == b && b == c) {
                System.out.println("Type: Equilateral (all sides equal)");
            } else if (a == b || b == c || a == c) {
                System.out.println("Type: Isosceles (two sides equal)");
            } else {
                System.out.println("Type: Scalene (all sides different)");
            }
            
            // Check triangle type by angles using Pythagorean theorem
            double aSquared = a * a;
            double bSquared = b * b;
            double cSquared = c * c;
            
            if (Math.abs(aSquared + bSquared - cSquared) < 0.0001) {
                System.out.println("Angle Type: Right-angled triangle");
            } else if (aSquared + bSquared > cSquared) {
                System.out.println("Angle Type: Acute-angled triangle");
            } else {
                System.out.println("Angle Type: Obtuse-angled triangle");
            }
            
            // Calculate area using Heron's formula
            double s = (a + b + c) / 2; // semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area: %.2f square units\n", area);
            System.out.printf("Perimeter: %.2f units\n", (a + b + c));
            
        } else {
            System.out.println("✗ Invalid triangle!");
            System.out.println("Sum of two smaller sides (" + a + " + " + b + " = " + (a+b) + 
                             ") is NOT greater than largest side (" + c + ")");
        }
        
        sc.close();
    }
}
```

---

## **Section 4: Mixed Problems**

### **Question 10: Number Operations**
```java
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 5-digit number: ");
        int number = sc.nextInt();
        
        // Validate 5-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid 5-digit number!");
            return;
        }
        
        System.out.println("\n=== Number Operations ===");
        System.out.println("Original number: " + number);
        
        // 1. Reverse the number
        int temp = number;
        int reverse = 0;
        int sum = 0;
        int largestDigit = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            
            temp /= 10;
        }
        
        System.out.println("Reversed number: " + reverse);
        
        // 2. Check palindrome
        if (number == reverse) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
        
        // 3. Sum of digits
        System.out.println("Sum of digits: " + sum);
        
        // 4. Largest digit
        System.out.println("Largest digit: " + largestDigit);
        
        // 5. Extract individual digits
        System.out.print("Individual digits: ");
        temp = number;
        while (temp > 0) {
            System.out.print(temp % 10 + " ");
            temp /= 10;
        }
        System.out.println();
        
        // 6. Check Armstrong number (for 5 digits)
        temp = number;
        int armstrongSum = 0;
        int digitsCount = 5;
        
        while (temp > 0) {
            int digit = temp % 10;
            armstrongSum += Math.pow(digit, digitsCount);
            temp /= 10;
        }
        
        if (number == armstrongSum) {
            System.out.println("Armstrong number: Yes");
        } else {
            System.out.println("Armstrong number: No");
        }
        
        sc.close();
    }
}
```

### **Question 11: Number System Converter**
```java
import java.util.Scanner;

public class NumberSystemConverter {
    
    // Decimal to Binary
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
    
    // Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            } else if (bit != '0') {
                throw new IllegalArgumentException("Invalid binary digit: " + bit);
            }
            power++;
        }
        return decimal;
    }
    
    // Decimal to Hexadecimal
    public static String decimalToHex(int decimal) {
        if (decimal == 0) return "0";
        
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        StringBuilder hex = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 16;
            hex.insert(0, hexDigits[remainder]);
            decimal /= 16;
        }
        return hex.toString();
    }
    
    // Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        hex = hex.toUpperCase();
        int decimal = 0;
        int power = 0;
        
        for (int i = hex.length() - 1; i >= 0; i--) {
            char digit = hex.charAt(i);
            int value;
            
            if (digit >= '0' && digit <= '9') {
                value = digit - '0';
            } else if (digit >= 'A' && digit <= 'F') {
                value = 10 + (digit - 'A');
            } else {
                throw new IllegalArgumentException("Invalid hex digit: " + digit);
            }
            
            decimal += value * Math.pow(16, power);
            power++;
        }
        return decimal;
    }
    
    // Decimal to Octal
    public static String decimalToOctal(int decimal) {
        if (decimal == 0) return "0";
        
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        return octal.toString();
    }
    
    // General base converter (2-16)
    public static String convertBase(int number, int base) {
        if (base < 2 || base > 16) {
            throw new IllegalArgumentException("Base must be between 2 and 16");
        }
        
        if (number == 0) return "0";
        
        char[] digits = "0123456789ABCDEF".toCharArray();
        StringBuilder result = new StringBuilder();
        
        while (number > 0) {
            result.insert(0, digits[number % base]);
            number /= base;
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Number System Converter ===");
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        System.out.println("\nConversion Results:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + decimalToBinary(decimal));
        System.out.println("Octal: " + decimalToOctal(decimal));
        System.out.println("Hexadecimal: " + decimalToHex(decimal));
        
        System.out.print("\nEnter a binary number: ");
        String binary = sc.next();
        System.out.println("Binary " + binary + " to Decimal: " + binaryToDecimal(binary));
        
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next();
        System.out.println("Hexadecimal " + hex + " to Decimal: " + hexToDecimal(hex));
        
        System.out.print("\nEnter number and base to convert (e.g., 255 16): ");
        int num = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(num + " in base " + base + ": " + convertBase(num, base));
        
        sc.close();
    }
}
```

### **Question 12: Leap Year Checker**
```java
import java.util.Scanner;

public class LeapYearChecker {
    
    // Method 1: Using if-else statements
    public static boolean isLeapYearIfElse(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;  // Divisible by 400
                } else {
                    return false; // Divisible by 100 but not 400
                }
            } else {
                return true;      // Divisible by 4 but not 100
            }
        } else {
            return false;         // Not divisible by 4
        }
    }
    
    // Method 2: Using single boolean expression
    public static boolean isLeapYearBoolean(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
    
    // Method 3: Using ternary operator
    public static boolean isLeapYearTernary(int year) {
        return (year % 400 == 0) ? true : 
               (year % 100 == 0) ? false : 
               (year % 4 == 0) ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Leap Year Checker ===");
        
        while (true) {
            System.out.print("\nEnter a year (0 to exit): ");
            int year = sc.nextInt();
            
            if (year == 0) {
                System.out.println("Exiting program...");
                break;
            }
            
            if (year < 0) {
                System.out.println("Please enter a valid year!");
                continue;
            }
            
            System.out.println("\nYear: " + year);
            System.out.println("Method 1 (if-else): " + 
                (isLeapYearIfElse(year) ? "Leap Year" : "Not a Leap Year"));
            System.out.println("Method 2 (boolean): " + 
                (isLeapYearBoolean(year) ? "Leap Year" : "Not a Leap Year"));
            System.out.println("Method 3 (ternary): " + 
                (isLeapYearTernary(year) ? "Leap Year" : "Not a Leap Year"));
            
            // Show next 5 leap years
            if (isLeapYearBoolean(year)) {
                System.out.print("Next 5 leap years: ");
                int count = 0;
                int nextYear = year + 4;
                while (count < 5) {
                    if (isLeapYearBoolean(nextYear)) {
                        System.out.print(nextYear + " ");
                        count++;
                    }
                    nextYear += 4;
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
```

### **Question 13: Character Analyzer**
```java
import java.util.Scanner;

public class CharacterAnalyzer {
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return Character.isLetter(ch) && !isVowel(ch);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Character Analyzer ===");
        
        while (true) {
            System.out.print("\nEnter a character (or '0' to exit): ");
            String input = sc.next();
            
            if (input.equals("0")) {
                System.out.println("Exiting program...");
                break;
            }
            
            if (input.length() != 1) {
                System.out.println("Please enter exactly one character!");
                continue;
            }
            
            char ch = input.charAt(0);
            
            System.out.println("\nAnalysis for character: '" + ch + "'");
            System.out.println("ASCII value: " + (int)ch);
            
            if (Character.isUpperCase(ch)) {
                System.out.println("Case: Uppercase");
                System.out.println("Lowercase equivalent: '" + Character.toLowerCase(ch) + "'");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Case: Lowercase");
                System.out.println("Uppercase equivalent: '" + Character.toUpperCase(ch) + "'");
            } else {
                System.out.println("Case: Not a letter");
            }
            
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    System.out.println("Type: Vowel");
                } else if (isConsonant(ch)) {
                    System.out.println("Type: Consonant");
                }
                
                // Find next character in alphabet
                if (ch == 'z') {
                    System.out.println("Next character: a (wraps around)");
                } else if (ch == 'Z') {
                    System.out.println("Next character: A (wraps around)");
                } else {
                    System.out.println("Next character: '" + (char)(ch + 1) + "'");
                }
                
                // Find previous character
                if (ch == 'a') {
                    System.out.println("Previous character: z (wraps around)");
                } else if (ch == 'A') {
                    System.out.println("Previous character: Z (wraps around)");
                } else {
                    System.out.println("Previous character: '" + (char)(ch - 1) + "'");
                }
                
                // Check if letter is in first half of alphabet
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh >= 'a' && lowerCh <= 'm') {
                    System.out.println("Position: First half of alphabet (a-m)");
                } else {
                    System.out.println("Position: Second half of alphabet (n-z)");
                }
            }
            
            if (Character.isDigit(ch)) {
                System.out.println("Type: Digit");
                int digit = ch - '0';
                System.out.println("Numeric value: " + digit);
                System.out.println("Square: " + (digit * digit));
            }
            
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("Type: Special character");
                
                // Categorize special characters
                if ("!@#$%^&*()".contains(String.valueOf(ch))) {
                    System.out.println("Category: Symbol");
                } else if ("  \t\n".contains(String.valueOf(ch))) {
                    System.out.println("Category: Whitespace");
                } else if (",.;:?!\"'".contains(String.valueOf(ch))) {
                    System.out.println("Category: Punctuation");
                }
            }
        }
        
        sc.close();
    }
}
```

### **Question 14: Time Converter**
```java
import java.util.Scanner;

public class TimeConverter {
    
    // Convert seconds to HH:MM:SS
    public static String secondsToTime(int totalSeconds) {
        if (totalSeconds < 0) {
            return "Invalid input! Seconds cannot be negative.";
        }
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
    // Convert HH:MM:SS to total seconds
    public static int timeToSeconds(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
            return -1; // Invalid time
        }
        
        return hours * 3600 + minutes * 60 + seconds;
    }
    
    // Add two times
    public static String addTimes(int h1, int m1, int s1, int h2, int m2, int s2) {
        int totalSeconds = timeToSeconds(h1, m1, s1) + timeToSeconds(h2, m2, s2);
        
        // Handle overflow beyond 24 hours
        int days = totalSeconds / 86400;
        totalSeconds %= 86400;
        
        String result = secondsToTime(totalSeconds);
        if (days > 0) {
            result = days + " day(s) " + result;
        }
        
        return result;
    }
    
    // Subtract two times
    public static String subtractTimes(int h1, int m1, int s1, int h2, int m2, int s2) {
        int time1 = timeToSeconds(h1, m1, s1);
        int time2 = timeToSeconds(h2, m2, s2);
        
        if (time1 < time2) {
            return "First time must be greater than second time!";
        }
        
        return secondsToTime(time1 - time2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Time Converter ===");
        
        // Convert seconds to time
        System.out.print("\nEnter total seconds: ");
        int seconds = sc.nextInt();
        System.out.println(seconds + " seconds = " + secondsToTime(seconds));
        
        // Convert time to seconds
        System.out.println("\nEnter time (hours minutes seconds): ");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int secs = sc.nextInt();
        
        int totalSecs = timeToSeconds(hours, minutes, secs);
        if (totalSecs == -1) {
            System.out.println("Invalid time!");
        } else {
            System.out.printf("%02d:%02d:%02d = %d seconds\n", hours, minutes, secs, totalSecs);
        }
        
        // Add two times
        System.out.println("\n=== Add Two Times ===");
        System.out.println("Enter first time (hours minutes seconds): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        
        System.out.println("Enter second time (hours minutes seconds): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        
        System.out.printf("\n%s + %s = %s\n", 
            secondsToTime(timeToSeconds(h1, m1, s1)),
            secondsToTime(timeToSeconds(h2, m2, s2)),
            addTimes(h1, m1, s1, h2, m2, s2));
        
        // Subtract two times
        System.out.println("\n=== Subtract Two Times ===");
        System.out.println("Enter first time (hours minutes seconds): ");
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        s1 = sc.nextInt();
        
        System.out.println("Enter second time (hours minutes seconds): ");
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        s2 = sc.nextInt();
        
        System.out.printf("\n%s - %s = %s\n", 
            secondsToTime(timeToSeconds(h1, m1, s1)),
            secondsToTime(timeToSeconds(h2, m2, s2)),
            subtractTimes(h1, m1, s1, h2, m2, s2));
        
        // Time difference between two times
        System.out.println("\n=== Time Difference Calculator ===");
        System.out.println("Enter start time (24-hour format): ");
        int startHour = sc.nextInt();
        int startMin = sc.nextInt();
        
        System.out.println("Enter end time (24-hour format): ");
        int endHour = sc.nextInt();
        int endMin = sc.nextInt();
        
        int startTotal = startHour * 60 + startMin;
        int endTotal = endHour * 60 + endMin;
        
        if (endTotal < startTotal) {
            endTotal += 24 * 60; // Add 24 hours if end time is next day
        }
        
        int diffMinutes = endTotal - startTotal;
        int diffHours = diffMinutes / 60;
        diffMinutes %= 60;
        
        System.out.printf("Time difference: %d hours %d minutes\n", diffHours, diffMinutes);
        
        sc.close();
    }
}
```

### **Question 15: Number Guessing Game**
```java
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    
    public static void easyMode() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numberToGuess = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("\n=== EASY MODE ===");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.");
        
        while (attempts < maxAttempts) {
            System.out.print("\nAttempt " + (attempts + 1) + "/" + maxAttempts + 
                           " - Enter your guess: ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); // Clear invalid input
                continue;
            }
            
            int guess = sc.nextInt();
            attempts++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("Please guess between 1 and 100!");
                continue;
            }
            
            if (guess == numberToGuess) {
                System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts!");
                System.out.println("The number was: " + numberToGuess);
                return;
            } else if (guess < numberToGuess) {
                System.out.println("⬆️ Too low!");
                
                // Give hint every 3 attempts
                if (attempts % 3 == 0) {
                    int difference = numberToGuess - guess;
                    if (difference > 30) {
                        System.out.println("Hint: You're way too low!");
                    }
                }
            } else {
                System.out.println("⬇️ Too high!");
                
                // Give hint every 3 attempts
                if (attempts % 3 == 0) {
                    int difference = guess - numberToGuess;
                    if (difference > 30) {
                        System.out.println("Hint: You're way too high!");
                    }
                }
            }
            
            // Remaining attempts
            int remaining = maxAttempts - attempts;
            if (remaining > 0) {
                System.out.println("Remaining attempts: " + remaining);
            }
        }
        
        System.out.println("\n😢 Game Over! You've used all " + maxAttempts + " attempts.");
        System.out.println("The number was: " + numberToGuess);
    }
    
    public static void hardMode() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numberToGuess = rand.nextInt(1000) + 1;
        int attempts = 0;
        int maxAttempts = 7;
        
        System.out.println("\n=== HARD MODE ===");
        System.out.println("I'm thinking of a number between 1 and 1000.");
        System.out.println("You have only " + maxAttempts + " attempts!");
        
        while (attempts < maxAttempts) {
            System.out.print("\nAttempt " + (attempts + 1) + "/" + maxAttempts + 
                           " - Enter your guess: ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
                continue;
            }
            
            int guess = sc.nextInt();
            attempts++;
            
            if (guess < 1 || guess > 1000) {
                System.out.println("Please guess between 1 and 1000!");
                continue;
            }
            
            if (guess == numberToGuess) {
                System.out.println("🏆 IMPRESSIVE! You guessed it in " + attempts + " attempts!");
                System.out.println("The number was: " + numberToGuess);
                return;
            } else if (guess < numberToGuess) {
                System.out.print("⬆️ Higher!");
                
                // Calculate how close
                int difference = numberToGuess - guess;
                if (difference > 500) {
                    System.out.println(" (Way too low!)");
                } else if (difference > 100) {
                    System.out.println(" (Still very low)");
                } else {
                    System.out.println();
                }
            } else {
                System.out.print("⬇️ Lower!");
                
                // Calculate how close
                int difference = guess - numberToGuess;
                if (difference > 500) {
                    System.out.println(" (Way too high!)");
                } else if (difference > 100) {
                    System.out.println(" (Still very high)");
                } else {
                    System.out.println();
                }
            }
        }
        
        System.out.println("\n💀 EXTREME FAILURE! The number was: " + numberToGuess);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Easy Mode (1-100, 10 attempts)");
            System.out.println("2. Hard Mode (1-1000, 7 attempts)");
            System.out.println("3. Two Player Mode");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    easyMode();
                    break;
                    
                case 2:
                    hardMode();
                    break;
                    
                case 3:
                    twoPlayerMode();
                    break;
                    
                case 4:
                    System.out.println("Thanks for playing! Goodbye!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            // Ask to play again
            System.out.print("\nPlay again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes") && !playAgain.equals("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        
        sc.close();
    }
    
    public static void twoPlayerMode() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== TWO PLAYER MODE ===");
        System.out.print("Player 1, enter your name: ");
        String player1 = sc.next();
        
        System.out.print("Player 2, enter your name: ");
        String player2 = sc.next();
        
        Random rand = new Random();
        int rounds = 3;
        int player1Score = 0;
        int player2Score = 0;
        
        for (int round = 1; round <= rounds; round++) {
            System.out.println("\n=== ROUND " + round + "/" + rounds + " ===");
            
            // Player 1's turn
            System.out.println("\n" + player1 + "'s turn!");
            int numberToGuess = rand.nextInt(50) + 1;
            System.out.println("(Number generated for " + player1 + ")");
            
            int attempts1 = guessNumber(sc, numberToGuess, 5, 1, 50);
            player1Score += (6 - attempts1); // More points for fewer attempts
            
            // Player 2's turn
            System.out.println("\n" + player2 + "'s turn!");
            numberToGuess = rand.nextInt(50) + 1;
            System.out.println("(Number generated for " + player2 + ")");
            
            int attempts2 = guessNumber(sc, numberToGuess, 5, 1, 50);
            player2Score += (6 - attempts2);
            
            System.out.println("\nRound " + round + " Results:");
            System.out.println(player1 + ": " + attempts1 + " attempts");
            System.out.println(player2 + ": " + attempts2 + " attempts");
        }
        
        System.out.println("\n=== FINAL SCORE ===");
        System.out.println(player1 + ": " + player1Score + " points");
        System.out.println(player2 + ": " + player2Score + " points");
        
        if (player1Score > player2Score) {
            System.out.println("🎉 " + player1 + " WINS!");
        } else if (player2Score > player1Score) {
            System.out.println("🎉 " + player2 + " WINS!");
        } else {
            System.out.println("🤝 It's a TIE!");
        }
    }
    
    public static int guessNumber(Scanner sc, int numberToGuess, int maxAttempts, int min, int max) {
        int attempts = 0;
        
        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + 
                           " - Enter guess (" + min + "-" + max + "): ");
            
            int guess = sc.nextInt();
            attempts++;
            
            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                return attempts;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
        
        System.out.println("Out of attempts! The number was: " + numberToGuess);
        return attempts;
    }
}
```

---

## **Challenge Problems**

### **Question 16: Quadratic Equation Solver**
```java
import java.util.Scanner;

public class QuadraticEquationSolver {
    
    public static void solveQuadratic(double a, double b, double c) {
        System.out.printf("\nSolving: %.2fx² + %.2fx + %.2f = 0\n", a, b, c);
        
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a = 0)");
            System.out.println("It's a linear equation: " + b + "x + " + c + " = 0");
            if (b != 0) {
                double root = -c / b;
                System.out.printf("Root: x = %.2f\n", root);
            } else if (c == 0) {
                System.out.println("Infinite solutions (0 = 0)");
            } else {
                System.out.println("No solution (" + c + " = 0 is false)");
            }
            return;
        }
        
        double discriminant = b * b - 4 * a * c;
        System.out.printf("Discriminant (D) = b² - 4ac = %.2f\n", discriminant);
        
        if (discriminant > 0) {
            // Two real and distinct roots
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            
            System.out.println("Nature: Two real and distinct roots");
            System.out.printf("Root 1: x = %.4f\n", root1);
            System.out.printf("Root 2: x = %.4f\n", root2);
            
            // Verify solutions
            System.out.println("\nVerification:");
            double verify1 = a * root1 * root1 + b * root1 + c;
            double verify2 = a * root2 * root2 + b * root2 + c;
            System.out.printf("For x = %.4f: %.4f ≈ 0\n", root1, verify1);
            System.out.printf("For x = %.4f: %.4f ≈ 0\n", root2, verify2);
            
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            
            System.out.println("Nature: One real root (repeated)");
            System.out.printf("Root: x = %.4f\n", root);
            
            // Verify solution
            System.out.println("\nVerification:");
            double verify = a * root * root + b * root + c;
            System.out.printf("For x = %.4f: %.4f ≈ 0\n", root, verify);
            
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            
            System.out.println("Nature: Two complex conjugate roots");
            System.out.printf("Root 1: %.4f + %.4fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.4f - %.4fi\n", realPart, imaginaryPart);
            
            // Calculate magnitude
            double magnitude = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
            System.out.printf("Magnitude of roots: %.4f\n", magnitude);
        }
        
        // Additional information
        System.out.println("\nAdditional Information:");
        double sumOfRoots = -b / a;
        double productOfRoots = c / a;
        System.out.printf("Sum of roots = -b/a = %.2f\n", sumOfRoots);
        System.out.printf("Product of roots = c/a = %.2f\n", productOfRoots);
        
        // Vertex of parabola
        double vertexX = -b / (2 * a);
        double vertexY = a * vertexX * vertexX + b * vertexX + c;
        System.out.printf("Vertex of parabola: (%.2f, %.2f)\n", vertexX, vertexY);
        
        // Direction of opening
        if (a > 0) {
            System.out.println("Parabola opens: UPWARDS (U-shaped)");
            System.out.println("Vertex is MINIMUM point");
        } else {
            System.out.println("Parabola opens: DOWNWARDS (∩-shaped)");
            System.out.println("Vertex is MAXIMUM point");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== QUADRATIC EQUATION SOLVER ===");
        System.out.println("Solves equations of form: ax² + bx + c = 0");
        
        while (true) {
            System.out.println("\nEnter coefficients a, b, c:");
            System.out.print("a: ");
            double a = sc.nextDouble();
            System.out.print("b: ");
            double b = sc.nextDouble();
            System.out.print("c: ");
            double c = sc.nextDouble();
            
            solveQuadratic(a, b, c);
            
            System.out.print("\nSolve another equation? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes") && !choice.equals("y")) {
                break;
            }
        }
        
        System.out.println("\n=== SPECIAL CASES DEMONSTRATION ===");
        System.out.println("\n1. Perfect square trinomial:");
        solveQuadratic(1, -6, 9);  // (x-3)² = 0
        
        System.out.println("\n2. Difference of squares:");
        solveQuadratic(1, 0, -4);  // x² - 4 = 0
        
        System.out.println("\n3. Pure imaginary roots:");
        solveQuadratic(1, 0, 1);   // x² + 1 = 0
        
        sc.close();
    }
}
```

### **Question 17: Vending Machine Simulator**
```java
import java.util.Scanner;

public class VendingMachine {
    
    // Item class to store item details
    static class Item {
        String name;
        int price;
        int quantity;
        
        Item(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
    
    // Available denominations
    static final int[] DENOMINATIONS = {500, 100, 50, 20, 10, 5, 2, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize items in vending machine
        Item[] items = {
            new Item("Coke", 20, 10),
            new Item("Pepsi", 25, 8),
            new Item("Water", 15, 15),
            new Item("Chips", 30, 12),
            new Item("Chocolate", 40, 6),
            new Item("Cookie", 10, 20)
        };
        
        System.out.println("=== VENDING MACHINE ===");
        System.out.println("Welcome! Please insert money.");
        
        // Display available items
        System.out.println("\nAvailable Items:");
        System.out.println("+----+-----------------+-------+---------+");
        System.out.println("| No |      Item       | Price |  Stock  |");
        System.out.println("+----+-----------------+-------+---------+");
        
        for (int i = 0; i < items.length; i++) {
            System.out.printf("| %2d | %-15s | %5d | %7d |\n", 
                i + 1, items[i].name, items[i].price, items[i].quantity);
        }
        System.out.println("+----+-----------------+-------+---------+");
        
        // Get money input
        System.out.print("\nEnter amount of money: ₹");
        int money = sc.nextInt();
        
        if (money <= 0) {
            System.out.println("Invalid amount! Minimum ₹1 required.");
            return;
        }
        
        System.out.println("\nYou inserted: ₹" + money);
        
        boolean buying = true;
        int totalSpent = 0;
        
        while (buying && money > 0) {
            // Display affordable items
            System.out.println("\nYou can afford:");
            boolean canAffordAnything = false;
            
            for (int i = 0; i < items.length; i++) {
                if (items[i].quantity > 0 && items[i].price <= money) {
                    System.out.printf("%d. %s - ₹%d\n", i + 1, items[i].name, items[i].price);
                    canAffordAnything = true;
                }
            }
            
            if (!canAffordAnything) {
                System.out.println("Sorry! You cannot afford any items with remaining money.");
                break;
            }
            
            System.out.println("0. Finish and get change");
            System.out.print("\nEnter item number (or 0 to finish): ");
            int choice = sc.nextInt();
            
            if (choice == 0) {
                buying = false;
                break;
            }
            
            if (choice < 1 || choice > items.length) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }
            
            int itemIndex = choice - 1;
            Item selectedItem = items[itemIndex];
            
            // Check if item is available and affordable
            if (selectedItem.quantity == 0) {
                System.out.println("Sorry! " + selectedItem.name + " is out of stock.");
                continue;
            }
            
            if (selectedItem.price > money) {
                System.out.println("Insufficient money! You need ₹" + 
                    (selectedItem.price - money) + " more.");
                continue;
            }
            
            // Process purchase
            money -= selectedItem.price;
            selectedItem.quantity--;
            totalSpent += selectedItem.price;
            
            System.out.println("Dispensing " + selectedItem.name + "...");
            System.out.println("Remaining money: ₹" + money);
            
            if (money > 0) {
                System.out.print("\nBuy another item? (yes/no): ");
                String another = sc.next().toLowerCase();
                if (!another.equals("yes") && !another.equals("y")) {
                    buying = false;
                }
            }
        }
        
        // Give change
        if (money > 0) {
            System.out.println("\n=== CHANGE DISPENSED ===");
            System.out.println("Total spent: ₹" + totalSpent);
            System.out.println("Change to return: ₹" + money);
            System.out.println("\nDenominations:");
            
            int remainingChange = money;
            for (int denomination : DENOMINATIONS) {
                int count = remainingChange / denomination;
                if (count > 0) {
                    System.out.printf("₹%3d x %d = ₹%d\n", 
                        denomination, count, denomination * count);
                    remainingChange %= denomination;
                }
            }
            
            if (remainingChange == 0) {
                System.out.println("✓ Change dispensed successfully!");
            } else {
                System.out.println("Warning: Could not dispense ₹" + remainingChange);
            }
        } else if (money == 0) {
            System.out.println("\n✓ Exact amount! No change due.");
        }
        
        System.out.println("\nThank you for using the vending machine!");
        
        // Display remaining stock
        System.out.println("\n=== REMAINING STOCK ===");
        for (Item item : items) {
            System.out.printf("%-15s: %d\n", item.name, item.quantity);
        }
        
        sc.close();
    }
}
```

### **Question 18: Date Validator**
```java
import java.util.Scanner;

public class DateValidator {
    
    // Check if year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    // Get days in month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
    
    // Check if date is valid
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || year > 9999) return false;
        if (month < 1 || month > 12) return false;
        
        int maxDays = getDaysInMonth(month, year);
        return day >= 1 && day <= maxDays;
    }
    
    // Zeller's Congruence to find day of week
    public static String getDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int k = year % 100;  // Year of century
        int j = year / 100;  // Century
        int q = day;
        int m = month;
        
        int h = (q + (13*(m+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", 
                        "Wednesday", "Thursday", "Friday"};
        
        return days[h];
    }
    
    // Convert date to Julian day number
    public static int toJulianDay(int day, int month, int year) {
        int a = (14 - month) / 12;
        int y = year + 4800 - a;
        int m = month + 12 * a - 3;
        
        return day + (153 * m + 2)/5 + 365*y + y/4 - y/100 + y/400 - 32045;
    }
    
    // Calculate difference between two dates in days
    public static int dateDifference(int d1, int m1, int y1, int d2, int m2, int y2) {
        int julian1 = toJulianDay(d1, m1, y1);
        int julian2 = toJulianDay(d2, m2, y2);
        
        return Math.abs(julian2 - julian1);
    }
    
    // Add days to a date
    public static int[] addDays(int day, int month, int year, int daysToAdd) {
        int julian = toJulianDay(day, month, year);
        julian += daysToAdd;
        
        return fromJulianDay(julian);
    }
    
    // Convert Julian day to date
    public static int[] fromJulianDay(int jd) {
        int a = jd + 32044;
        int b = (4 * a + 3) / 146097;
        int c = a - (146097 * b) / 4;
        int d = (4 * c + 3) / 1461;
        int e = c - (1461 * d) / 4;
        int m = (5 * e + 2) / 153;
        
        int day = e - (153 * m + 2) / 5 + 1;
        int month = m + 3 - 12 * (m / 10);
        int year = 100 * b + d - 4800 + (m / 10);
        
        return new int[]{day, month, year};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== DATE VALIDATOR & CALCULATOR ===");
        
        // Date validation
        System.out.println("\n1. Date Validation");
        System.out.print("Enter date (DD MM YYYY): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        if (isValidDate(day, month, year)) {
            System.out.println("✓ Valid date!");
            System.out.println("Day of week: " + getDayOfWeek(day, month, year));
            System.out.println("Month has " + getDaysInMonth(month, year) + " days");
            System.out.println("Leap year: " + (isLeapYear(year) ? "Yes" : "No"));
        } else {
            System.out.println("✗ Invalid date!");
        }
        
        // Date difference
        System.out.println("\n2. Date Difference Calculator");
        System.out.println("Enter first date (DD MM YYYY): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Enter second date (DD MM YYYY): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        if (isValidDate(d1, m1, y1) && isValidDate(d2, m2, y2)) {
            int diff = dateDifference(d1, m1, y1, d2, m2, y2);
            System.out.println("Difference: " + diff + " days");
            
            // Calculate years, months, days
            int[] fromJulian = fromJulianDay(toJulianDay(d1, m1, y1));
            int[] toJulian = fromJulianDay(toJulianDay(d2, m2, y2));
            
            int years = Math.abs(toJulian[2] - fromJulian[2]);
            int months = Math.abs(toJulian[1] - fromJulian[1]);
            int days = Math.abs(toJulian[0] - fromJulian[0]);
            
            if (toJulian[0] < fromJulian[0]) {
                months--;
                days += getDaysInMonth(fromJulian[1], fromJulian[2]);
            }
            
            if (toJulian[1] < fromJulian[1]) {
                years--;
                months += 12;
            }
            
            System.out.printf("Approximately: %d years, %d months, %d days\n", 
                years, months, days);
        } else {
            System.out.println("One or both dates are invalid!");
        }
        
        // Add days to date
        System.out.println("\n3. Add Days to Date");
        System.out.print("Enter date (DD MM YYYY): ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        
        System.out.print("Enter days to add: ");
        int daysToAdd = sc.nextInt();
        
        if (isValidDate(day, month, year)) {
            int[] newDate = addDays(day, month, year, daysToAdd);
            System.out.printf("New date after %d days: %02d/%02d/%04d\n", 
                daysToAdd, newDate[0], newDate[1], newDate[2]);
            System.out.println("Day of week: " + getDayOfWeek(newDate[0], newDate[1], newDate[2]));
        }
        
        // Age calculator
        System.out.println("\n4. Age Calculator");
        System.out.println("Enter birth date (DD MM YYYY): ");
        int bDay = sc.nextInt();
        int bMonth = sc.nextInt();
        int bYear = sc.nextInt();
        
        System.out.println("Enter current date (DD MM YYYY): ");
        int cDay = sc.nextInt();
        int cMonth = sc.nextInt();
        int cYear = sc.nextInt();
        
        if (isValidDate(bDay, bMonth, bYear) && isValidDate(cDay, cMonth, cYear)) {
            int ageYears = cYear - bYear;
            int ageMonths = cMonth - bMonth;
            int ageDays = cDay - bDay;
            
            if (ageDays < 0) {
                ageMonths--;
                ageDays += getDaysInMonth(cMonth - 1, cYear);
            }
            
            if (ageMonths < 0) {
                ageYears--;
                ageMonths += 12;
            }
            
            System.out.printf("Age: %d years, %d months, %d days\n", 
                ageYears, ageMonths, ageDays);
            
            // Calculate total days lived
            int totalDaysLived = dateDifference(bDay, bMonth, bYear, cDay, cMonth, cYear);
            System.out.println("Total days lived: " + totalDaysLived);
            
            // Next birthday
            int[] nextBirthday = addDays(bDay, bMonth, cYear, 0);
            if (toJulianDay(nextBirthday[0], nextBirthday[1], nextBirthday[2]) < 
                toJulianDay(cDay, cMonth, cYear)) {
                nextBirthday = addDays(bDay, bMonth, cYear + 1, 0);
            }
            
            int daysToBirthday = dateDifference(cDay, cMonth, cYear, 
                nextBirthday[0], nextBirthday[1], nextBirthday[2]);
            
            System.out.println("Days until next birthday: " + daysToBirthday);
        }
        
        sc.close();
    }
}
```

### **Question 19: Expression Evaluator**
```java
import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator {
    
    // Check if character is an operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    
    // Get precedence of operator
    public static int getPrecedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
    // Apply operator to two operands
    public static int applyOperator(char op, int a, int b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) throw new ArithmeticException("Division by zero!");
                return a / b;
            case '^': return (int) Math.pow(a, b);
            default: return 0;
        }
    }
    
    // Evaluate infix expression with single-digit numbers
    public static int evaluateInfix(String expression) {
        // Remove spaces
        expression = expression.replaceAll("\\s+", "");
        
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // If current character is a digit
            if (Character.isDigit(ch)) {
                int num = 0;
                // Handle multi-digit numbers
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--; // Adjust index
                values.push(num);
            }
            // If current character is '('
            else if (ch == '(') {
                operators.push(ch);
            }
            // If current character is ')'
            else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int val2 = values.pop();
                    int val1 = values.pop();
                    char op = operators.pop();
                    values.push(applyOperator(op, val1, val2));
                }
                operators.pop(); // Remove '('
            }
            // If current character is an operator
            else if (isOperator(ch)) {
                while (!operators.isEmpty() && getPrecedence(operators.peek()) >= getPrecedence(ch)) {
                    int val2 = values.pop();
                    int val1 = values.pop();
                    char op = operators.pop();
                    values.push(applyOperator(op, val1, val2));
                }
                operators.push(ch);
            }
        }
        
        // Apply remaining operators
        while (!operators.isEmpty()) {
            int val2 = values.pop();
            int val1 = values.pop();
            char op = operators.pop();
            values.push(applyOperator(op, val1, val2));
        }
        
        return values.pop();
    }
    
    // Evaluate postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == ' ') continue;
            
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                
                switch (ch) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                    case '^': stack.push((int) Math.pow(val1, val2)); break;
                }
            }
        }
        
        return stack.pop();
    }
    
    // Convert infix to postfix
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        expression = expression.replaceAll("\\s+", "");
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch).append(' ');
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(' ');
        }
        
        return result.toString().trim();
    }
    
    // Convert infix to prefix
    public static String infixToPrefix(String expression) {
        // Reverse the expression
        StringBuilder reversed = new StringBuilder(expression).reverse();
        
        // Replace '(' with ')' and vice versa
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (ch == '(') {
                reversed.setCharAt(i, ')');
            } else if (ch == ')') {
                reversed.setCharAt(i, '(');
            }
        }
        
        // Convert to postfix
        String postfix = infixToPostfix(reversed.toString());
        
        // Reverse the postfix to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== EXPRESSION EVALUATOR ===");
        System.out.println("Supports: +, -, *, /, ^, (, )");
        System.out.println("Multi-digit numbers are supported");
        
        while (true) {
            System.out.print("\nEnter expression (or 'exit' to quit): ");
            String expression = sc.nextLine().trim();
            
            if (expression.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (expression.isEmpty()) {
                System.out.println("Please enter an expression!");
                continue;
            }
            
            try {
                // Evaluate infix
                int result = evaluateInfix(expression);
                System.out.println("Infix evaluation: " + expression + " = " + result);
                
                // Convert to postfix and evaluate
                String postfix = infixToPostfix(expression);
                int postfixResult = evaluatePostfix(postfix);
                System.out.println("Postfix notation: " + postfix);
                System.out.println("Postfix evaluation: " + postfixResult);
                
                // Convert to prefix
                String prefix = infixToPrefix(expression);
                System.out.println("Prefix notation: " + prefix);
                
                // Step-by-step evaluation
                System.out.println("\nStep-by-step evaluation:");
                evaluateStepByStep(expression);
                
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please check your expression syntax.");
            }
        }
        
        // Test cases
        System.out.println("\n=== TEST CASES ===");
        String[] testExpressions = {
            "2+3*4",            // 14
            "(2+3)*4",          // 20
            "2*3+4*5",          // 26
            "2^3+4*5",          // 28
            "10+20/5*2",        // 18
            "(1+2)*(3+4)",      // 21
            "100/20+5*3-2",     // 18
            "2^3^2",            // 64 (right associative)
        };
        
        for (String expr : testExpressions) {
            try {
                int result = evaluateInfix(expr);
                System.out.printf("%-20s = %d\n", expr, result);
            } catch (Exception e) {
                System.out.printf("%-20s = ERROR: %s\n", expr, e.getMessage());
            }
        }
        
        sc.close();
    }
    
    public static void evaluateStepByStep(String expression) {
        expression = expression.replaceAll("\\s+", "");
        
        // Find and evaluate sub-expressions in parentheses first
        while (expression.contains("(")) {
            int start = expression.lastIndexOf('(');
            int end = expression.indexOf(')', start);
            
            if (end == -1) {
                System.out.println("Error: Mismatched parentheses!");
                return;
            }
            
            String subExpr = expression.substring(start + 1, end);
            int subResult = evaluateInfix(subExpr);
            
            System.out.printf("Evaluate (%s) = %d\n", subExpr, subResult);
            
            expression = expression.substring(0, start) + subResult + 
                        expression.substring(end + 1);
        }
        
        // Now evaluate remaining expression
        System.out.println("Remaining expression: " + expression);
        
        // Evaluate multiplication and division
        String[] parts = expression.split("(?=[+-])|(?<=[+-])");
        
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("*") || parts[i].contains("/")) {
                int result = evaluateInfix(parts[i]);
                System.out.printf("Evaluate %s = %d\n", parts[i], result);
                parts[i] = String.valueOf(result);
            }
        }
        
        // Combine and evaluate addition and subtraction
        StringBuilder finalExpr = new StringBuilder();
        for (String part : parts) {
            finalExpr.append(part);
        }
        
        int finalResult = evaluateInfix(finalExpr.toString());
        System.out.printf("Final: %s = %d\n", finalExpr, finalResult);
    }
}
```

### **Question 20: Number System Converter (Advanced)**
```java
import java.util.Scanner;

public class AdvancedNumberConverter {
    
    // Convert from any base (2-36) to decimal
    public static long toDecimal(String number, int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }
        
        long result = 0;
        int power = 0;
        
        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = Character.toUpperCase(number.charAt(i));
            int value;
            
            if (digit >= '0' && digit <= '9') {
                value = digit - '0';
            } else if (digit >= 'A' && digit <= 'Z') {
                value = 10 + (digit - 'A');
            } else {
                throw new IllegalArgumentException("Invalid digit: " + digit);
            }
            
            if (value >= base) {
                throw new IllegalArgumentException("Digit " + digit + 
                    " is invalid for base " + base);
            }
            
            result += value * Math.pow(base, power);
            power++;
        }
        
        return result;
    }
    
    // Convert from decimal to any base (2-36)
    public static String fromDecimal(long decimal, int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }
        
        if (decimal == 0) return "0";
        
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = (int)(decimal % base);
            result.insert(0, digits.charAt(remainder));
            decimal /= base;
        }
        
        return result.toString();
    }
    
    // Direct conversion between any two bases
    public static String convertBase(String number, int fromBase, int toBase) {
        // First convert to decimal
        long decimal = toDecimal(number, fromBase);
        
        // Then convert to target base
        return fromDecimal(decimal, toBase);
    }
    
    // Add two numbers in any base
    public static String addInBase(String num1, String num2, int base) {
        long decimal1 = toDecimal(num1, base);
        long decimal2 = toDecimal(num2, base);
        long sum = decimal1 + decimal2;
        
        return fromDecimal(sum, base);
    }
    
    // Subtract two numbers in any base
    public static String subtractInBase(String num1, String num2, int base) {
        long decimal1 = toDecimal(num1, base);
        long decimal2 = toDecimal(num2, base);
        
        if (decimal1 < decimal2) {
            throw new IllegalArgumentException("First number must be larger than second");
        }
        
        long difference = decimal1 - decimal2;
        return fromDecimal(difference, base);
    }
    
    // Multiply two numbers in any base
    public static String multiplyInBase(String num1, String num2, int base) {
        long decimal1 = toDecimal(num1, base);
        long decimal2 = toDecimal(num2, base);
        long product = decimal1 * decimal2;
        
        return fromDecimal(product, base);
    }
    
    // Check if number is valid for given base
    public static boolean isValidNumber(String number, int base) {
        String validDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, base);
        
        for (int i = 0; i < number.length(); i++) {
            char digit = Character.toUpperCase(number.charAt(i));
            if (validDigits.indexOf(digit) == -1) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== ADVANCED NUMBER SYSTEM CONVERTER ===");
        System.out.println("Supports bases 2 through 36");
        System.out.println("Digits: 0-9, A-Z (A=10, B=11, ..., Z=35)");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Convert between bases");
            System.out.println("2. Arithmetic operations in any base");
            System.out.println("3. Validate number for a base");
            System.out.println("4. Show conversion table");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("\nEnter number: ");
                    String number = sc.nextLine().toUpperCase();
                    
                    System.out.print("Enter current base (2-36): ");
                    int fromBase = sc.nextInt();
                    
                    System.out.print("Enter target base (2-36): ");
                    int toBase = sc.nextInt();
                    
                    try {
                        String result = convertBase(number, fromBase, toBase);
                        System.out.printf("\n%s (base %d) = %s (base %d)\n", 
                            number, fromBase, result, toBase);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 2:
                    System.out.print("\nEnter first number: ");
                    String num1 = sc.nextLine().toUpperCase();
                    
                    System.out.print("Enter second number: ");
                    String num2 = sc.nextLine().toUpperCase();
                    
                    System.out.print("Enter base for operation (2-36): ");
                    int base = sc.nextInt();
                    
                    System.out.print("Enter operation (+, -, *): ");
                    char operation = sc.next().charAt(0);
                    
                    try {
                        String result = "";
                        switch (operation) {
                            case '+':
                                result = addInBase(num1, num2, base);
                                System.out.printf("\n%s + %s (base %d) = %s\n", 
                                    num1, num2, base, result);
                                break;
                            case '-':
                                result = subtractInBase(num1, num2, base);
                                System.out.printf("\n%s - %s (base %d) = %s\n", 
                                    num1, num2, base, result);
                                break;
                            case '*':
                                result = multiplyInBase(num1, num2, base);
                                System.out.printf("\n%s * %s (base %d) = %s\n", 
                                    num1, num2, base, result);
                                break;
                            default:
                                System.out.println("Invalid operation!");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 3:
                    System.out.print("\nEnter number: ");
                    number = sc.nextLine().toUpperCase();
                    
                    System.out.print("Enter base to check (2-36): ");
                    base = sc.nextInt();
                    
                    if (isValidNumber(number, base)) {
                        System.out.println("✓ Valid number for base " + base);
                        System.out.println("Decimal value: " + toDecimal(number, base));
                    } else {
                        System.out.println("✗ Invalid number for base " + base);
                    }
                    break;
                    
                case 4:
                    System.out.print("\nEnter a decimal number: ");
                    long decimal = sc.nextLong();
                    
                    System.out.println("\nConversion Table for " + decimal + ":");
                    System.out.println("+------+----------------+");
                    System.out.println("| Base | Representation |");
                    System.out.println("+------+----------------+");
                    
                    for (int b = 2; b <= 16; b++) {
                        String representation = fromDecimal(decimal, b);
                        System.out.printf("| %4d | %14s |\n", b, representation);
                    }
                    System.out.println("+------+----------------+");
                    break;
                    
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
```

---

## **How to Use These Programs:**

1. **Compile any program:**
```bash
javac ProgramName.java
```

2. **Run any program:**
```bash
java ProgramName
```

3. **Create a package structure (optional):**
```bash
mkdir -p com/dsa/practice
mv *.java com/dsa/practice/
javac com/dsa/practice/*.java
java com.dsa.practice.ProgramName
```

## **Key Concepts Covered in These Solutions:**

1. **Basic Syntax & Structure:** Class declaration, main method, imports
2. **Variables & Data Types:** int, double, char, boolean, String
3. **Operators:** Arithmetic, relational, logical, bitwise, ternary
4. **Control Flow:** if-else, switch, while, for loops
5. **Methods/Functions:** Parameter passing, return types
6. **Arrays & Strings:** Manipulation, traversal, methods
7. **Input/Output:** Scanner class, formatted output
8. **Math Operations:** Using Math class, custom calculations
9. **Error Handling:** Basic validation, edge cases
10. **Problem Solving:** Breaking down complex problems

## **Practice Tips:**

1. Start with simple problems (1-10)
2. Understand the logic before looking at the code
3. Try to solve problems in different ways
4. Test with edge cases and invalid inputs
5. Modify programs to add more features
6. Time yourself to improve speed
7. Explain the solution to someone else

