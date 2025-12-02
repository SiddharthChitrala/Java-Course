# Additional Java DSA Coding Problems

## More Practice Problems with Solutions

---

### Q11: Armstrong Number (Narcissistic Number)
**Problem:** Check if a number equals the sum of its digits raised to the power of number of digits

```java
public boolean isArmstrong(int n) {
    int original = n;
    int sum = 0;
    int digits = String.valueOf(n).length();
    
    while (n > 0) {
        int digit = n % 10;
        sum += Math.pow(digit, digits);
        n = n / 10;
    }
    
    return sum == original;
}

// Without using String length
public boolean isArmstrongOptimized(int n) {
    int original = n;
    int sum = 0;
    int temp = n;
    
    // Count digits
    int digits = 0;
    while (temp > 0) {
        digits++;
        temp = temp / 10;
    }
    
    // Calculate sum
    while (n > 0) {
        int digit = n % 10;
        sum += Math.pow(digit, digits);
        n = n / 10;
    }
    
    return sum == original;
}

// Logic:
// 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✓
// 9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474 ✓
```

**Test Cases:**
```java
isArmstrong(153)   → true  (1³ + 5³ + 3³)
isArmstrong(9474)  → true  (9⁴ + 4⁴ + 7⁴ + 4⁴)
isArmstrong(123)   → false
isArmstrong(1)     → true  (1¹)
```

---

### Q12: Factorial
**Problem:** Calculate factorial of a number

```java
// Iterative approach
public long factorial(int n) {
    if (n < 0) return -1;  // Factorial not defined for negative
    
    long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

// Recursive approach
public long factorialRecursive(int n) {
    if (n < 0) return -1;
    if (n == 0 || n == 1) return 1;
    
    return n * factorialRecursive(n - 1);
}

// Tail recursive (optimized)
public long factorialTailRecursive(int n) {
    return factorialHelper(n, 1);
}

private long factorialHelper(int n, long accumulator) {
    if (n <= 1) return accumulator;
    return factorialHelper(n - 1, n * accumulator);
}

// Logic:
// 5! = 5 × 4 × 3 × 2 × 1 = 120
// Use long to handle larger results
```

**Test Cases:**
```java
factorial(5)  → 120
factorial(0)  → 1
factorial(10) → 3628800
factorial(20) → 2432902008176640000
```

---

### Q13: Fibonacci Number
**Problem:** Find nth Fibonacci number (0, 1, 1, 2, 3, 5, 8, 13...)

```java
// Iterative approach (Best for DSA)
public int fibonacci(int n) {
    if (n <= 1) return n;
    
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}

// Space optimized
public int fibOptimized(int n) {
    if (n <= 1) return n;
    
    int prev2 = 0, prev1 = 1;
    for (int i = 2; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
}

// Recursive (not recommended - exponential time)
public int fibRecursive(int n) {
    if (n <= 1) return n;
    return fibRecursive(n - 1) + fibRecursive(n - 2);
}

// Recursive with memoization (DP approach)
public int fibMemo(int n) {
    int[] memo = new int[n + 1];
    return fibHelper(n, memo);
}

private int fibHelper(int n, int[] memo) {
    if (n <= 1) return n;
    if (memo[n] != 0) return memo[n];
    
    memo[n] = fibHelper(n - 1, memo) + fibHelper(n - 2, memo);
    return memo[n];
}

// Logic:
// F(0) = 0, F(1) = 1
// F(n) = F(n-1) + F(n-2)
```

**Test Cases:**
```java
fibonacci(0)  → 0
fibonacci(1)  → 1
fibonacci(5)  → 5
fibonacci(10) → 55
```

---

### Q14: GCD (Greatest Common Divisor)
**Problem:** Find GCD of two numbers using Euclidean algorithm

```java
// Iterative Euclidean algorithm
public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Recursive approach
public int gcdRecursive(int a, int b) {
    if (b == 0) return a;
    return gcdRecursive(b, a % b);
}

// One-liner
public int gcdOneLiner(int a, int b) {
    return b == 0 ? a : gcdOneLiner(b, a % b);
}

// LCM using GCD
public int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}

// Logic:
// gcd(48, 18):
// 48 % 18 = 12
// 18 % 12 = 6
// 12 % 6 = 0
// Answer: 6
```

