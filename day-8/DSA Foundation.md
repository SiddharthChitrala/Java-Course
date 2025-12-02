# Java DSA Foundation: Variables, Data Types, Operators & Control Flow

## Complete Notes & Problem-Solving Guide

---

## 1. Variables

### Key Concepts
- **Variable**: Named memory location to store data
- **Declaration**: `dataType variableName;`
- **Initialization**: `variableName = value;`
- **Combined**: `dataType variableName = value;`

### DSA Tips
- Use meaningful variable names for clarity
- Initialize before use to avoid errors
- Choose appropriate scope (local vs instance)

```java
// Examples
int count = 0;           // counter variables
int left = 0, right = n-1;  // two-pointer technique
boolean found = false;   // flag variables
```

---

## 2. Data Types

### Primitive Types (8 types)

| Type | Size | Range | Default | Use Case |
|------|------|-------|---------|----------|
| `byte` | 1 byte | -128 to 127 | 0 | Memory-efficient arrays |
| `short` | 2 bytes | -32,768 to 32,767 | 0 | Rarely used |
| `int` | 4 bytes | -2³¹ to 2³¹-1 | 0 | **Most common for DSA** |
| `long` | 8 bytes | -2⁶³ to 2⁶³-1 | 0L | Large numbers, combinations |
| `float` | 4 bytes | ~7 decimal digits | 0.0f | Avoid in DSA |
| `double` | 8 bytes | ~15 decimal digits | 0.0d | Geometry, averages |
| `char` | 2 bytes | 0 to 65,535 | '\u0000' | String manipulation |
| `boolean` | 1 bit | true/false | false | Flags, conditions |

### DSA-Specific Choices
- **Arrays**: Use `int[]` for indices and counts
- **Large products**: Use `long` to prevent overflow
- **Character problems**: Use `char[]` or `String`
- **Flags**: Use `boolean` for visited arrays, conditions

---

## 3. Type Conversion & Casting

### Implicit Conversion (Widening)
```java
int a = 100;
long b = a;      // Automatic: int → long
double c = b;    // Automatic: long → double
```

### Explicit Casting (Narrowing)
```java
double x = 9.7;
int y = (int) x;  // y = 9 (decimal truncated)

long big = 1000000L;
int small = (int) big;  // Potential data loss
```

### DSA Common Patterns
```java
// Character to integer
char ch = '5';
int digit = ch - '0';  // digit = 5

// Integer to character
int num = 7;
char c = (char)(num + '0');  // c = '7'

// Array index from character
char letter = 'A';
int index = letter - 'A';  // index = 0 (for frequency arrays)
```

---

## 4. Operators

### Arithmetic Operators
```java
+  // Addition
-  // Subtraction
*  // Multiplication
/  // Division (integer division if both operands are int)
%  // Modulo (remainder)
```

**DSA Use Cases:**
```java
// Check even/odd
if (num % 2 == 0) // even

// Get last digit
int lastDigit = num % 10;

// Remove last digit
num = num / 10;

// Middle element
int mid = left + (right - left) / 2;  // Prevents overflow
```

### Comparison Operators
```java
==  !=  >  <  >=  <=
```

### Logical Operators
```java
&&  // AND (short-circuit)
||  // OR (short-circuit)
!   // NOT
```

### Bitwise Operators (Important for DSA)
```java
&   // AND
|   // OR
^   // XOR
~   // NOT
<<  // Left shift (multiply by 2)
>>  // Right shift (divide by 2)
>>> // Unsigned right shift
```

**Common Bitwise Tricks:**
```java
// Check if power of 2
boolean isPowerOf2 = (n & (n-1)) == 0 && n != 0;

// Get ith bit
int bit = (num >> i) & 1;

// Set ith bit
num = num | (1 << i);

// Clear ith bit
num = num & ~(1 << i);

// Toggle ith bit
num = num ^ (1 << i);

// Count set bits (Brian Kernighan's algorithm)
int count = 0;
while (n > 0) {
    n = n & (n - 1);
    count++;
}
```

