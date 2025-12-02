# Java Solutions with Loops for DSA Logic Building

## **Section 1: Loop Fundamentals**

### **Question 1: Print Patterns using Loops**
```java
import java.util.Scanner;

public class LoopPatterns {
    
    public static void pattern1(int n) {
        System.out.println("\nPattern 1: Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern2(int n) {
        System.out.println("\nPattern 2: Inverted Right Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n) {
        System.out.println("\nPattern 3: Pyramid");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern4(int n) {
        System.out.println("\nPattern 4: Diamond");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern5(int n) {
        System.out.println("\nPattern 5: Number Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void pattern6(int n) {
        System.out.println("\nPattern 6: Floyd's Triangle");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
    public static void pattern7(int n) {
        System.out.println("\nPattern 7: Pascal's Triangle");
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        
        sc.close();
    }
}
```

### **Question 2: Multiplication Table Generator**
```java
import java.util.Scanner;

public class MultiplicationTable {
    
    public static void singleTable(int num) {
        System.out.println("\nMultiplication Table for " + num + ":");
        System.out.println("=========================");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d × %2d = %3d\n", num, i, num * i);
        }
    }
    
    public static void rangeTables(int start, int end) {
        System.out.println("\nTables from " + start + " to " + end + ":");
        System.out.println("=========================");
        
        for (int num = start; num <= end; num++) {
            System.out.println("\nTable for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d × %2d = %3d\n", num, i, num * i);
            }
        }
    }
    
    public static void customRangeTables(int start, int end, int multiplierLimit) {
        System.out.printf("\nTables from %d to %d (up to %d):\n", start, end, multiplierLimit);
        System.out.println("=========================");
        
        // Using nested for loops
        for (int num = start; num <= end; num++) {
            System.out.printf("\nTable for %2d: ", num);
            for (int i = 1; i <= multiplierLimit; i++) {
                System.out.printf("%4d ", num * i);
            }
            System.out.println();
        }
    }
    
    public static void tableInMatrixForm(int n) {
        System.out.println("\nMultiplication Matrix (1 to " + n + "):");
        System.out.println("=========================");
        
        // Print header row
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n    " + "----".repeat(n));
        
        // Print table
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== MULTIPLICATION TABLE GENERATOR ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Single table");
            System.out.println("2. Range of tables");
            System.out.println("3. Custom range tables");
            System.out.println("4. Matrix form");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    singleTable(num);
                    break;
                    
                case 2:
                    System.out.print("Enter start number: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end number: ");
                    int end = sc.nextInt();
                    rangeTables(start, end);
                    break;
                    
                case 3:
                    System.out.print("Enter start number: ");
                    start = sc.nextInt();
                    System.out.print("Enter end number: ");
                    end = sc.nextInt();
                    System.out.print("Enter multiplier limit: ");
                    int limit = sc.nextInt();
                    customRangeTables(start, end, limit);
                    break;
                    
                case 4:
                    System.out.print("Enter size of matrix (n x n): ");
                    int size = sc.nextInt();
                    tableInMatrixForm(size);
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

### **Question 3: Sum and Average Calculator with Loops**
```java
import java.util.Scanner;

public class SumAndAverage {
    