**Test Cases:**
```java
gcd(48, 18)  → 6
gcd(100, 50) → 50
gcd(17, 19)  → 1 (coprime)
gcd(0, 5)    → 5
```

---

### Q15: Check Perfect Number
**Problem:** Number equals sum of its proper divisors (excluding itself)

```java
public boolean isPerfectNumber(int num) {
    if (num <= 1) return false;
    
    int sum = 1;  // 1 is always a divisor
    
    // Check divisors up to √num
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            sum += i;
            // Add the corresponding divisor if different
            if (i != num / i) {
                sum += num / i;
            }
        }
    }
    
    return sum == num;
}

// Brute force approach
public boolean isPerfectNumberBrute(int num) {
    if (num <= 1) return false;
    
    int sum = 0;
    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    
    return sum == num;
}

// Logic:
// 6 = 1 + 2 + 3 ✓
// 28 = 1 + 2 + 4 + 7 + 14 ✓
```

**Test Cases:**
```java
isPerfectNumber(6)    → true  (1 + 2 + 3)
isPerfectNumber(28)   → true  (1 + 2 + 4 + 7 + 14)
isPerfectNumber(496)  → true
isPerfectNumber(12)   → false
```

---

### Q16: Count Digits in a Number
**Problem:** Count total digits in a number

```java
// Method 1: Using loop
public int countDigits(int n) {
    if (n == 0) return 1;
    
    n = Math.abs(n);  // Handle negative numbers
    int count = 0;
    
    while (n > 0) {
        count++;
        n = n / 10;
    }
    
    return count;
}

// Method 2: Using logarithm (fastest)
public int countDigitsLog(int n) {
    if (n == 0) return 1;
    return (int) Math.log10(Math.abs(n)) + 1;
}

// Method 3: Using String conversion
public int countDigitsString(int n) {
    return String.valueOf(Math.abs(n)).length();
}

// Count specific digit occurrences
public int countDigitOccurrences(int num, int digit) {
    num = Math.abs(num);
    int count = 0;
    
    while (num > 0) {
        if (num % 10 == digit) {
            count++;
        }
        num = num / 10;
    }
    
    return count;
}

// Logic:
// Each division by 10 removes one digit
// log₁₀(n) + 1 gives digit count
```

**Test Cases:**
```java
countDigits(12345)  → 5
countDigits(0)      → 1
countDigits(-999)   → 3
countDigitOccurrences(122333, 3) → 3
```

---

### Q17: Reverse Bits
**Problem:** Reverse bits of a 32-bit unsigned integer

```java
public int reverseBits(int n) {
    int result = 0;
    
    for (int i = 0; i < 32; i++) {
        // Extract last bit
        int bit = n & 1;
        
        // Shift result left and add the bit
        result = (result << 1) | bit;
        
        // Shift n right
        n >>>= 1;
    }
    
    return result;
}

// Alternative approach
public int reverseBitsAlt(int n) {
    int result = 0;
    
    for (int i = 0; i < 32; i++) {
        result <<= 1;           // Make space for next bit
        result |= (n & 1);      // Add last bit of n
        n >>>= 1;               // Remove last bit from n
    }
    
    return result;
}

// Logic:
// Input:  00000010100101000001111010011100
// Output: 00111001011110000010100101000000
// Process each bit from right to left
// Build result from left to right
```

**Test Cases:**
```java
reverseBits(43261596)  → 964176192
reverseBits(4294967293) → 3221225471
```

---

### Q18: Add Digits (Digital Root)
**Problem:** Add all digits until you get a single digit