### Assignment Operators
```java
=  +=  -=  *=  /=  %=  &=  |=  ^=  <<=  >>=
```

### Increment/Decrement
```java
++  // Pre/Post increment
--  // Pre/Post decrement

int x = 5;
int y = x++;  // y=5, x=6 (post-increment)
int z = ++x;  // z=7, x=7 (pre-increment)
```

---

## 5. Conditional Statements

### if-else
```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code
}
```

### Ternary Operator
```java
result = (condition) ? valueIfTrue : valueIfFalse;

// Example: Find max
int max = (a > b) ? a : b;
```

### switch-case
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

**DSA Pattern:**
```java
// Character type checking
switch (ch) {
    case 'a': case 'e': case 'i': case 'o': case 'u':
        vowelCount++;
        break;
    default:
        consonantCount++;
}
```

---

## 6. Loops

### for Loop
```java
for (initialization; condition; update) {
    // code
}

// Standard iteration
for (int i = 0; i < n; i++) {
    // process arr[i]
}

// Reverse iteration
for (int i = n-1; i >= 0; i--) {
    // process backward
}

// Step by 2
for (int i = 0; i < n; i += 2) {
    // process even indices
}
```

### Enhanced for Loop
```java
for (dataType element : array) {
    // process element
}

// Example
for (int num : nums) {
    sum += num;
}
```

### while Loop
```java
while (condition) {
    // code
}

// Common in DSA
while (left < right) {
    // two-pointer logic
}
```

### do-while Loop
```java
do {
    // code (executes at least once)
} while (condition);
```

---

## DSA Problem-Solving Patterns

### Pattern 1: Two Pointers
```java
int left = 0, right = arr.length - 1;
while (left < right) {
    if (arr[left] + arr[right] == target) {
        return true;
    } else if (arr[left] + arr[right] < target) {
        left++;
    } else {
        right--;
    }
}
```

### Pattern 2: Sliding Window
```java
int windowSum = 0;
for (int i = 0; i < k; i++) {
    windowSum += arr[i];
}
int maxSum = windowSum;

for (int i = k; i < n; i++) {
    windowSum = windowSum - arr[i-k] + arr[i];
    maxSum = Math.max(maxSum, windowSum);
}
```

### Pattern 3: Frequency Counting
```java
// Using array for lowercase letters
int[] freq = new int[26];
for (char c : str.toCharArray()) {
    freq[c - 'a']++;
}
```

---

## Coding Questions with Solutions

### Q1: Reverse an Integer
**Problem:** Reverse the digits of an integer (handle overflow)

```java
public int reverse(int x) {
    long result = 0;  // Use long to detect overflow
    
    while (x != 0) {
        int digit = x % 10;       // Extract last digit
        result = result * 10 + digit;
        x = x / 10;               // Remove last digit
        
        // Check overflow
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
    }
    
    return (int) result;
}

// Logic:
// 1. Extract digits using % 10
// 2. Build reversed number
// 3. Check for overflow using long
```

**Test Cases:**
```java
reverse(123)   → 321
reverse(-123)  → -321
reverse(120)   → 21
reverse(0)     → 0
```

---

### Q2: Count Set Bits (Hamming Weight)
**Problem:** Count number of 1's in binary representation

```java
public int hammingWeight(int n) {
    int count = 0;
    
    // Method 1: Basic approach
    while (n != 0) {
        count += n & 1;  // Check last bit
        n >>>= 1;        // Unsigned right shift
    }
    
    return count;
}

// Method 2: Brian Kernighan's Algorithm (Optimal)
public int hammingWeightOptimal(int n) {
    int count = 0;
    
    while (n != 0) {
        n = n & (n - 1);  // Removes rightmost set bit
        count++;
    }
    
    return count;
}

// Logic:
// n & (n-1) clears the lowest set bit
// Example: 12 (1100) & 11 (1011) = 8 (1000)
```