    public static void sumOfNNumbers() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }
        
        double sum = 0;
        System.out.println("Enter " + n + " numbers:");
        
        // Using for loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }
        
        double average = sum / n;
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
    }
    
    public static void sumUntilNegative() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers (enter a negative number to stop):");
        
        double sum = 0;
        int count = 0;
        double num;
        
        // Using while loop
        while (true) {
            System.out.print("Enter number: ");
            num = sc.nextDouble();
            
            if (num < 0) {
                break;
            }
            
            sum += num;
            count++;
        }
        
        if (count > 0) {
            double average = sum / count;
            System.out.println("\nResults:");
            System.out.println("Total numbers entered: " + count);
            System.out.println("Sum: " + sum);
            System.out.printf("Average: %.2f\n", average);
        } else {
            System.out.println("No positive numbers entered!");
        }
    }
    
    public static void sumOfEvenOdd() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        // Using for loop
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            } else {
                oddSum += i;
                oddCount++;
            }
        }
        
        System.out.println("\nResults from 1 to " + limit + ":");
        System.out.println("Even numbers:");
        System.out.println("  Count: " + evenCount);
        System.out.println("  Sum: " + evenSum);
        System.out.printf("  Average: %.2f\n", evenCount > 0 ? (double) evenSum / evenCount : 0);
        
        System.out.println("\nOdd numbers:");
        System.out.println("  Count: " + oddCount);
        System.out.println("  Sum: " + oddSum);
        System.out.printf("  Average: %.2f\n", oddCount > 0 ? (double) oddSum / oddCount : 0);
        
        System.out.println("\nTotal sum: " + (evenSum + oddSum));
    }
    
    public static void sumOfDigits() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Handle negative numbers
        int original = num;
        num = Math.abs(num);
        
        int sum = 0;
        int count = 0;
        
        // Using while loop
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            count++;
            num /= 10;
        }
        
        System.out.println("\nResults for " + original + ":");
        System.out.println("Sum of digits: " + sum);
        System.out.println("Number of digits: " + count);
        System.out.printf("Average of digits: %.2f\n", count > 0 ? (double) sum / count : 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SUM AND AVERAGE CALCULATOR ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Sum of N numbers");
            System.out.println("2. Sum until negative number");
            System.out.println("3. Sum of even and odd numbers");
            System.out.println("4. Sum of digits of a number");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    sumOfNNumbers();
                    break;
                    
                case 2:
                    sumUntilNegative();
                    break;
                    
                case 3:
                    sumOfEvenOdd();
                    break;
                    
                case 4:
                    sumOfDigits();
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

## **Section 2: Loop Applications**

### **Question 4: Prime Number Checker**
```java
import java.util.Scanner;

public class PrimeNumberChecker {
    
    // Method 1: Basic prime check
    public static boolean isPrimeBasic(int n) {
        if (n <= 1) return false;
        
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method 2: Optimized prime check
    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Find all primes up to n
    public static void findPrimesUpTo(int n) {
        System.out.println("\nPrime numbers up to " + n + ":");
        
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimeOptimized(i)) {
                System.out.print(i + " ");
                count++;
                
                // Print 10 numbers per line
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        System.out.println("\n\nTotal prime numbers: " + count);
    }
    
    // Find twin primes (primes with difference 2)
    public static void findTwinPrimes(int limit) {
        System.out.println("\nTwin primes up to " + limit + ":");
        
        int count = 0;
        int prevPrime = 2;
        
        for (int i = 3; i <= limit; i++) {
            if (isPrimeOptimized(i)) {
                if (i - prevPrime == 2) {
                    System.out.printf("(%d, %d) ", prevPrime, i);
                    count++;
                    
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
                prevPrime = i;
            }
        }
        
        System.out.println("\n\nTotal twin prime pairs: " + count);
    }
    
    // Find prime factors of a number
    public static void findPrimeFactors(int n) {
        System.out.print("\nPrime factors of " + n + ": ");
        
        int original = n;
        
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }
        
        // n must be odd at this point
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If n is still greater than 2, it's a prime factor
        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }
    
    // Check if a number is prime using Sieve of Eratosthenes
    public static void sieveOfEratosthenes(int n) {
        System.out.println("\nPrime numbers up to " + n + " (using Sieve of Eratosthenes):");
        
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
                
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        System.out.println("\n\nTotal prime numbers: " + count);
    }
    
    // Goldbach's conjecture: Every even number > 2 can be expressed as sum of two primes
    public static void goldbachConjecture(int n) {
        if (n <= 2 || n % 2 != 0) {
            System.out.println("Please enter an even number greater than 2!");
            return;
        }
        
        System.out.println("\nGoldbach representations for " + n + ":");
        
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (isPrimeOptimized(i) && isPrimeOptimized(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                count++;
            }
        }
        
        System.out.println("Total representations: " + count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== PRIME NUMBER CHECKER ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Check if a number is prime");
            System.out.println("2. Find all primes up to N");
            System.out.println("3. Find twin primes");
            System.out.println("4. Find prime factors");
            System.out.println("5. Sieve of Eratosthenes");
            System.out.println("6. Goldbach Conjecture");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    
                    System.out.println("\nUsing basic method:");
                    System.out.println(num + " is " + (isPrimeBasic(num) ? "PRIME" : "NOT PRIME"));
                    
                    System.out.println("\nUsing optimized method:");
                    System.out.println(num + " is " + (isPrimeOptimized(num) ? "PRIME" : "NOT PRIME"));
                    break;
                    
                case 2:
                    System.out.print("Enter the limit: ");
                    int limit = sc.nextInt();
                    findPrimesUpTo(limit);
                    break;
                    
                case 3:
                    System.out.print("Enter the limit: ");
                    limit = sc.nextInt();
                    findTwinPrimes(limit);
                    break;
                    
                case 4:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    findPrimeFactors(num);
                    break;
                    
                case 5:
                    System.out.print("Enter the limit: ");
                    limit = sc.nextInt();
                    sieveOfEratosthenes(limit);
                    break;
                    
                case 6:
                    System.out.print("Enter an even number (>2): ");
                    num = sc.nextInt();
                    goldbachConjecture(num);
                    break;
                    
                case 7:
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

### **Question 5: Fibonacci Series Generator**
```java
import java.util.Scanner;

public class FibonacciSeries {
    
    // Generate Fibonacci series up to n terms
    public static void fibonacciNTerms(int n) {
        System.out.println("\nFibonacci Series (first " + n + " terms):");
        
        if (n <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }
        
        if (n >= 1) System.out.print("0 ");
        if (n >= 2) System.out.print("1 ");
        
        long a = 0, b = 1;
        
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            
            // Print 10 numbers per line
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    // Generate Fibonacci series up to a limit
    public static void fibonacciUpToLimit(int limit) {
        System.out.println("\nFibonacci Series up to " + limit + ":");
        
        if (limit < 0) {
            System.out.println("Please enter a non-negative number!");
            return;
        }
        
        long a = 0, b = 1;
        int count = 0;
        
        if (a <= limit) {
            System.out.print(a + " ");
            count++;
        }
        
        while (b <= limit) {
            System.out.print(b + " ");
            count++;
            
            if (count % 10 == 0) {
                System.out.println();
            }
            
            long next = a + b;
            a = b;
            b = next;
        }
        
        System.out.println("\n\nTotal numbers: " + count);
    }
    
    // Find nth Fibonacci number using recursion
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    // Find nth Fibonacci number using memoization
    public static long fibonacciMemo(int n, long[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }
    
    // Check if a number is Fibonacci
    public static boolean isFibonacci(long num) {
        if (num < 0) return false;
        if (num == 0 || num == 1) return true;
        
        long a = 0, b = 1;
        while (b < num) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b == num;
    }
    
    // Print Fibonacci in reverse order
    public static void fibonacciReverse(int n) {
        System.out.println("\nFibonacci Series in reverse (first " + n + " terms):");
        
        long[] fib = new long[n];
        
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        // Print in reverse
        for (int i = n-1; i >= 0; i--) {
            System.out.print(fib[i] + " ");
            if ((n - i) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    // Generate Fibonacci series with different starting numbers
    public static void customFibonacci(int a, int b, int n) {
        System.out.printf("\nCustom Fibonacci (starting with %d, %d) - first %d terms:\n", a, b, n);
        
        System.out.print(a + " " + b + " ");
        
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    // Find sum of Fibonacci numbers
    public static void fibonacciSum(int n) {
        System.out.println("\nSum of first " + n + " Fibonacci numbers:");
        
        if (n <= 0) {
            System.out.println("Sum: 0");
            return;
        }
        
        long a = 0, b = 1;
        long sum = a;
        if (n >= 1) sum = a;
        if (n >= 2) sum += b;
        
        System.out.print("0");
        if (n >= 2) System.out.print(" + 1");
        
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            System.out.print(" + " + c);
            sum += c;
            a = b;
            b = c;
        }
        
        System.out.println(" = " + sum);
        
        // Also print the formula: F(n+2) - 1
        if (n >= 1) {
            long[] memo = new long[n + 3];
            long formulaSum = fibonacciMemo(n + 2, memo) - 1;
            System.out.println("Using formula F(n+2)-1: " + formulaSum);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== FIBONACCI SERIES GENERATOR ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Generate N terms");
            System.out.println("2. Generate up to a limit");
            System.out.println("3. Check if a number is Fibonacci");
            System.out.println("4. Print in reverse");
            System.out.println("5. Custom starting numbers");
            System.out.println("6. Sum of Fibonacci numbers");
            System.out.println("7. Compare methods (Recursive vs Memoization)");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter number of terms: ");
                    int n = sc.nextInt();
                    fibonacciNTerms(n);
                    break;
                    
                case 2:
                    System.out.print("Enter limit: ");
                    int limit = sc.nextInt();
                    fibonacciUpToLimit(limit);
                    break;
                    
                case 3:
                    System.out.print("Enter a number: ");
                    long num = sc.nextLong();
                    System.out.println(num + " is " + 
                        (isFibonacci(num) ? "a Fibonacci number" : "NOT a Fibonacci number"));
                    break;
                    
                case 4:
                    System.out.print("Enter number of terms: ");
                    n = sc.nextInt();
                    fibonacciReverse(n);
                    break;
                    
                case 5:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.print("Enter number of terms: ");
                    n = sc.nextInt();
                    customFibonacci(a, b, n);
                    break;
                    
                case 6:
                    System.out.print("Enter number of terms: ");
                    n = sc.nextInt();
                    fibonacciSum(n);
                    break;
                    
                case 7:
                    System.out.print("Enter n to find nth Fibonacci number: ");
                    n = sc.nextInt();
                    
                    if (n > 45) {
                        System.out.println("Warning: Recursive method will be slow for n > 45!");
                    }
                    
                    // Using memoization
                    long startTime = System.currentTimeMillis();
                    long[] memo = new long[n + 1];
                    long resultMemo = fibonacciMemo(n, memo);
                    long endTime = System.currentTimeMillis();
                    System.out.println("Memoization: F(" + n + ") = " + resultMemo);
                    System.out.println("Time taken: " + (endTime - startTime) + " ms");
                    
                    // Using recursion (only for small n)
                    if (n <= 45) {
                        startTime = System.currentTimeMillis();
                        long resultRecursive = fibonacciRecursive(n);
                        endTime = System.currentTimeMillis();
                        System.out.println("Recursion: F(" + n + ") = " + resultRecursive);
                        System.out.println("Time taken: " + (endTime - startTime) + " ms");
                    }
                    break;
                    
                case 8:
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

### **Question 6: Factorial Calculator**
```java
import java.util.Scanner;
import java.math.BigInteger;

public class FactorialCalculator {
    
    // Factorial using for loop
    public static long factorialLoop(int n) {
        if (n < 0) return -1; // Error code for negative numbers
        if (n == 0 || n == 1) return 1;
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Factorial using while loop
    public static long factorialWhile(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        
        long result = 1;
        int i = 2;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
    
    // Factorial using recursion
    public static long factorialRecursive(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }
    
    // Factorial using BigInteger for large numbers
    public static BigInteger factorialBig(int n) {
        if (n < 0) return BigInteger.valueOf(-1);
        if (n == 0 || n == 1) return BigInteger.ONE;
        
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    
    // Double factorial (n!!)
    public static long doubleFactorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
    
    // Find trailing zeros in factorial
    public static int trailingZeros(int n) {
        if (n < 0) return -1;
        
        int count = 0;
        // Count factors of 5 (each 5 contributes one trailing zero)
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
    
    // Calculate sum of digits of factorial
    public static int sumOfDigitsOfFactorial(int n) {
        if (n < 0) return -1;
        
        BigInteger fact = factorialBig(n);
        String factStr = fact.toString();
        
        int sum = 0;
        for (int i = 0; i < factStr.length(); i++) {
            sum += factStr.charAt(i) - '0';
        }
        return sum;
    }
    
    // Generate factorial series
    public static void factorialSeries(int n) {
        System.out.println("\nFactorial Series (1! to " + n + "!):");
        System.out.println("=================================");
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d! = ", i);
            
            if (i <= 20) {
                // Use long for i <= 20
                long fact = factorialLoop(i);
                System.out.printf("%,d", fact);
                
                // Show trailing zeros
                int zeros = trailingZeros(i);
                if (zeros > 0) {
                    System.out.printf(" (trailing zeros: %d)", zeros);
                }
            } else {
                // Use BigInteger for i > 20
                BigInteger fact = factorialBig(i);
                int zeros = trailingZeros(i);
                System.out.printf("Big number... (digits: %d, trailing zeros: %d)", 
                    fact.toString().length(), zeros);
            }
            System.out.println();
        }
    }
    
    // Calculate binomial coefficient nCr = n! / (r! * (n-r)!)
    public static long binomialCoefficient(int n, int r) {
        if (n < 0 || r < 0 || r > n) return -1;
        
        // Use property: nCr = nC(n-r)
        if (r > n - r) {
            r = n - r;
        }
        
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }
    
    // Print Pascal's Triangle using binomial coefficients
    public static void pascalsTriangle(int rows) {
        System.out.println("\nPascal's Triangle (first " + rows + " rows):");
        
        for (int n = 0; n < rows; n++) {
            // Print spaces for centering
            for (int i = 0; i < rows - n - 1; i++) {
                System.out.print("  ");
            }
            
            // Print binomial coefficients
            for (int r = 0; r <= n; r++) {
                System.out.printf("%4d", binomialCoefficient(n, r));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== FACTORIAL CALCULATOR ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Calculate factorial");
            System.out.println("2. Double factorial");
            System.out.println("3. Trailing zeros in factorial");
            System.out.println("4. Sum of digits of factorial");
            System.out.println("5. Factorial series");
            System.out.println("6. Binomial coefficient (nCr)");
            System.out.println("7. Pascal's Triangle");
            System.out.println("8. Compare methods");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    
                    if (n < 0) {
                        System.out.println("Factorial is not defined for negative numbers!");
                        break;
                    }
                    
                    System.out.println("\nUsing different methods:");
                    System.out.println("For loop: " + n + "! = " + factorialLoop(n));
                    System.out.println("While loop: " + n + "! = " + factorialWhile(n));
                    System.out.println("Recursion: " + n + "! = " + factorialRecursive(n));
                    
                    if (n > 20) {
                        System.out.println("Note: For n > 20, long overflows. Using BigInteger:");
                        System.out.println("BigInteger: " + n + "! = " + factorialBig(n));
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter a number: ");
                    n = sc.nextInt();
                    System.out.println(n + "!! = " + doubleFactorial(n));
                    break;
                    
                case 3:
                    System.out.print("Enter a number: ");
                    n = sc.nextInt();
                    int zeros = trailingZeros(n);
                    if (zeros >= 0) {
                        System.out.println("Number of trailing zeros in " + n + "! = " + zeros);
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter a number: ");
                    n = sc.nextInt();
                    int sum = sumOfDigitsOfFactorial(n);
                    if (sum >= 0) {
                        System.out.println("Sum of digits of " + n + "! = " + sum);
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter number of terms: ");
                    n = sc.nextInt();
                    factorialSeries(n);
                    break;
                    
                case 6:
                    System.out.print("Enter n: ");
                    int nVal = sc.nextInt();
                    System.out.print("Enter r: ");
                    int r = sc.nextInt();
                    
                    long coeff = binomialCoefficient(nVal, r);
                    if (coeff >= 0) {
                        System.out.println("C(" + nVal + ", " + r + ") = " + coeff);
                    } else {
                        System.out.println("Invalid input! Make sure 0 <= r <= n");
                    }
                    break;
                    
                case 7:
                    System.out.print("Enter number of rows: ");
                    int rows = sc.nextInt();
                    pascalsTriangle(rows);
                    break;
                    
                case 8:
                    System.out.print("Enter a number to compare methods: ");
                    n = sc.nextInt();
                    
                    if (n > 20) {
                        System.out.println("Warning: Long will overflow for n > 20!");
                    }
                    
                    // Measure time for loop
                    long startTime = System.nanoTime();
                    long resultLoop = factorialLoop(n);
                    long endTime = System.nanoTime();
                    System.out.println("For loop: " + resultLoop + 
                        " (Time: " + (endTime - startTime) + " ns)");
                    
                    // Measure time for recursion
                    if (n <= 20) {
                        startTime = System.nanoTime();
                        long resultRec = factorialRecursive(n);
                        endTime = System.nanoTime();
                        System.out.println("Recursion: " + resultRec + 
                            " (Time: " + (endTime - startTime) + " ns)");
                    }
                    
                    // Measure time for BigInteger
                    startTime = System.nanoTime();
                    BigInteger resultBig = factorialBig(n);
                    endTime = System.nanoTime();
                    System.out.println("BigInteger: " + resultBig + 
                        " (Time: " + (endTime - startTime) + " ns)");
                    System.out.println("Digits: " + resultBig.toString().length());
                    break;
                    
                case 9:
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

## **Section 3: Advanced Loop Problems**

### **Question 7: Armstrong Number Checker**
```java
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    
    // Count digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    
    // Check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        if (num < 0) return false;
        
        int original = num;
        int sum = 0;
        int digits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == original;
    }
    
    // Find all Armstrong numbers in a range
    public static void findArmstrongInRange(int start, int end) {
        System.out.println("\nArmstrong numbers between " + start + " and " + end + ":");
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                count++;
                
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        
        if (count == 0) {
            System.out.println("No Armstrong numbers found in this range.");
        } else {
            System.out.println("\n\nTotal Armstrong numbers: " + count);
        }
    }
    
    // Find Armstrong numbers with specific number of digits
    public static void findArmstrongByDigits(int digits) {
        System.out.println("\nArmstrong numbers with " + digits + " digit(s):");
        
        int start = (int) Math.pow(10, digits - 1);
        int end = (int) Math.pow(10, digits) - 1;
        
        // Special case for 1-digit numbers
        if (digits == 1) {
            start = 0;
        }
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                count++;
            }
        }
        
        System.out.println("Total: " + count);
    }
    
    // Check if a number is Narcissistic (same as Armstrong for base 10)
    public static boolean isNarcissistic(int num) {
        return isArmstrong(num);
    }
    
    // Find all Armstrong numbers and display their breakdown
    public static void armstrongWithBreakdown(int limit) {
        System.out.println("\nArmstrong numbers up to " + limit + " with breakdown:");
        System.out.println("=========================================");
        
        for (int i = 0; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " = ");
                
                int temp = i;
                int digits = countDigits(i);
                boolean first = true;
                
                while (temp > 0) {
                    int digit = temp % 10;
                    if (!first) {
                        System.out.print(" + ");
                    }
                    System.out.print(digit + "^" + digits);
                    temp /= 10;
                    first = false;
                }
                System.out.println();
            }
        }
    }
    
    // Check for Perfect Number (sum of proper divisors equals the number)
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
    
    // Check for Strong Number (sum of factorial of digits equals the number)
    public static boolean isStrongNumber(int num) {
        if (num < 0) return false;
        
        int original = num;
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        
        return sum == original;
    }
    
    private static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    // Find all Special numbers in a range
    public static void findSpecialNumbers(int start, int end) {
        System.out.println("\nSpecial numbers between " + start + " and " + end + ":");
        System.out.println("=================================");
        
        System.out.println("\nArmstrong numbers:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nPerfect numbers:");
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nStrong numbers:");
        for (int i = start; i <= end; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SPECIAL NUMBER CHECKER ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Check if a number is Armstrong");
            System.out.println("2. Find Armstrong numbers in range");
            System.out.println("3. Find Armstrong numbers by digits");
            System.out.println("4. Armstrong numbers with breakdown");
            System.out.println("5. Check Perfect number");
            System.out.println("6. Check Strong number");
            System.out.println("7. Find all special numbers in range");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(num + " is " + 
                        (isArmstrong(num) ? "an Armstrong number" : "NOT an Armstrong number"));
                    break;
                    
                case 2:
                    System.out.print("Enter start range: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    int end = sc.nextInt();
                    findArmstrongInRange(start, end);
                    break;
                    
                case 3:
                    System.out.print("Enter number of digits: ");
                    int digits = sc.nextInt();
                    if (digits > 0 && digits <= 10) {
                        findArmstrongByDigits(digits);
                    } else {
                        System.out.println("Please enter digits between 1 and 10");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter limit: ");
                    int limit = sc.nextInt();
                    armstrongWithBreakdown(limit);
                    break;
                    
                case 5:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.println(num + " is " + 
                        (isPerfectNumber(num) ? "a Perfect number" : "NOT a Perfect number"));
                    break;
                    
                case 6:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.println(num + " is " + 
                        (isStrongNumber(num) ? "a Strong number" : "NOT a Strong number"));
                    break;
                    
                case 7:
                    System.out.print("Enter start range: ");
                    start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    end = sc.nextInt();
                    findSpecialNumbers(start, end);
                    break;
                    
                case 8:
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

### **Question 8: Palindrome Checker**
```java
import java.util.Scanner;

public class PalindromeChecker {
    
    // Check if a number is palindrome
    public static boolean isNumberPalindrome(int num) {
        if (num < 0) return false;
        
        int original = num;
        int reverse = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        return original == reverse;
    }
    
    // Check if a string is palindrome
    public static boolean isStringPalindrome(String str) {
        if (str == null) return false;
        
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Find all palindrome numbers in a range
    public static void findPalindromeNumbers(int start, int end) {
        System.out.println("\nPalindrome numbers between " + start + " and " + end + ":");
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isNumberPalindrome(i)) {
                System.out.print(i + " ");
                count++;
                
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        System.out.println("\n\nTotal palindrome numbers: " + count);
    }
    
    // Find palindrome strings in an array
    public static void findPalindromeStrings() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many strings do you want to check? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        String[] strings = new String[n];
        
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }
        
        System.out.println("\nPalindrome strings:");
        int count = 0;
        for (String str : strings) {
            if (isStringPalindrome(str)) {
                System.out.println(str);
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("No palindrome strings found.");
        } else {
            System.out.println("Total palindrome strings: " + count);
        }
    }
    
    // Check if a number is palindrome without converting to string
    public static boolean isPalindromeWithoutString(int num) {
        if (num < 0) return false;
        
        int divisor = 1;
        // Find the divisor to get the first digit
        while (num / divisor >= 10) {
            divisor *= 10;
        }
        
        while (num > 0) {
            int firstDigit = num / divisor;
            int lastDigit = num % 10;
            
            if (firstDigit != lastDigit) {
                return false;
            }
            
            // Remove first and last digits
            num = (num % divisor) / 10;
            divisor /= 100;
        }
        
        return true;
    }
    
    // Find next palindrome number
    public static int nextPalindrome(int num) {
        while (true) {
            num++;
            if (isNumberPalindrome(num)) {
                return num;
            }
        }
    }
    
    // Find previous palindrome number
    public static int previousPalindrome(int num) {
        while (num > 0) {
            num--;
            if (isNumberPalindrome(num)) {
                return num;
            }
        }
        return -1; // No palindrome found
    }
    
    // Check if a number is palindrome in different bases
    public static boolean isPalindromeInBase(int num, int base) {
        if (num < 0 || base < 2 || base > 36) {
            return false;
        }
        
        String numInBase = Integer.toString(num, base);
        return isStringPalindrome(numInBase);
    }
    
    // Find the sum of all palindrome numbers in a range
    public static void sumOfPalindromes(int start, int end) {
        long sum = 0;
        int count = 0;
        
        for (int i = start; i <= end; i++) {
            if (isNumberPalindrome(i)) {
                sum += i;
                count++;
            }
        }
        
        System.out.println("\nSum of palindrome numbers between " + start + " and " + end + ":");
        System.out.println("Total palindrome numbers: " + count);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", count > 0 ? (double) sum / count : 0);
    }
    
    // Find longest palindrome substring in a string
    public static String longestPalindromeSubstring(String str) {
        if (str == null || str.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);      // Odd length
            int len2 = expandAroundCenter(str, i, i + 1);  // Even length
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return str.substring(start, end + 1);
    }
    
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== PALINDROME CHECKER ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Check if a number is palindrome");
            System.out.println("2. Check if a string is palindrome");
            System.out.println("3. Find palindrome numbers in range");
            System.out.println("4. Find palindrome strings in array");
            System.out.println("5. Find next/previous palindrome");
            System.out.println("6. Check palindrome in different base");
            System.out.println("7. Sum of palindrome numbers");
            System.out.println("8. Longest palindrome substring");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println("\nUsing digit reversal: " + 
                        (isNumberPalindrome(num) ? "PALINDROME" : "NOT PALINDROME"));
                    System.out.println("Without string conversion: " + 
                        (isPalindromeWithoutString(num) ? "PALINDROME" : "NOT PALINDROME"));
                    break;
                    
                case 2:
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();
                    System.out.println(str + " is " + 
                        (isStringPalindrome(str) ? "a palindrome" : "NOT a palindrome"));
                    break;
                    
                case 3:
                    System.out.print("Enter start range: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    int end = sc.nextInt();
                    findPalindromeNumbers(start, end);
                    break;
                    
                case 4:
                    findPalindromeStrings();
                    break;
                    
                case 5:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.println("Next palindrome: " + nextPalindrome(num));
                    System.out.println("Previous palindrome: " + previousPalindrome(num));
                    break;
                    
                case 6:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.print("Enter base (2-36): ");
                    int base = sc.nextInt();
                    System.out.println(num + " in base " + base + " is " + 
                        (isPalindromeInBase(num, base) ? "palindrome" : "not palindrome"));
                    
                    // Show representation
                    System.out.println("Representation: " + Integer.toString(num, base));
                    break;
                    
                case 7:
                    System.out.print("Enter start range: ");
                    start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    end = sc.nextInt();
                    sumOfPalindromes(start, end);
                    break;
                    
                case 8:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    String longest = longestPalindromeSubstring(str);
                    System.out.println("Longest palindrome substring: " + longest);
                    System.out.println("Length: " + longest.length());
                    break;
                    
                case 9:
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

### **Question 9: Perfect Number Finder**
```java
import java.util.Scanner;
import java.util.ArrayList;

public class PerfectNumberFinder {
    
    // Check if a number is perfect
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
    
    // Find all perfect numbers in a range
    public static void findPerfectNumbers(int start, int end) {
        System.out.println("\nPerfect numbers between " + start + " and " + end + ":");
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("No perfect numbers found in this range.");
        } else {
            System.out.println("\n\nTotal perfect numbers: " + count);
        }
    }
    
    // Get divisors of a number
    public static ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        
        if (num <= 0) return divisors;
        
        divisors.add(1); // 1 is always a divisor
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }
        
        // Sort the divisors
        divisors.sort(null);
        return divisors;
    }
    
    // Show perfect number with its divisors
    public static void showPerfectNumberDetails(int num) {
        if (!isPerfectNumber(num)) {
            System.out.println(num + " is NOT a perfect number.");
            return;
        }
        
        ArrayList<Integer> divisors = getDivisors(num);
        
        System.out.println("\n" + num + " is a PERFECT NUMBER");
        System.out.println("Divisors: " + divisors);
        
        // Show the sum
        System.out.print("Sum of divisors: ");
        int sum = 0;
        for (int i = 0; i < divisors.size(); i++) {
            System.out.print(divisors.get(i));
            sum += divisors.get(i);
            
            if (i < divisors.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
        System.out.println("Which equals the number itself: " + num);
    }
    
    // Check if a number is abundant (sum of proper divisors > number)
    public static boolean isAbundantNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum > num;
    }
    
    // Check if a number is deficient (sum of proper divisors < number)
    public static boolean isDeficientNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum < num;
    }
    
    // Find all perfect, abundant, and deficient numbers in a range
    public static void classifyNumbers(int start, int end) {
        System.out.println("\nNumber classification between " + start + " and " + end + ":");
        
        int perfectCount = 0;
        int abundantCount = 0;
        int deficientCount = 0;
        
        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                deficientCount++;
                continue;
            }
            
            int sum = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j != i / j) {
                        sum += i / j;
                    }
                }
            }
            
            if (sum == i) {
                perfectCount++;
            } else if (sum > i) {
                abundantCount++;
            } else {
                deficientCount++;
            }
        }
        
        System.out.println("Perfect numbers: " + perfectCount);
        System.out.println("Abundant numbers: " + abundantCount);
        System.out.println("Deficient numbers: " + deficientCount);
        System.out.println("Total numbers: " + (end - start + 1));
    }
    
    // Find amicable numbers (pair of numbers where each is sum of other's proper divisors)
    public static boolean areAmicableNumbers(int a, int b) {
        if (a <= 0 || b <= 0 || a == b) return false;
        
        return (sumOfProperDivisors(a) == b && sumOfProperDivisors(b) == a);
    }
    
    private static int sumOfProperDivisors(int num) {
        if (num <= 1) return 0;
        
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum;
    }
    
    // Find all amicable pairs in a range
    public static void findAmicablePairs(int start, int end) {
        System.out.println("\nAmicable pairs between " + start + " and " + end + ":");
        
        boolean[] checked = new boolean[end + 1];
        int pairCount = 0;
        
        for (int a = start; a <= end; a++) {
            if (!checked[a] && a > 1) {
                int b = sumOfProperDivisors(a);
                
                if (b > a && b <= end && sumOfProperDivisors(b) == a) {
                    System.out.println("(" + a + ", " + b + ")");
                    checked[a] = true;
                    checked[b] = true;
                    pairCount++;
                }
            }
        }
        
        if (pairCount == 0) {
            System.out.println("No amicable pairs found.");
        } else {
            System.out.println("Total amicable pairs: " + pairCount);
        }
    }
    
    // Check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== PERFECT NUMBER FINDER ===");
        System.out.println("Perfect number: Sum of proper divisors equals the number");
        System.out.println("Proper divisors: All divisors except the number itself");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Check if a number is perfect");
            System.out.println("2. Find perfect numbers in range");
            System.out.println("3. Show perfect number details");
            System.out.println("4. Check abundant/deficient numbers");
            System.out.println("5. Classify numbers in range");
            System.out.println("6. Check amicable numbers");
            System.out.println("7. Find amicable pairs");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(num + " is " + 
                        (isPerfectNumber(num) ? "a PERFECT number" : "NOT a perfect number"));
                    break;
                    
                case 2:
                    System.out.print("Enter start range: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    int end = sc.nextInt();
                    findPerfectNumbers(start, end);
                    break;
                    
                case 3:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    showPerfectNumberDetails(num);
                    break;
                    
                case 4:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.println("\n" + num + ":");
                    System.out.println("Perfect: " + isPerfectNumber(num));
                    System.out.println("Abundant: " + isAbundantNumber(num));
                    System.out.println("Deficient: " + isDeficientNumber(num));
                    break;
                    
                case 5:
                    System.out.print("Enter start range: ");
                    start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    end = sc.nextInt();
                    classifyNumbers(start, end);
                    break;
                    
                case 6:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("(" + a + ", " + b + ") are " + 
                        (areAmicableNumbers(a, b) ? "AMICABLE numbers" : "NOT amicable numbers"));
                    break;
                    
                case 7:
                    System.out.print("Enter start range: ");
                    start = sc.nextInt();
                    System.out.print("Enter end range: ");
                    end = sc.nextInt();
                    findAmicablePairs(start, end);
                    break;
                    
                case 8:
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

## **Section 4: Complex Loop Problems**

### **Question 10: GCD and LCM Calculator**
```java
import java.util.Scanner;

public class GCD_LCM_Calculator {
    
    // GCD using Euclidean algorithm (subtraction method)
    public static int gcdSubtraction(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        if (a == 0) return b;
        if (b == 0) return a;
        
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
    // GCD using Euclidean algorithm (division method)
    public static int gcdDivision(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // GCD using recursion
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcdRecursive(b, a % b);
    }
    
    // LCM using formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        return (a / gcdDivision(a, b)) * b;
    }
    
    // GCD of three numbers
    public static int gcdThree(int a, int b, int c) {
        return gcdDivision(gcdDivision(a, b), c);
    }
    
    // LCM of three numbers
    public static int lcmThree(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }
    
    // GCD of an array of numbers
    public static int gcdArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcdDivision(result, numbers[i]);
        }
        return result;
    }
    
    // LCM of an array of numbers
    public static long lcmArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        
        long result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm((int)result, numbers[i]);
        }
        return result;
    }
    
    // Find all divisors of a number
    public static void findDivisors(int num) {
        System.out.print("\nDivisors of " + num + ": ");
        
        if (num == 0) {
            System.out.println("Infinite divisors (all numbers except 0)");
            return;
        }
        
        num = Math.abs(num);
        int count = 0;
        
        // Print divisors in ascending order
        System.out.print("1");
        count++;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(", " + i);
                count++;
                
                if (i != num / i) {
                    System.out.print(", " + (num / i));
                    count++;
                }
            }
        }
        
        if (num > 1) {
            System.out.print(", " + num);
            count++;
        }
        
        System.out.println("\nTotal divisors: " + count);
    }
    
    // Check if two numbers are co-prime (GCD = 1)
    public static boolean areCoPrime(int a, int b) {
        return gcdDivision(a, b) == 1;
    }
    
    // Find Euler's Totient function φ(n) - count of numbers less than n that are co-prime to n
    public static int eulerTotient(int n) {
        if (n <= 0) return 0;
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (areCoPrime(i, n)) {
                count++;
            }
        }
        return count;
    }
    
    // Find all co-prime numbers with n
    public static void findCoPrimeNumbers(int n) {
        System.out.println("\nNumbers co-prime with " + n + " (1 <= x < " + n + "):");
        
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (areCoPrime(i, n)) {
                System.out.print(i + " ");
                count++;
                
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        System.out.println("\n\nTotal: " + count + " (φ(" + n + ") = " + eulerTotient(n) + ")");
    }
    
    // Solve linear Diophantine equation: ax + by = c
    public static void solveDiophantine(int a, int b, int c) {
        System.out.println("\nSolving: " + a + "x + " + b + "y = " + c);
        
        int g = gcdDivision(a, b);
        
        if (c % g != 0) {
            System.out.println("No integer solutions exist.");
            return;
        }
        
        // Find particular solution using extended Euclidean algorithm
        int[] solution = extendedEuclidean(a, b);
        int x0 = solution[0] * (c / g);
        int y0 = solution[1] * (c / g);
        
        System.out.println("Particular solution: x = " + x0 + ", y = " + y0);
        System.out.println("General solution:");
        System.out.println("  x = " + x0 + " + (" + (b/g) + ")t");
        System.out.println("  y = " + y0 + " - (" + (a/g) + ")t");
        System.out.println("  where t is any integer");
        
        // Show some solutions
        System.out.println("\nSome solutions:");
        for (int t = -3; t <= 3; t++) {
            int x = x0 + (b/g) * t;
            int y = y0 - (a/g) * t;
            System.out.println("t = " + t + ": x = " + x + ", y = " + y + 
                             " (Check: " + (a*x + b*y) + ")");
        }
    }
    
    // Extended Euclidean algorithm
    private static int[] extendedEuclidean(int a, int b) {
        if (b == 0) {
            return new int[]{1, 0};
        }
        
        int[] result = extendedEuclidean(b, a % b);
        int x1 = result[0];
        int y1 = result[1];
        
        int x = y1;
        int y = x1 - (a / b) * y1;
        
        return new int[]{x, y};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== GCD & LCM CALCULATOR ===");
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. GCD of two numbers");
            System.out.println("2. LCM of two numbers");
            System.out.println("3. GCD/LCM of three numbers");
            System.out.println("4. GCD/LCM of array of numbers");
            System.out.println("5. Find divisors");
            System.out.println("6. Check co-prime numbers");
            System.out.println("7. Euler's Totient function");
            System.out.println("8. Solve linear Diophantine equation");
            System.out.println("9. Compare GCD methods");
            System.out.println("10. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    
                    System.out.println("\nGCD(" + a + ", " + b + "):");
                    System.out.println("Subtraction method: " + gcdSubtraction(a, b));
                    System.out.println("Division method: " + gcdDivision(a, b));
                    System.out.println("Recursive method: " + gcdRecursive(a, b));
                    
                    System.out.println("\nLCM(" + a + ", " + b + "): " + lcm(a, b));
                    break;
                    
                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println("LCM(" + a + ", " + b + ") = " + lcm(a, b));
                    break;
                    
                case 3:
                    System.out.print("Enter three numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    
                    System.out.println("\nGCD(" + x + ", " + y + ", " + z + ") = " + 
                        gcdThree(x, y, z));
                    System.out.println("LCM(" + x + ", " + y + ", " + z + ") = " + 
                        lcmThree(x, y, z));
                    break;
                    
                case 4:
                    System.out.print("How many numbers? ");
                    int n = sc.nextInt();
                    int[] numbers = new int[n];
                    
                    System.out.println("Enter " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        numbers[i] = sc.nextInt();
                    }
                    
                    System.out.println("\nGCD of array: " + gcdArray(numbers));
                    System.out.println("LCM of array: " + lcmArray(numbers));
                    break;
                    
                case 5:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    findDivisors(num);
                    break;
                    
                case 6:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println(a + " and " + b + " are " + 
                        (areCoPrime(a, b) ? "CO-PRIME" : "NOT co-prime"));
                    break;
                    
                case 7:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.println("φ(" + num + ") = " + eulerTotient(num));
                    System.out.print("Show co-prime numbers? (yes/no): ");
                    String show = sc.next().toLowerCase();
                    if (show.equals("yes") || show.equals("y")) {
                        findCoPrimeNumbers(num);
                    }
                    break;
                    
                case 8:
                    System.out.println("Enter coefficients for ax + by = c");
                    System.out.print("Enter a: ");
                    int coeffA = sc.nextInt();
                    System.out.print("Enter b: ");
                    int coeffB = sc.nextInt();
                    System.out.print("Enter c: ");
                    int coeffC = sc.nextInt();
                    solveDiophantine(coeffA, coeffB, coeffC);
                    break;
                    
                case 9:
                    System.out.print("Enter two numbers for comparison: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    
                    // Time subtraction method
                    long startTime = System.nanoTime();
                    int result1 = gcdSubtraction(a, b);
                    long endTime = System.nanoTime();
                    System.out.println("Subtraction method: " + result1 + 
                        " (Time: " + (endTime - startTime) + " ns)");
                    
                    // Time division method
                    startTime = System.nanoTime();
                    int result2 = gcdDivision(a, b);
                    endTime = System.nanoTime();
                    System.out.println("Division method: " + result2 + 
                        " (Time: " + (endTime - startTime) + " ns)");
                    
                    // Time recursive method
                    startTime = System.nanoTime();
                    int result3 = gcdRecursive(a, b);
                    endTime = System.nanoTime();
                    System.out.println("Recursive method: " + result3 + 
                        " (Time: " + (endTime - startTime) + " ns)");
                    break;
                    
                case 10:
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

## **Loop Concepts Covered:**

### **Types of Loops:**
1. **for loop** - When number of iterations is known
2. **while loop** - When number of iterations is unknown
3. **do-while loop** - When loop must execute at least once
4. **Enhanced for loop** - For arrays and collections
5. **Nested loops** - For patterns and 2D operations

### **Loop Control Statements:**
- **break** - Exit the loop immediately
- **continue** - Skip current iteration
- **return** - Exit the method

### **Common Loop Patterns:**
1. **Counting loops** - for(int i = 0; i < n; i++)
2. **Accumulator pattern** - sum += value
3. **Search pattern** - break when found
4. **Flag pattern** - boolean found = false
5. **Sentinel pattern** - while(value != -1)

### **Time Complexities with Loops:**
- Single loop: O(n)
- Nested loops: O(n²)
- Triple nested: O(n³)
- While loops: Depends on termination condition

### **Best Practices:**
1. Initialize loop variables properly
2. Use meaningful variable names
3. Avoid infinite loops
4. Minimize work inside loops
5. Use break and continue judiciously
6. Consider loop unrolling for optimization