```java
// Iterative approach
public int addDigits(int num) {
    while (num >= 10) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        num = sum;
    }
    return num;
}

// Mathematical approach (O(1))
public int addDigitsMath(int num) {
    if (num == 0) return 0;
    return 1 + (num - 1) % 9;
}

// Alternative O(1) approach
public int addDigitsOptimized(int num) {
    return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
}

// Logic:
// 38 → 3 + 8 = 11 → 1 + 1 = 2
// Pattern: For any number, digital root = 1 + (num - 1) % 9
// This is based on number theory (casting out nines)
```

**Test Cases:**
```java
addDigits(38)   → 2  (3 + 8 = 11, 1 + 1 = 2)
addDigits(0)    → 0
addDigits(9)    → 9
addDigits(10)   → 1
```

---

### Q19: Happy Number
**Problem:** Number is happy if repeatedly summing squares of digits eventually reaches 1

```java
public boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();
    
    while (n != 1 && !seen.contains(n)) {
        seen.add(n);
        n = getSumOfSquares(n);
    }
    
    return n == 1;
}

private int getSumOfSquares(int n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n = n / 10;
    }
    return sum;
}

// Floyd's Cycle Detection (Space optimized)
public boolean isHappyOptimized(int n) {
    int slow = n;
    int fast = n;
    
    do {
        slow = getSumOfSquares(slow);
        fast = getSumOfSquares(getSumOfSquares(fast));
    } while (slow != fast);
    
    return slow == 1;
}

// Logic:
// 19 → 1² + 9² = 82
// 82 → 8² + 2² = 68
// 68 → 6² + 8² = 100
// 100 → 1² + 0² + 0² = 1 ✓
```

**Test Cases:**
```java
isHappy(19)  → true
isHappy(2)   → false
isHappy(1)   → true
isHappy(7)   → true
```

---

### Q20: Ugly Number
**Problem:** Check if a number's prime factors are only 2, 3, and 5

```java
public boolean isUgly(int n) {
    if (n <= 0) return false;
    
    // Divide by 2, 3, and 5 as much as possible
    while (n % 2 == 0) n = n / 2;
    while (n % 3 == 0) n = n / 3;
    while (n % 5 == 0) n = n / 5;
    
    // If n becomes 1, it's ugly
    return n == 1;
}

// Alternative with array
public boolean isUglyAlt(int n) {
    if (n <= 0) return false;
    
    int[] factors = {2, 3, 5};
    for (int factor : factors) {
        while (n % factor == 0) {
            n = n / factor;
        }
    }
    
    return n == 1;
}

// Logic:
// 6 = 2 × 3 → ugly ✓
// 8 = 2³ → ugly ✓
// 14 = 2 × 7 → not ugly (has factor 7) ✗
```

**Test Cases:**
```java
isUgly(6)   → true  (2 × 3)
isUgly(1)   → true  (convention)
isUgly(14)  → false (2 × 7)
isUgly(0)   → false
```

---

### Q21: Excel Column Number
**Problem:** Convert Excel column title to number (A=1, B=2, ..., Z=26, AA=27)

```java
public int titleToNumber(String columnTitle) {
    int result = 0;
    
    for (char c : columnTitle.toCharArray()) {
        int value = c - 'A' + 1;  // A=1, B=2, ..., Z=26
        result = result * 26 + value;
    }
    
    return result;
}

// Reverse: Number to Excel column
public String convertToTitle(int columnNumber) {
    StringBuilder result = new StringBuilder();
    
    while (columnNumber > 0) {
        columnNumber--;  // Adjust for 0-indexing
        int remainder = columnNumber % 26;
        result.append((char)('A' + remainder));
        columnNumber = columnNumber / 26;
    }
    
    return result.reverse().toString();
}

// Logic:
// Similar to base-26 conversion
// AB = 1×26 + 2 = 28
// ZY = 26×26 + 25 = 701
```

**Test Cases:**
```java
titleToNumber("A")   → 1
titleToNumber("AB")  → 28
titleToNumber("ZY")  → 701
titleToNumber("FXSHRXW") → 2147483647

convertToTitle(1)    → "A"
convertToTitle(28)   → "AB"
convertToTitle(701)  → "ZY"
```

---

### Q22: Trailing Zeros in Factorial
**Problem:** Count trailing zeros in n! without calculating factorial