**Test Cases:**
```java
hammingWeight(11)  → 3  (binary: 1011)
hammingWeight(128) → 1  (binary: 10000000)
hammingWeight(7)   → 3  (binary: 111)
```

---

### Q3: Power of Two
**Problem:** Check if a number is a power of 2

```java
public boolean isPowerOfTwo(int n) {
    // Method 1: Bitwise trick
    return n > 0 && (n & (n - 1)) == 0;
    
    // Logic: Power of 2 has only one set bit
    // 8 = 1000, 8-1 = 0111, 1000 & 0111 = 0
}

// Method 2: Using loop
public boolean isPowerOfTwoLoop(int n) {
    if (n <= 0) return false;
    
    while (n % 2 == 0) {
        n = n / 2;
    }
    
    return n == 1;
}
```

**Test Cases:**
```java
isPowerOfTwo(1)   → true  (2^0)
isPowerOfTwo(16)  → true  (2^4)
isPowerOfTwo(3)   → false
isPowerOfTwo(0)   → false
```

---

### Q4: Find Missing Number
**Problem:** Array contains n numbers from 0 to n, find missing number

```java
public int missingNumber(int[] nums) {
    int n = nums.length;
    
    // Method 1: XOR approach (no overflow)
    int result = n;
    for (int i = 0; i < n; i++) {
        result ^= i ^ nums[i];
    }
    return result;
    
    // Logic: XOR properties
    // a ^ a = 0
    // a ^ 0 = a
    // All paired numbers cancel out, missing remains
}

// Method 2: Sum formula
public int missingNumberSum(int[] nums) {
    int n = nums.length;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;
    
    for (int num : nums) {
        actualSum += num;
    }
    
    return expectedSum - actualSum;
}
```

**Test Cases:**
```java
missingNumber([3,0,1])     → 2
missingNumber([0,1])       → 2
missingNumber([9,6,4,2,3,5,7,0,1]) → 8
```

---

### Q5: Palindrome Number
**Problem:** Check if integer is palindrome without converting to string

```java
public boolean isPalindrome(int x) {
    // Negative numbers are not palindromes
    if (x < 0) return false;
    
    // Numbers ending with 0 (except 0 itself)
    if (x != 0 && x % 10 == 0) return false;
    
    int reversed = 0;
    int original = x;
    
    while (x > 0) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x = x / 10;
    }
    
    return original == reversed;
}

// Optimized: Reverse only half
public boolean isPalindromeOptimized(int x) {
    if (x < 0 || (x != 0 && x % 10 == 0)) return false;
    
    int reversedHalf = 0;
    while (x > reversedHalf) {
        reversedHalf = reversedHalf * 10 + x % 10;
        x = x / 10;
    }
    
    // For odd length: x == reversedHalf / 10
    return x == reversedHalf || x == reversedHalf / 10;
}
```

**Test Cases:**
```java
isPalindrome(121)   → true
isPalindrome(-121)  → false
isPalindrome(10)    → false
isPalindrome(12321) → true
```

---

### Q6: FizzBuzz
**Problem:** Print numbers 1 to n, but:
- "Fizz" for multiples of 3
- "Buzz" for multiples of 5
- "FizzBuzz" for multiples of both

```java
public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    
    for (int i = 1; i <= n; i++) {
        if (i % 15 == 0) {  // Multiple of both 3 and 5
            result.add("FizzBuzz");
        } else if (i % 3 == 0) {
            result.add("Fizz");
        } else if (i % 5 == 0) {
            result.add("Buzz");
        } else {
            result.add(String.valueOf(i));
        }
    }
    
    return result;
}

// Logic:
// 1. Check divisibility by 15 first (LCM of 3 and 5)
// 2. Then check 3 and 5 individually
// 3. Use modulo operator for divisibility
```

---

### Q7: Single Number
**Problem:** Array where every element appears twice except one. Find that single one.

