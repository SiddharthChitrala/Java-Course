/**
 * DSA BASICS - Complete Java Reference
 * This file covers fundamental concepts needed for Data Structures and Algorithms.
 * Contains: Variables, Data Types, Operators, Type Conversions, and more.
 */
public class DSABasicsOneFile {
    public static void main(String[] args) {

        // ====================================================
        // SECTION 1: VARIABLES AND DATA TYPES
        // ====================================================
        System.out.println("\n=== SECTION 1: VARIABLES AND DATA TYPES ===");
        
        // Primitive Data Types (Stored directly in memory)
        int a = 10;             // Integer: 4 bytes, range: -2^31 to 2^31-1
        double b = 5.5;         // Double-precision float: 8 bytes
        char c = 'A';           // Single character: 2 bytes (Unicode)
        boolean flag = true;    // Boolean: true/false (1 bit, but JVM uses 1 byte)
        String name = "DSA";    // String: Object type (not primitive)
        
        // Additional primitive types (for completeness)
        byte smallNum = 127;    // Byte: 1 byte, range: -128 to 127
        short mediumNum = 32000; // Short: 2 bytes, range: -32768 to 32767
        long bigNum = 100000L;  // Long: 8 bytes, add 'L' suffix
        float pi = 3.14f;       // Float: 4 bytes, add 'f' suffix
        
        // Display variable values
        System.out.println("int a: " + a);
        System.out.println("double b: " + b);
        System.out.println("char c: " + c);
        System.out.println("boolean flag: " + flag);
        System.out.println("String name: " + name);
        System.out.println("byte smallNum: " + smallNum);
        System.out.println("short mediumNum: " + mediumNum);
        System.out.println("long bigNum: " + bigNum);
        System.out.println("float pi: " + pi);

        // ====================================================
        // SECTION 2: TYPE CONVERSIONS
        // ====================================================
        System.out.println("\n=== SECTION 2: TYPE CONVERSIONS ===");
        
        // WIDENING CONVERSION (Implicit, Automatic)
        // Converts smaller type to larger type - No data loss
        int intValue = 100;
        double widen = intValue;        // int (4 bytes) → double (8 bytes)
        float widenToFloat = intValue;  // int → float
        long widenToLong = intValue;    // int → long
        
        System.out.println("Widening int → double: " + widen);
        System.out.println("Widening int → float: " + widenToFloat);
        System.out.println("Widening int → long: " + widenToLong);
        
        // NARROWING CONVERSION (Explicit, Manual Casting)
        // Converts larger type to smaller type - May lose data
        double doubleValue = 9.87;
        int narrow = (int) doubleValue;    // double → int (loses decimal)
        byte narrowByte = (byte) intValue; // int → byte
        
        System.out.println("Narrowing double → int: " + narrow + " (Decimal lost!)");
        System.out.println("Narrowing int → byte: " + narrowByte);

        // ====================================================
        // SECTION 3: ARITHMETIC OPERATORS
        // ====================================================
        System.out.println("\n=== SECTION 3: ARITHMETIC OPERATORS ===");
        
        int num1 = 15;
        int num2 = 4;
        
        int sum = num1 + num2;      // Addition: 15 + 4 = 19
        int diff = num1 - num2;     // Subtraction: 15 - 4 = 11
        int mul = num1 * num2;      // Multiplication: 15 * 4 = 60
        int div = num1 / num2;      // Division: 15 / 4 = 3 (Integer division!)
        int mod = num1 % num2;      // Modulus (Remainder): 15 % 4 = 3
        
        System.out.println("Addition (15 + 4): " + sum);
        System.out.println("Subtraction (15 - 4): " + diff);
        System.out.println("Multiplication (15 * 4): " + mul);
        System.out.println("Division (15 / 4): " + div + " (Note: Integer division truncates)");
        System.out.println("Modulus (15 % 4): " + mod);
        
        // Floating point division
        double realDiv = (double) num1 / num2;
        System.out.println("Real division (15.0 / 4): " + realDiv);

        // ====================================================
        // SECTION 4: UNARY OPERATORS (CRITICAL FOR LOOPS)
        // ====================================================
        System.out.println("\n=== SECTION 4: UNARY OPERATORS ===");
        
        int x = 5;
        System.out.println("Initial x: " + x);
        
        // PRE-INCREMENT: Increment first, then use value
        int preInc = ++x;  // 1. x becomes 6, 2. preInc gets 6
        System.out.println("After ++x (pre-increment): x = " + x + ", preInc = " + preInc);
        
        // POST-INCREMENT: Use value first, then increment
        int postInc = x++; // 1. postInc gets 6, 2. x becomes 7
        System.out.println("After x++ (post-increment): x = " + x + ", postInc = " + postInc);
        
        // PRE-DECREMENT: Decrement first, then use value
        int preDec = --x;  // 1. x becomes 6, 2. preDec gets 6
        System.out.println("After --x (pre-decrement): x = " + x + ", preDec = " + preDec);
        
        // POST-DECREMENT: Use value first, then decrement
        int postDec = x--; // 1. postDec gets 6, 2. x becomes 5
        System.out.println("After x-- (post-decrement): x = " + x + ", postDec = " + postDec);
        
        // Memory tip: 
        // ++ BEFORE variable → change FIRST, use AFTER
        // ++ AFTER variable → use FIRST, change AFTER

        // ====================================================
        // SECTION 5: COMPARISON OPERATORS
        // ====================================================
        System.out.println("\n=== SECTION 5: COMPARISON OPERATORS ===");
        
        int val1 = 10;
        double val2 = 10.0;
        
        boolean isGreater = val1 > 5;           // Greater than
        boolean isLess = val1 < 15;             // Less than
        boolean isGreaterEqual = val1 >= 10;    // Greater than or equal
        boolean isLessEqual = val1 <= 10;       // Less than or equal
        boolean isEqual = (val1 == 10);         // Equal to (use ==, not =)
        boolean isNotEqual = (val1 != 5);       // Not equal to
        
        System.out.println("10 > 5: " + isGreater);
        System.out.println("10 < 15: " + isLess);
        System.out.println("10 >= 10: " + isGreaterEqual);
        System.out.println("10 <= 10: " + isLessEqual);
        System.out.println("10 == 10: " + isEqual);
        System.out.println("10 != 5: " + isNotEqual);
        
        // IMPORTANT: == for primitives, .equals() for objects
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("s1 == s2: " + (s1 == s2));         // true (string pool)
        System.out.println("s1 == s3: " + (s1 == s3));         // false (different objects)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same content)

        // ====================================================
        // SECTION 6: LOGICAL OPERATORS
        // ====================================================
        System.out.println("\n=== SECTION 6: LOGICAL OPERATORS ===");
        
        boolean condition1 = true;
        boolean condition2 = false;
        
        // AND (&&) - Both must be true
        boolean andResult = condition1 && condition2;          // true && false = false
        boolean andResult2 = (val1 > 5) && (val1 < 20);        // true && true = true
        
        // OR (||) - At least one must be true
        boolean orResult = condition1 || condition2;           // true || false = true
        boolean orResult2 = (val1 > 15) || (val1 < 20);        // false || true = true
        
        // NOT (!) - Inverts the boolean
        boolean notResult = !condition1;                       // !true = false
        
        // Short-circuit evaluation
        boolean shortCircuit = (val1 > 5) || (someMethod());   // someMethod() won't execute
        
        System.out.println("true && false: " + andResult);
        System.out.println("(10 > 5) && (10 < 20): " + andResult2);
        System.out.println("true || false: " + orResult);
        System.out.println("(10 > 15) || (10 < 20): " + orResult2);
        System.out.println("!true: " + notResult);
        
        // XOR (Exclusive OR) - Either true but not both
        boolean xorResult = condition1 ^ condition2;           // true ^ false = true
        System.out.println("true XOR false: " + xorResult);

        // ====================================================
        // SECTION 7: BITWISE OPERATORS (IMPORTANT FOR DSA)
        // ====================================================
        System.out.println("\n=== SECTION 7: BITWISE OPERATORS ===");
        
        int p = 6;   // Binary: 0110
        int q = 3;   // Binary: 0011
        
        // Bitwise AND - 1 if both bits are 1
        int andOp = p & q;     // 0110 & 0011 = 0010 (2)
        
        // Bitwise OR - 1 if at least one bit is 1
        int orOp = p | q;      // 0110 | 0011 = 0111 (7)
        
        // Bitwise XOR - 1 if bits are different
        int xorOp = p ^ q;     // 0110 ^ 0011 = 0101 (5)
        
        // Bitwise NOT (One's Complement) - Flips all bits
        int notOp = ~p;        // ~0110 = ...11111001 (two's complement)
        
        // Left Shift - Multiply by 2^n
        int leftShift = p << 1;  // 0110 << 1 = 1100 (12 = 6 * 2^1)
        int leftShift2 = p << 2; // 0110 << 2 = 11000 (24 = 6 * 2^2)
        
        // Right Shift - Divide by 2^n (preserves sign)
        int rightShift = p >> 1; // 0110 >> 1 = 0011 (3 = 6 / 2^1)
        int rightShift2 = -8 >> 1; // Preserves sign
        
        // Unsigned Right Shift - Always fills with 0
        int unsignedRightShift = -8 >>> 1;
        
        System.out.println("p = 6 (0110), q = 3 (0011)");
        System.out.println("p & q (AND): " + andOp + " (Binary: " + Integer.toBinaryString(andOp) + ")");
        System.out.println("p | q (OR): " + orOp + " (Binary: " + Integer.toBinaryString(orOp) + ")");
        System.out.println("p ^ q (XOR): " + xorOp + " (Binary: " + Integer.toBinaryString(xorOp) + ")");
        System.out.println("~p (NOT): " + notOp + " (Binary: " + Integer.toBinaryString(notOp) + ")");
        System.out.println("p << 1 (Left Shift): " + leftShift + " (6 * 2^1)");
        System.out.println("p << 2 (Left Shift): " + leftShift2 + " (6 * 2^2)");
        System.out.println("p >> 1 (Right Shift): " + rightShift + " (6 / 2^1)");
        System.out.println("-8 >> 1 (Signed Right Shift): " + rightShift2);
        System.out.println("-8 >>> 1 (Unsigned Right Shift): " + unsignedRightShift);

        // ====================================================
        // SECTION 8: TERNARY OPERATOR (CONDITIONAL OPERATOR)
        // ====================================================
        System.out.println("\n=== SECTION 8: TERNARY OPERATOR ===");
        
        // Syntax: condition ? value_if_true : value_if_false
        int score = 85;
        String grade = (score >= 90) ? "A" : 
                      (score >= 80) ? "B" : 
                      (score >= 70) ? "C" : 
                      (score >= 60) ? "D" : "F";
        
        String message = (a > 5) ? "Greater than 5" : "5 or less";
        int maxValue = (num1 > num2) ? num1 : num2;
        
        System.out.println("Score: " + score + ", Grade: " + grade);
        System.out.println("Ternary message (a=10): " + message);
        System.out.println("Max between " + num1 + " and " + num2 + ": " + maxValue);

        // ====================================================
        // SECTION 9: ASSIGNMENT OPERATORS (DSA SHORTCUTS)
        // ====================================================
        System.out.println("\n=== SECTION 9: ASSIGNMENT OPERATORS ===");
        
        int k = 10;
        System.out.println("Initial k: " + k);
        
        k += 5;  // Equivalent to: k = k + 5
        System.out.println("After k += 5: " + k);
        
        k -= 2;  // Equivalent to: k = k - 2
        System.out.println("After k -= 2: " + k);
        
        k *= 3;  // Equivalent to: k = k * 3
        System.out.println("After k *= 3: " + k);
        
        k /= 4;  // Equivalent to: k = k / 4
        System.out.println("After k /= 4: " + k);
        
        k %= 3;  // Equivalent to: k = k % 3
        System.out.println("After k %= 3: " + k);
        
        // Bitwise assignment operators (useful in DSA)
        int m = 12;
        m &= 5;   // m = m & 5
        System.out.println("After m &= 5: " + m);
        
        m |= 9;   // m = m | 9
        System.out.println("After m |= 9: " + m);
        
        m ^= 3;   // m = m ^ 3
        System.out.println("After m ^= 3: " + m);
        
        m <<= 2;  // m = m << 2
        System.out.println("After m <<= 2: " + m);
        
        m >>= 1;  // m = m >> 1
        System.out.println("After m >>= 1: " + m);

        // ====================================================
        // SECTION 10: OPERATOR PRECEDENCE
        // ====================================================
        System.out.println("\n=== SECTION 10: OPERATOR PRECEDENCE ===");
        
        // Highest to lowest precedence:
        // 1. Postfix: expr++ expr--
        // 2. Unary: ++expr --expr +expr -expr ~ !
        // 3. Multiplicative: * / %
        // 4. Additive: + -
        // 5. Shift: << >> >>>
        // 6. Relational: < > <= >= instanceof
        // 7. Equality: == !=
        // 8. Bitwise AND: &
        // 9. Bitwise XOR: ^
        // 10. Bitwise OR: |
        // 11. Logical AND: &&
        // 12. Logical OR: ||
        // 13. Ternary: ? :
        // 14. Assignment: = += -= etc.
        
        int result = 5 + 3 * 2;      // Multiplication first: 3*2=6, then +5=11
        int result2 = (5 + 3) * 2;   // Parentheses override: 5+3=8, then *2=16
        
        System.out.println("5 + 3 * 2 = " + result + " (Multiplication has higher precedence)");
        System.out.println("(5 + 3) * 2 = " + result2 + " (Parentheses change order)");
        
        // Complex example
        boolean complex = 5 > 3 && 4 < 6 || 2 == 1;
        // Evaluates as: (5 > 3) && (4 < 6) || (2 == 1)
        // = true && true || false
        // = true || false
        // = true
        System.out.println("5 > 3 && 4 < 6 || 2 == 1: " + complex);

        // ====================================================
        // SECTION 11: COMMON DSA PATTERNS USING OPERATORS
        // ====================================================
        System.out.println("\n=== SECTION 11: DSA PATTERNS ===");
        
        // 1. Swapping two numbers (without temp variable)
        int numA = 10, numB = 20;
        System.out.println("Before swap: numA=" + numA + ", numB=" + numB);
        numA = numA ^ numB;
        numB = numA ^ numB;
        numA = numA ^ numB;
        System.out.println("After XOR swap: numA=" + numA + ", numB=" + numB);
        
        // 2. Check if number is even or odd
        int number = 17;
        boolean isEven = (number & 1) == 0;  // Last bit 0 = even, 1 = odd
        System.out.println(number + " is even? " + isEven);
        
        // 3. Get the last set bit
        int lastSetBit = number & -number;
        System.out.println("Last set bit of " + number + ": " + lastSetBit);
        
        // 4. Check if power of two
        boolean isPowerOfTwo = (number > 0) && ((number & (number - 1)) == 0);
        System.out.println(number + " is power of two? " + isPowerOfTwo);
        
        // 5. Fast multiplication/division by powers of 2
        int fastMul = number << 3;    // Multiply by 8 (2^3)
        int fastDiv = number >> 2;    // Divide by 4 (2^2)
        System.out.println(number + " * 8 = " + fastMul + " (using << 3)");
        System.out.println(number + " / 4 = " + fastDiv + " (using >> 2)");
    }
    
    // Helper method to demonstrate short-circuit evaluation
    private static boolean someMethod() {
        System.out.println("  someMethod() was called!");
        return true;
    }
}