```java
public int trailingZeroes(int n) {
    int count = 0;
    
    // Count factors of 5 in n!
    while (n >= 5) {
        n = n / 5;
        count += n;
    }
    
    return count;
}

// Recursive approach
public int trailingZeroesRecursive(int n) {
    if (n < 5) return 0;
    return n / 5 + trailingZeroesRecursive(n / 5);
}

// Logic:
// Trailing zeros = pairs of (2 × 5)
// Factors of 2 are always more than factors of 5
// So count factors of 5 in n!
// 
// For 25!:
// 25/5 = 5 (numbers divisible by 5: 5,10,15,20,25)
// 25/25 = 1 (25 has extra 5)
// Total = 5 + 1 = 6 trailing zeros
```

**Test Cases:**
```java
trailingZeroes(5)   → 1  (5! = 120)
trailingZeroes(10)  → 2  (10! = 3628800)
trailingZeroes(25)  → 6
trailingZeroes(100) → 24
```

---

### Q23: Sqrt(x) - Integer Square Root
**Problem:** Find integer square root without using built-in functions

```java
// Binary search approach
public int mySqrt(int x) {
    if (x == 0 || x == 1) return x;
    
    int left = 1, right = x;
    int result = 0;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        // Use division to avoid overflow
        if (mid <= x / mid) {
            result = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}

// Newton's method (faster)
public int mySqrtNewton(int x) {
    if (x == 0) return 0;
    
    long r = x;
    while (r * r > x) {
        r = (r + x / r) / 2;
    }
    
    return (int) r;
}

// Logic:
// Binary search between 1 and x
// Check if mid² ≤ x
// Use division to prevent integer overflow
```

**Test Cases:**
```java
mySqrt(4)   → 2
mySqrt(8)   → 2  (floor of 2.828)
mySqrt(0)   → 0
mySqrt(1)   → 1
mySqrt(100) → 10
```

---

### Q24: Power(x, n)
**Problem:** Calculate x raised to power n efficiently

```java
// Iterative approach - Exponentiation by squaring
public double myPow(double x, int n) {
    long N = n;  // Handle Integer.MIN_VALUE
    if (N < 0) {
        x = 1 / x;
        N = -N;
    }
    
    double result = 1;
    double currentProduct = x;
    
    while (N > 0) {
        if (N % 2 == 1) {
            result *= currentProduct;
        }
        currentProduct *= currentProduct;
        N = N / 2;
    }
    
    return result;
}

// Recursive approach
public double myPowRecursive(double x, int n) {
    long N = n;
    if (N < 0) {
        x = 1 / x;
        N = -N;
    }
    return fastPow(x, N);
}

private double fastPow(double x, long n) {
    if (n == 0) return 1.0;
    
    double half = fastPow(x, n / 2);
    
    if (n % 2 == 0) {
        return half * half;
    } else {
        return half * half * x;
    }
}

// Logic:
// x^8 = (x^4)² = ((x²)²)²
// Time: O(log n) instead of O(n)
// 
// Example: 2^10
// 2^10 = (2^5)²
// 2^5 = (2^2)² × 2
// 2^2 = (2^1)²
// 2^1 = 2
```

**Test Cases:**
```java
myPow(2.0, 10)  → 1024.0
myPow(2.1, 3)   → 9.261
myPow(2.0, -2)  → 0.25
myPow(1.0, 2147483647) → 1.0
```

---

### Q25: Convert Decimal to Binary
**Problem:** Convert decimal number to binary string