```java
public int singleNumber(int[] nums) {
    int result = 0;
    
    for (int num : nums) {
        result ^= num;  // XOR operation
    }
    
    return result;
    
    // Logic: XOR properties
    // a ^ a = 0
    // a ^ 0 = a
    // XOR is commutative and associative
    // All pairs cancel out, single remains
}
```

**Test Cases:**
```java
singleNumber([2,2,1])       → 1
singleNumber([4,1,2,1,2])   → 4
singleNumber([1])           → 1
```

---

### Q8: Sum of Digits
**Problem:** Find sum of all digits in a number

```java
public int sumOfDigits(int n) {
    n = Math.abs(n);  // Handle negative numbers
    int sum = 0;
    
    while (n > 0) {
        sum += n % 10;  // Add last digit
        n = n / 10;     // Remove last digit
    }
    
    return sum;
}

// Recursive approach
public int sumOfDigitsRecursive(int n) {
    if (n == 0) return 0;
    return (n % 10) + sumOfDigitsRecursive(n / 10);
}
```

**Test Cases:**
```java
sumOfDigits(123)   → 6
sumOfDigits(9875)  → 29
sumOfDigits(0)     → 0
```

---

### Q9: Check if Number is Prime
**Problem:** Determine if a number is prime

```java
public boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    
    // Check divisibility by 2 and 3
    if (n % 2 == 0 || n % 3 == 0) return false;
    
    // Check for divisors up to √n
    // All primes > 3 are of form 6k ± 1
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    
    return true;
}

// Logic:
// 1. Handle base cases (0, 1, 2, 3)
// 2. Check divisibility by 2 and 3
// 3. Check only numbers of form 6k±1 up to √n
// 4. This optimizes from O(n) to O(√n)
```

---

### Q10: Swap Two Numbers
**Problem:** Swap without using temporary variable

```java
// Method 1: Using arithmetic
public void swapArithmetic(int a, int b) {
    System.out.println("Before: a=" + a + ", b=" + b);
    
    a = a + b;
    b = a - b;  // b = (a+b) - b = a
    a = a - b;  // a = (a+b) - a = b
    
    System.out.println("After: a=" + a + ", b=" + b);
}

// Method 2: Using XOR (best for integers)
public void swapXOR(int a, int b) {
    System.out.println("Before: a=" + a + ", b=" + b);
    
    a = a ^ b;
    b = a ^ b;  // b = (a^b) ^ b = a
    a = a ^ b;  // a = (a^b) ^ a = b
    
    System.out.println("After: a=" + a + ", b=" + b);
    
    // Logic: XOR properties
    // x ^ x = 0
    // x ^ 0 = x
}

// Method 3: Single line XOR
public void swapSingleLine(int a, int b) {
    a = a ^ b ^ (b = a);
}
```

---

## Quick Reference Table

| Operation | Code | Use Case |
|-----------|------|----------|
| Get last digit | `n % 10` | Reverse number, digit sum |
| Remove last digit | `n / 10` | Process digits |
| Check even | `n % 2 == 0` | Parity checks |
| Check power of 2 | `(n & (n-1)) == 0` | Bit manipulation |
| Get middle | `l + (r-l)/2` | Binary search |
| Swap values | `a ^= b ^= a ^= b` | In-place swap |
| Count set bits | `n & (n-1)` | Hamming weight |
| Character to index | `ch - 'a'` | Frequency arrays |

---

## Common Pitfalls & Tips

1. **Integer Overflow**: Use `long` for large products
2. **Division by Zero**: Always check divisor != 0
3. **Array Bounds**: Use `i < arr.length`, not `<=`
4. **Infinite Loops**: Ensure loop variables are updated
5. **Post vs Pre Increment**: Understand `i++` vs `++i`
6. **Integer Division**: `5/2 = 2` (not 2.5)
7. **Modulo with Negative**: Result can be negative in Java
8. **Comparison**: Use `==` for primitives, `.equals()` for objects

---
