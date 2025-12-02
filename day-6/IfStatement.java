/**
 * File 1: IF STATEMENT
 * The basic conditional statement - executes code if condition is true
 */
public class IfStatement {
    public static void main(String[] args) {
        System.out.println("=== IF STATEMENT DEMONSTRATION ===\n");
        
        // ---------------------
        // 1. BASIC IF STATEMENT
        // ---------------------
        System.out.println("1. BASIC IF STATEMENT:");
        int age = 20;
        
        System.out.println("Age: " + age);
        if (age >= 18) {
            System.out.println("✅ You are eligible to vote!");
        }
        
        // ---------------------------
        // 2. IF-ELSE STATEMENT
        // ---------------------------
        System.out.println("\n2. IF-ELSE STATEMENT:");
        int number = 15;
        
        System.out.println("Number: " + number);
        if (number % 2 == 0) {
            System.out.println("✅ " + number + " is an EVEN number");
        } else {
            System.out.println("✅ " + number + " is an ODD number");
        }
        
        // --------------------------------
        // 3. IF-ELSE IF LADDER
        // --------------------------------
        System.out.println("\n3. IF-ELSE IF LADDER:");
        int score = 85;
        
        System.out.println("Score: " + score);
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        // ------------------------------------
        // 4. NESTED IF STATEMENTS
        // ------------------------------------
        System.out.println("\n4. NESTED IF STATEMENTS:");
        int x = 10;
        int y = 20;
        
        System.out.println("x = " + x + ", y = " + y);
        if (x > 5) {
            System.out.println("✅ x is greater than 5");
            
            if (y > 15) {
                System.out.println("✅ y is greater than 15");
                
                if (x + y > 25) {
                    System.out.println("✅ Sum of x and y is greater than 25");
                }
            }
        }
        
        // ------------------------------------
        // 5. PRACTICAL EXAMPLES
        // ------------------------------------
        System.out.println("\n5. PRACTICAL EXAMPLES:");
        
        // Example 1: Checking temperature
        int temperature = 25;
        System.out.println("\nExample 1 - Temperature Check (" + temperature + "°C):");
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else if (temperature > 20) {
            System.out.println("It's warm and pleasant.");
        } else if (temperature > 10) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's cold!");
        }
        
        // Example 2: Checking login credentials
        String username = "admin";
        String password = "12345";
        String inputUsername = "admin";
        String inputPassword = "12345";
        
        System.out.println("\nExample 2 - Login System:");
        System.out.println("Username entered: " + inputUsername);
        System.out.println("Password entered: " + inputPassword);
        
        if (inputUsername.equals(username)) {
            if (inputPassword.equals(password)) {
                System.out.println("✅ Login successful!");
            } else {
                System.out.println("❌ Incorrect password!");
            }
        } else {
            System.out.println("❌ User not found!");
        }
        
        // Example 3: Number classification
        int num = -5;
        System.out.println("\nExample 3 - Number Classification (" + num + "):");
        if (num > 0) {
            System.out.println("Positive number");
            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is zero");
        }
        
        // ------------------------------------
        // 6. COMMON MISTAKES TO AVOID
        // ------------------------------------
        System.out.println("\n6. COMMON MISTAKES:");
        
        // Mistake 1: Using assignment (=) instead of equality (==)
        int a = 5;
        System.out.println("\nMistake 1 - Assignment vs Equality:");
        
        // WRONG: This assigns 10 to a, and the condition is always true
        // if (a = 10) { ... }
        
        // CORRECT:
        if (a == 10) {
            System.out.println("a is 10");
        } else {
            System.out.println("a is not 10 (it's " + a + ")");
        }
        
        // Mistake 2: Forgetting curly braces (only first line is part of if)
        System.out.println("\nMistake 2 - Missing Braces:");
        boolean condition = true;
        
        System.out.println("Without braces (only first line executes):");
        if (condition)
            System.out.println("Line 1 - Inside if");
            System.out.println("Line 2 - Always executes (outside if)");
        
        System.out.println("\nWith braces (all lines execute conditionally):");
        if (condition) {
            System.out.println("Line 1 - Inside if");
            System.out.println("Line 2 - Inside if");
        }
        
        // Mistake 3: Dangling else problem
        System.out.println("\nMistake 3 - Dangling Else (use braces for clarity):");
        boolean first = false;
        boolean second = true;
        
        // Ambiguous without braces
        if (first)
            if (second)
                System.out.println("Both true");
        else
            System.out.println("Which if does this belong to?");
        
        // Clear with braces
        if (first) {
            if (second) {
                System.out.println("Both true");
            } else {
                System.out.println("First true, second false");
            }
        }
        
        // ------------------------------------
        // 7. DSA APPLICATIONS
        // ------------------------------------
        System.out.println("\n7. DSA APPLICATIONS:");
        
        // Application 1: Boundary checking in arrays
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        
        System.out.println("\nApplication 1 - Array Boundary Check:");
        System.out.println("Array length: " + arr.length + ", Accessing index: " + index);
        
        if (index >= 0 && index < arr.length) {
            System.out.println("✅ Safe to access arr[" + index + "] = " + arr[index]);
        } else {
            System.out.println("❌ Index out of bounds!");
        }
        
        // Application 2: Input validation
        String userInput = "42";
        
        System.out.println("\nApplication 2 - Input Validation:");
        System.out.println("Input: \"" + userInput + "\"");
        
        // Check if input can be parsed as integer
        if (userInput != null && !userInput.trim().isEmpty()) {
            try {
                int value = Integer.parseInt(userInput);
                if (value > 0) {
                    System.out.println("✅ Valid positive integer: " + value);
                } else {
                    System.out.println("❌ Must be positive!");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Not a valid integer!");
            }
        } else {
            System.out.println("❌ Input cannot be empty!");
        }
        
        // Application 3: Search condition
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;
        
        System.out.println("\nApplication 3 - Linear Search:");
        System.out.println("Searching for " + target + " in array...");
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("✅ Found " + target + " at index " + i);
                found = true;
                break; // Exit loop early
            }
        }
        
        if (!found) {
            System.out.println("❌ " + target + " not found in array");
        }
        
        System.out.println("\n=== IF STATEMENT DEMONSTRATION COMPLETE ===");
    }
}