```java
// Method 1: Using loop
public String decimalToBinary(int n) {
    if (n == 0) return "0";
    
    StringBuilder binary = new StringBuilder();
    
    while (n > 0) {
        binary.append(n % 2);
        n = n / 2;
    }
    
    return binary.reverse().toString();
}

// Method 2: Using built-in
public String decimalToBinaryBuiltIn(int n) {
    return Integer.toBinaryString(n);
}

// Method 3: Recursive
public String decimalToBinaryRecursive(int n) {
    if (n == 0) return "";
    return decimalToBinaryRecursive(n / 2) + (n % 2);
}

// Binary to Decimal
public int binaryToDecimal(String binary) {
    int decimal = 0;
    int power = 0;
    
    for (int i = binary.length() - 1; i >= 0; i--) {
        if (binary.charAt(i) == '1') {
            decimal += Math.pow(2, power);
        }
        power++;
    }
    
    return decimal;
}

// Using built-in
public int binaryToDecimalBuiltIn(String binary) {
    return Integer.parseInt(binary, 2);
}

// Logic:
// 13 in binary:
// 13 / 2 = 6 remainder 1
// 6 / 2 = 3 remainder 0
// 3 / 2 = 1 remainder 1
// 1 / 2 = 0 remainder 1
// Read remainders bottom-up: 1101
```

**Test Cases:**
```java
decimalToBinary(13)  → "1101"
decimalToBinary(0)   → "0"
decimalToBinary(255) → "11111111"

binaryToDecimal("1101") → 13
binaryToDecimal("0")    → 0
```

---

### Q26: Sum of Two Integers Without +/- Operators
**Problem:** Add two integers using bitwise operations only

```java
public int getSum(int a, int b) {
    while (b != 0) {
        // Calculate carry
        int carry = (a & b) << 1;
        
        // Sum without carry
        a = a ^ b;
        
        // Assign carry to b
        b = carry;
    }
    
    return a;
}

// Recursive approach
public int getSumRecursive(int a, int b) {
    if (b == 0) return a;
    
    int sum = a ^ b;
    int carry = (a & b) << 1;
    
    return getSumRecursive(sum, carry);
}

// Logic:
// XOR gives sum without carry
// AND gives carry positions
// Shift carry left by 1
// 
// Example: 5 + 3
// 5 = 101, 3 = 011
// XOR: 110 (sum without carry)
// AND: 001, shift left: 010 (carry)
// Continue: 110 + 010 = 1000 = 8
```

**Test Cases:**
```java
getSum(1, 2)   → 3
getSum(-1, 1)  → 0
getSum(5, 3)   → 8
getSum(0, 0)   → 0
```

---

### Q27: Roman to Integer
**Problem:** Convert Roman numeral to integer

```java
public int romanToInt(String s) {
    Map<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);
    
    int result = 0;
    
    for (int i = 0; i < s.length(); i++) {
        int current = romanMap.get(s.charAt(i));
        
        // Check if next character exists and is greater
        if (i + 1 < s.length() && 
            romanMap.get(s.charAt(i + 1)) > current) {
            result -= current;  // Subtract for cases like IV, IX
        } else {
            result += current;
        }
    }
    
    return result;
}

// Optimized with switch
public int romanToIntOptimized(String s) {
    int result = 0;
    int prevValue = 0;
    
    for (int i = s.length() - 1; i >= 0; i--) {
        int currentValue = getValue(s.charAt(i));
        
        if (currentValue < prevValue) {
            result -= currentValue;
        } else {
            result += currentValue;
        }
        
        prevValue = currentValue;
    }
    
    return result;
}

private int getValue(char c) {
    switch(c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}

// Logic:
// If smaller value before larger, subtract it (IV = 4)
// Otherwise add (VI = 6)
```

**Test Cases:**
```java
romanToInt("III")     → 3
romanToInt("IV")      → 4
romanToInt("IX")      → 9
romanToInt("LVIII")   → 58  (L=50, V=5, III=3)
romanToInt("MCMXCIV") → 1994 (M=1000, CM=900, XC=90, IV=4)
```

---

### Q28: Valid Perfect Square
**Problem:** Check if a number is perfect square without sqrt function

