/**
 * File 2: SWITCH STATEMENT
 * Used for multiple branches based on a single value
 * Cleaner alternative to long if-else chains
 */
public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT DEMONSTRATION ===\n");
        
        // -------------------------
        // 1. BASIC SWITCH STATEMENT
        // -------------------------
        System.out.println("1. BASIC SWITCH STATEMENT:");
        int dayNumber = 3;
        
        System.out.println("Day number: " + dayNumber);
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
                break;
        }
        
        // ------------------------------------
        // 2. SWITCH WITH FALL-THROUGH
        // ------------------------------------
        System.out.println("\n2. SWITCH WITH INTENTIONAL FALL-THROUGH:");
        int month = 2;
        int year = 2024;
        int daysInMonth = 0;
        
        System.out.println("Month: " + month + ", Year: " + year);
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }
        System.out.println("Days in month: " + daysInMonth);
        
        // ------------------------------------
        // 3. SWITCH WITH CHARACTERS
        // ------------------------------------
        System.out.println("\n3. SWITCH WITH CHARACTER TYPE:");
        char grade = 'B';
        
        System.out.println("Grade: " + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // ------------------------------------
        // 4. SWITCH WITH STRINGS (Java 7+)
        // ------------------------------------
        System.out.println("\n4. SWITCH WITH STRING TYPE:");
        String fruit = "Apple";
        
        System.out.println("Fruit: " + fruit);
        switch (fruit.toLowerCase()) { // Convert to lowercase for case-insensitive matching
            case "apple":
                System.out.println("🍎 Apple: $1.99 per kg");
                break;
            case "banana":
                System.out.println("🍌 Banana: $0.99 per dozen");
                break;
            case "orange":
                System.out.println("🍊 Orange: $2.49 per kg");
                break;
            case "mango":
                System.out.println("🥭 Mango: $3.99 per kg");
                break;
            default:
                System.out.println("Sorry, " + fruit + " is not available");
        }
        
        // ------------------------------------
        // 5. ENHANCED SWITCH (Java 14+)
        // ------------------------------------
        System.out.println("\n5. ENHANCED SWITCH EXPRESSION (Java 14+ Style):");
        int operation = 2;
        int num1 = 10, num2 = 5;
        
        System.out.println("Operation code: " + operation);
        System.out.println("Numbers: " + num1 + " and " + num2);
        
        // Traditional switch as expression
        String result = switch (operation) {
            case 1 -> "Addition: " + (num1 + num2);
            case 2 -> "Subtraction: " + (num1 - num2);
            case 3 -> "Multiplication: " + (num1 * num2);
            case 4 -> {
                if (num2 != 0) {
                    yield "Division: " + (num1 / num2);
                } else {
                    yield "Cannot divide by zero!";
                }
            }
            default -> "Invalid operation";
        };
        System.out.println("Result: " + result);
        
        // ------------------------------------
        // 6. SWITCH WITH ENUM
        // ------------------------------------
        System.out.println("\n6. SWITCH WITH ENUM TYPE:");
        
        // Define enum (usually in separate file)
        enum TrafficLight {
            RED, YELLOW, GREEN
        }
        
        TrafficLight currentLight = TrafficLight.GREEN;
        
        System.out.println("Current traffic light: " + currentLight);
        switch (currentLight) {
            case RED:
                System.out.println("🛑 STOP!");
                break;
            case YELLOW:
                System.out.println("⚠️ GET READY / SLOW DOWN");
                break;
            case GREEN:
                System.out.println("✅ GO!");
                break;
        }
        
        // ------------------------------------
        // 7. PRACTICAL EXAMPLES
        // ------------------------------------
        System.out.println("\n7. PRACTICAL EXAMPLES:");
        
        // Example 1: Calculator
        System.out.println("\nExample 1 - Simple Calculator:");
        char operator = '+';
        double operand1 = 15.5;
        double operand2 = 5.2;
        
        System.out.println("Operation: " + operand1 + " " + operator + " " + operand2);
        
        double calculation = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                calculation = operand1 + operand2;
                break;
            case '-':
                calculation = operand1 - operand2;
                break;
            case '*':
                calculation = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    calculation = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            case '%':
                calculation = operand1 % operand2;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("Result: " + calculation);
        }
        
        // Example 2: Menu system
        System.out.println("\nExample 2 - Restaurant Menu System:");
        int choice = 2;
        
        System.out.println("Menu choice: " + choice);
        switch (choice) {
            case 1:
                System.out.println("You ordered: Burger - $5.99");
                System.out.println("Would you like fries with that?");
                break;
            case 2:
                System.out.println("You ordered: Pizza - $8.99");
                System.out.println("Choose your toppings:");
                System.out.println("1. Pepperoni");
                System.out.println("2. Mushrooms");
                System.out.println("3. Extra Cheese");
                break;
            case 3:
                System.out.println("You ordered: Salad - $4.99");
                System.out.println("Choose dressing:");
                System.out.println("1. Ranch");
                System.out.println("2. Italian");
                System.out.println("3. Vinaigrette");
                break;
            case 4:
                System.out.println("You ordered: Pasta - $7.99");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4");
        }
        
        // Example 3: State machine
        System.out.println("\nExample 3 - Simple State Machine:");
        String state = "START";
        String input = "PROCESS";
        
        System.out.println("Current state: " + state);
        System.out.println("Input: " + input);
        
        switch (state) {
            case "START":
                switch (input) {
                    case "PROCESS":
                        System.out.println("Transition: START → PROCESSING");
                        state = "PROCESSING";
                        break;
                    case "EXIT":
                        System.out.println("Transition: START → EXIT");
                        state = "EXIT";
                        break;
                }
                break;
            case "PROCESSING":
                switch (input) {
                    case "COMPLETE":
                        System.out.println("Transition: PROCESSING → COMPLETE");
                        state = "COMPLETE";
                        break;
                    case "ERROR":
                        System.out.println("Transition: PROCESSING → ERROR");
                        state = "ERROR";
                        break;
                }
                break;
            case "COMPLETE":
                System.out.println("Process completed successfully!");
                break;
        }
        System.out.println("New state: " + state);
        
        // ------------------------------------
        // 8. DSA APPLICATIONS
        // ------------------------------------
        System.out.println("\n8. DSA APPLICATIONS:");
        
        // Application 1: Command pattern implementation
        System.out.println("\nApplication 1 - Command Pattern:");
        String command = "SORT";
        
        System.out.println("Executing command: " + command);
        switch (command) {
            case "INSERT":
                System.out.println("Performing insertion operation...");
                // Call insertion algorithm
                break;
            case "DELETE":
                System.out.println("Performing deletion operation...");
                // Call deletion algorithm
                break;
            case "SEARCH":
                System.out.println("Performing search operation...");
                // Call search algorithm
                break;
            case "SORT":
                System.out.println("Performing sorting operation...");
                // Call sorting algorithm
                break;
            case "UPDATE":
                System.out.println("Performing update operation...");
                // Call update algorithm
                break;
            default:
                System.out.println("Unknown command!");
        }
        
        // Application 2: File type handler
        System.out.println("\nApplication 2 - File Type Handler:");
        String fileName = "document.pdf";
        String fileExtension = fileName.substring(fileName.lastIndexOf('.') + 1).toUpperCase();
        
        System.out.println("File: " + fileName);
        System.out.println("Extension: " + fileExtension);
        
        switch (fileExtension) {
            case "TXT", "MD" -> System.out.println("📝 Text file - Opening with text editor");
            case "PDF" -> System.out.println("📄 PDF file - Opening with PDF reader");
            case "JPG", "JPEG", "PNG", "GIF" -> System.out.println("🖼️ Image file - Opening with image viewer");
            case "MP3", "WAV" -> System.out.println("🎵 Audio file - Opening with media player");
            case "MP4", "AVI", "MOV" -> System.out.println("🎬 Video file - Opening with video player");
            case "JAVA", "CPP", "PY" -> System.out.println("💻 Source code - Opening with code editor");
            default -> System.out.println("❓ Unknown file type");
        }
        
        // Application 3: HTTP status code handler
        System.out.println("\nApplication 3 - HTTP Status Code Handler:");
        int httpStatus = 404;
        
        System.out.println("HTTP Status Code: " + httpStatus);
        String statusMessage = switch (httpStatus) {
            case 200 -> "OK - Request succeeded";
            case 201 -> "Created - Resource created successfully";
            case 204 -> "No Content - Request succeeded, no response body";
            case 400 -> "Bad Request - Invalid syntax";
            case 401 -> "Unauthorized - Authentication required";
            case 403 -> "Forbidden - Access denied";
            case 404 -> "Not Found - Resource not found";
            case 500 -> "Internal Server Error - Server error";
            default -> "Unknown status code";
        };
        System.out.println("Status: " + statusMessage);
        
        System.out.println("\n=== SWITCH STATEMENT DEMONSTRATION COMPLETE ===");
    }
}