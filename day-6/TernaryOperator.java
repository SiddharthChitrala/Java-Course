/**
 * File 3: TERNARY OPERATOR
 * Also known as conditional operator
 * Syntax: condition ? expression1 : expression2
 * Compact alternative to simple if-else statements
 */
public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("=== TERNARY OPERATOR DEMONSTRATION ===\n");
        
        // ----------------------------
        // 1. BASIC TERNARY OPERATOR
        // ----------------------------
        System.out.println("1. BASIC TERNARY OPERATOR:");
        
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + " → Status: " + status);
        
        int number = 15;
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number: " + number + " → " + parity);
        
        // ------------------------------------
        // 2. TERNARY VS IF-ELSE EQUIVALENCE
        // ------------------------------------
        System.out.println("\n2. TERNARY VS IF-ELSE EQUIVALENCE:");
        
        // If-else version
        int score = 85;
        String gradeIfElse;
        
        if (score >= 60) {
            gradeIfElse = "Pass";
        } else {
            gradeIfElse = "Fail";
        }
        System.out.println("If-else: Score " + score + " → " + gradeIfElse);
        
        // Ternary version (equivalent)
        String gradeTernary = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Ternary: Score " + score + " → " + gradeTernary);
        
        // ------------------------------------
        // 3. NESTED TERNARY OPERATOR
        // ------------------------------------
        System.out.println("\n3. NESTED TERNARY OPERATOR:");
        
        int marks = 78;
        
        // Multiple conditions using nested ternary
        String result = (marks >= 90) ? "A" :
                       (marks >= 80) ? "B" :
                       (marks >= 70) ? "C" :
                       (marks >= 60) ? "D" : "F";
        
        System.out.println("Marks: " + marks + " → Grade: " + result);
        
        // Equivalent if-else ladder for comparison
        String resultIfElse;
        if (marks >= 90) {
            resultIfElse = "A";
        } else if (marks >= 80) {
            resultIfElse = "B";
        } else if (marks >= 70) {
            resultIfElse = "C";
        } else if (marks >= 60) {
            resultIfElse = "D";
        } else {
            resultIfElse = "F";
        }
        System.out.println("If-else equivalent: " + resultIfElse);
        
        // ------------------------------------
        // 4. TERNARY WITH DIFFERENT DATA TYPES
        // ------------------------------------
        System.out.println("\n4. TERNARY WITH DIFFERENT DATA TYPES:");
        
        // With integers
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max between " + a + " and " + b + ": " + max);
        
        // With doubles
        double price = 99.99;
        double discount = (price > 100) ? 0.2 : 0.1;
        double finalPrice = price - (price * discount);
        System.out.println("Price: $" + price + ", Discount: " + (discount * 100) + "%, Final: $" + finalPrice);
        
        // With booleans
        boolean isRaining = true;
        boolean needUmbrella = isRaining ? true : false;
        System.out.println("Is raining: " + isRaining + " → Need umbrella: " + needUmbrella);
        
        // With character
        char testChar = 'A';
        char converted = Character.isUpperCase(testChar) ? Character.toLowerCase(testChar) : testChar;
        System.out.println("Original: " + testChar + " → Converted: " + converted);
        
        // ------------------------------------
        // 5. TERNARY IN ASSIGNMENTS
        // ------------------------------------
        System.out.println("\n5. TERNARY IN ASSIGNMENTS:");
        
        // Variable initialization
        int x = 5;
        int y = (x > 0) ? x * 2 : 0;
        System.out.println("x = " + x + ", y = " + y);
        
        // Array initialization
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i % 2 == 0) ? i * 2 : i * 3;
        }
        System.out.print("Array values: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // ------------------------------------
        // 6. TERNARY IN METHOD RETURNS
        // ------------------------------------
        System.out.println("\n6. TERNARY IN METHOD RETURNS:");
        
        // Simulating methods that return based on conditions
        int num1 = 15, num2 = 25;
        System.out.println("Absolute difference: " + absoluteDifference(num1, num2));
        System.out.println("Is positive: " + (isPositive(-5) ? "Yes" : "No"));
        
        // ------------------------------------
        // 7. PRACTICAL EXAMPLES
        // ------------------------------------
        System.out.println("\n7. PRACTICAL EXAMPLES:");
        
        // Example 1: Login status
        boolean isLoggedIn = true;
        String username = "john_doe";
        String welcomeMessage = isLoggedIn ? "Welcome back, " + username + "!" : "Please log in";
        System.out.println("Login Status: " + welcomeMessage);
        
        // Example 2: Temperature advice
        int temperature = 28;
        String advice = (temperature > 30) ? "Stay indoors, it's hot!" :
                       (temperature > 20) ? "Nice weather for a walk" :
                       (temperature > 10) ? "Wear a jacket" : "Bundle up, it's cold!";
        System.out.println("Temperature: " + temperature + "°C → Advice: " + advice);
        
        // Example 3: Shopping cart discount
        double cartTotal = 150.0;
        double discountRate = (cartTotal > 200) ? 0.25 :
                             (cartTotal > 100) ? 0.15 :
                             (cartTotal > 50) ? 0.10 : 0.0;
        double discountedTotal = cartTotal * (1 - discountRate);
        System.out.println("Cart total: $" + cartTotal);
        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Final amount: $" + discountedTotal);
        
        // ------------------------------------
        // 8. ADVANCED TERNARY PATTERNS
        // ------------------------------------
        System.out.println("\n8. ADVANCED TERNARY PATTERNS:");
        
        // Pattern 1: Default values for null
        String userInput = null;
        String safeValue = (userInput != null) ? userInput : "Default Value";
        System.out.println("User input: " + userInput + " → Safe value: " + safeValue);
        
        // Pattern 2: Conditional method calls
        boolean useAdvancedAlgorithm = false;
        int data = 42;
        int processed = useAdvancedAlgorithm ? processAdvanced(data) : processSimple(data);
        System.out.println("Data: " + data + " → Processed: " + processed);
        
        // Pattern 3: Building strings conditionally
        boolean includeDetails = true;
        String report = "Sales Report" + (includeDetails ? "\nDetails:\n- Item A: $100\n- Item B: $200" : "");
        System.out.println("\nReport:\n" + report);
        
        // Pattern 4: Array element selection
        int[] values = {10, 20, 30, 40, 50};
        int index = 3;
        int element = (index >= 0 && index < values.length) ? values[index] : -1;
        System.out.println("Array access at index " + index + ": " + element);
        
        // ------------------------------------
        // 9. DSA APPLICATIONS
        // ------------------------------------
        System.out.println("\n9. DSA APPLICATIONS:");
        
        // Application 1: Find minimum/maximum
        System.out.println("\nApplication 1 - Find Minimum/Maximum:");
        int val1 = 35, val2 = 42, val3 = 27;
        
        // Find maximum of three numbers
        int maxOfThree = (val1 > val2) ? 
                        ((val1 > val3) ? val1 : val3) : 
                        ((val2 > val3) ? val2 : val3);
        
        // Find minimum of three numbers
        int minOfThree = (val1 < val2) ? 
                        ((val1 < val3) ? val1 : val3) : 
                        ((val2 < val3) ? val2 : val3);
        
        System.out.println("Values: " + val1 + ", " + val2 + ", " + val3);
        System.out.println("Maximum: " + maxOfThree);
        System.out.println("Minimum: " + minOfThree);
        
        // Application 2: Binary search condition
        System.out.println("\nApplication 2 - Binary Search Logic:");
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int left = 0, right = sortedArray.length - 1;
        int mid = 0;
        boolean found = false;
        
        // Simplified binary search demonstration
        while (left <= right) {
            mid = left + (right - left) / 2;
            
            if (sortedArray[mid] == target) {
                found = true;
                break;
            }
            
            // Ternary used in update logic
            left = (sortedArray[mid] < target) ? mid + 1 : left;
            right = (sortedArray[mid] > target) ? mid - 1 : right;
        }
        
        System.out.println("Searching for " + target + " in sorted array");
        System.out.println("Found: " + found + (found ? " at index " + mid : ""));
        
        // Application 3: Linked list traversal condition
        System.out.println("\nApplication 3 - Linked List Node Check:");
        boolean hasNext = true;
        boolean isLastNode = false;
        
        // Determine node type
        String nodeType = hasNext ? 
                         (isLastNode ? "Second Last Node" : "Middle Node") : 
                         "Last Node";
        
        System.out.println("Node type: " + nodeType);
        
        // ------------------------------------
        // 10. COMMON MISTAKES & BEST PRACTICES
        // ------------------------------------
        System.out.println("\n10. COMMON MISTAKES & BEST PRACTICES:");
        
        // Mistake 1: Overly complex nested ternary (hard to read)
        System.out.println("\nMistake 1 - Overly Complex Nested Ternary:");
        int complexExample = 42;
        
        // ❌ Hard to read
        String complexResult = (complexExample > 100) ? "Large" : 
                              (complexExample > 50) ? "Medium" : 
                              (complexExample > 25) ? "Small" : 
                              (complexExample > 10) ? "Tiny" : "Micro";
        
        System.out.println("Complex ternary result: " + complexResult);
        
        // ✅ Better: Use if-else for complex conditions
        String readableResult;
        if (complexExample > 100) {
            readableResult = "Large";
        } else if (complexExample > 50) {
            readableResult = "Medium";
        } else if (complexExample > 25) {
            readableResult = "Small";
        } else if (complexExample > 10) {
            readableResult = "Tiny";
        } else {
            readableResult = "Micro";
        }
        System.out.println("Readable result: " + readableResult);
        
        // Mistake 2: Side effects in ternary expressions
        System.out.println("\nMistake 2 - Avoid Side Effects:");
        int counter = 0;
        
        // ❌ Bad practice - modifies variables in ternary
        // int badExample = (counter++ > 0) ? counter : counter;
        
        // ✅ Good practice - keep ternary expressions pure
        int goodExample = (counter > 0) ? counter + 1 : counter;
        System.out.println("Good example: " + goodExample);
        
        // Best Practice: Use parentheses for clarity
        System.out.println("\nBest Practice - Use Parentheses:");
        boolean cond1 = true;
        boolean cond2 = false;
        
        // Clear with parentheses
        boolean clearResult = (cond1 && cond2) ? true : false;
        System.out.println("Clear with parentheses: " + clearResult);
        
        System.out.println("\n=== TERNARY OPERATOR DEMONSTRATION COMPLETE ===");
    }
    
    // Helper methods for demonstrations
    private static int absoluteDifference(int a, int b) {
        return (a > b) ? (a - b) : (b - a);
    }
    
    private static boolean isPositive(int number) {
        return (number > 0) ? true : false;
    }
    
    private static int processSimple(int data) {
        return data * 2;
    }
    
    private static int processAdvanced(int data) {
        return data * data;
    }
}