```java
// Binary search approach
public boolean isPerfectSquare(int num) {
    if (num < 2) return true;
    
    long left = 2, right = num / 2;
    
    while (left <= right) {
        long mid = left + (right - left) / 2;
        long square = mid * mid;
        
        if (square == num) {
            return true;
        } else if (square < num) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return false;
}

// Mathematical approach (odd numbers sum)
public boolean isPerfectSquareMath(int num) {
    int i = 1;
    while (num > 0) {
        num -= i;
        i += 2;
    }
    return num == 0;
}

// Newton's method
public boolean isPerfectSquareNewton(int num) {
    if (num < 2) return true;
    
    long x = num / 2;
    while (x * x > num) {
        x = (x + num / x) / 2;
    }
    
    return x * x == num;
}

// Logic:
// 1 = 1
// 4 = 1 + 3
// 9 = 1 + 3 + 5
// 16 = 1 + 3 + 5 + 7
// Perfect squares are sum of consecutive odd numbers
```

**Test Cases:**
```java
isPerfectSquare(16)  → true
isPerfectSquare(14)  → false
isPerfectSquare(1)   → true
isPerfectSquare(100) → true
```

---

### Q29: Multiply Strings
**Problem:** Multiply two numbers represented as strings

```java
public String multiply(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) return "0";
    
    int m = num1.length(), n = num2.length();
    int[] result = new int[m + n];
    
    // Multiply each digit
    for (int i = m - 1; i >= 0; i--) {
        for (int j = n - 1; j >= 0; j--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(j) - '0';
            
            int product = digit1 * digit2;
            int p1 = i + j;
            int p2 = i + j + 1;
            
            int sum = product + result[p2];
            result[p2] = sum % 10;
            result[p1] += sum / 10;
        }
    }
    
    // Convert to string
    StringBuilder sb = new StringBuilder();
    for (int num : result) {
        if (!(sb.length() == 0 && num == 0)) {
            sb.append(num);
        }
    }
    
    return sb.toString();
}

// Logic:
// Simulate manual multiplication
// Store intermediate results in array
// Handle carries properly
```

**Test Cases:**
```java
multiply("2", "3")     → "6"
multiply("123", "456") → "56088"
multiply("0", "999")   → "0"
```

---

### Q30: Divide Two Integers
**Problem:** Divide without using multiplication, division, or mod operator

```java
public int divide(int dividend, int divisor) {
    // Handle overflow case
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }
    
    // Determine sign
    boolean negative = (dividend < 0) ^ (divisor < 0);
    
    // Work with positive values
    long absDividend = Math.abs((long) dividend);
    long absDivisor = Math.abs((long) divisor);
    
    int result = 0;
    
    // Subtract divisor repeatedly using bit shifting
    while (absDividend >= absDivisor) {
        long temp = absDivisor;
        int multiple = 1;
        
        // Find largest multiple of divisor that fits
        while (absDividend >= (temp << 1)) {
            temp <<= 1;
            multiple <<= 1;
        }
        
        absDividend -= temp;
        result += multiple;
    }
    
    return negative ? -result : result;
}

// Logic:
// Use bit shifting to speed up subtraction
// 15 / 3:
// 15 - (3 << 2) = 15 - 12 = 3, quotient += 4
// 3 - 3 = 0, quotient += 1
// Result: 5
```

**Test Cases:**
```java
divide(10, 3)  → 3
divide(7, -3)  → -2
divide(-2147483648, -1) → 2147483647 (overflow handled)
divide(1, 1)   → 1
```

---

## Practice Strategy

### By Difficulty Level:

**Easy (Start Here):**
- Q11: Armstrong Number
- Q12: Factorial
- Q16: Count Digits
- Q18: Add Digits
- Q21: Excel Column Number

**Medium:**
- Q13: Fibonacci
- Q14: GCD
- Q19: Happy Number
- Q23: Sqrt(x)
- Q27: Roman to Integer

**Hard:**
- Q24: Power(x, n)
- Q26: Sum Without Operators
- Q29: Multiply Strings
- Q30: Divide Two Integers

### Practice Tips:
1. **Start with pen and paper** - Work through examples manually
2. **Identify the pattern** - Most problems have mathematical properties
3. **Consider edge cases** - Zero, negative numbers, overflow
4. **Optimize progressively** - Brute force → Better logic → Optimal
5. **Time yourself** - Aim for 15-20 minutes per problem

---