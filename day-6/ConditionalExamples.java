/**
 * File 4: CONDITIONAL EXAMPLES
 * Real-world examples combining all conditional statements
 */
public class ConditionalExamples {
    public static void main(String[] args) {
        System.out.println("=== REAL-WORLD CONDITIONAL EXAMPLES ===\n");
        
        // -------------------------
        // 1. AUTHENTICATION SYSTEM
        // -------------------------
        System.out.println("1. AUTHENTICATION SYSTEM");
        System.out.println("========================");
        
        String storedUsername = "admin";
        String storedPassword = "password123";
        String enteredUsername = "admin";
        String enteredPassword = "password123";
        
        System.out.println("Login Attempt:");
        System.out.println("Username: " + enteredUsername);
        System.out.println("Password: " + enteredPassword);
        
        // Using if-else
        if (enteredUsername.equals(storedUsername)) {
            if (enteredPassword.equals(storedPassword)) {
                System.out.println("✅ Login successful!");
                
                // Check user role
                String userRole = "admin"; // Could come from database
                
                switch (userRole.toLowerCase()) {
                    case "admin":
                        System.out.println("🔧 Admin privileges granted");
                        System.out.println("Access to: Users, Settings, Reports");
                        break;
                    case "moderator":
                        System.out.println("📝 Moderator privileges granted");
                        System.out.println("Access to: Content, Comments");
                        break;
                    case "user":
                        System.out.println("👤 User privileges granted");
                        System.out.println("Access to: Profile, Basic Features");
                        break;
                    default:
                        System.out.println("❓ Unknown role, limited access");
                }
            } else {
                System.out.println("❌ Incorrect password!");
            }
        } else {
            System.out.println("❌ User not found!");
        }
        
        // -------------------------
        // 2. E-COMMERCE DISCOUNT SYSTEM
        // -------------------------
        System.out.println("\n\n2. E-COMMERCE DISCOUNT SYSTEM");
        System.out.println("============================");
        
        double cartTotal = 250.0;
        String membershipLevel = "gold";
        boolean isWeekend = false;
        
        System.out.println("Cart Total: $" + cartTotal);
        System.out.println("Membership: " + membershipLevel.toUpperCase());
        System.out.println("Weekend: " + isWeekend);
        
        double baseDiscount = 0.0;
        
        // Tiered discount based on cart total
        if (cartTotal > 500) {
            baseDiscount = 0.30; // 30%
        } else if (cartTotal > 200) {
            baseDiscount = 0.20; // 20%
        } else if (cartTotal > 100) {
            baseDiscount = 0.10; // 10%
        } else {
            baseDiscount = 0.05; // 5%
        }
        
        // Membership bonus
        double membershipBonus = switch (membershipLevel.toLowerCase()) {
            case "platinum" -> 0.15;
            case "gold" -> 0.10;
            case "silver" -> 0.05;
            default -> 0.0;
        };
        
        // Weekend special
        double weekendBonus = isWeekend ? 0.05 : 0.0;
        
        // Calculate final discount
        double totalDiscount = baseDiscount + membershipBonus + weekendBonus;
        double maxDiscount = 0.40; // Cap at 40%
        double finalDiscount = (totalDiscount > maxDiscount) ? maxDiscount : totalDiscount;
        
        double finalAmount = cartTotal * (1 - finalDiscount);
        
        System.out.println("\nDiscount Breakdown:");
        System.out.println("Base Discount: " + (baseDiscount * 100) + "%");
        System.out.println("Membership Bonus: " + (membershipBonus * 100) + "%");
        System.out.println("Weekend Bonus: " + (weekendBonus * 100) + "%");
        System.out.println("Total Discount: " + (totalDiscount * 100) + "%");
        System.out.println("Final Discount (capped): " + (finalDiscount * 100) + "%");
        System.out.println("Final Amount: $" + String.format("%.2f", finalAmount));
        
        // -------------------------
        // 3. TRAFFIC LIGHT SIMULATOR
        // -------------------------
        System.out.println("\n\n3. TRAFFIC LIGHT SIMULATOR");
        System.out.println("=========================");
        
        String currentLight = "YELLOW";
        int pedestrianButton = 1; // 0 = not pressed, 1 = pressed
        int emergencyVehicle = 0; // 0 = none, 1 = approaching
        
        System.out.println("Current Light: " + currentLight);
        System.out.println("Pedestrian Button: " + (pedestrianButton == 1 ? "PRESSED" : "NOT PRESSED"));
        System.out.println("Emergency Vehicle: " + (emergencyVehicle == 1 ? "DETECTED" : "NONE"));
        
        String nextLight;
        int waitTime;
        
        switch (currentLight.toUpperCase()) {
            case "RED":
                // Check for emergency vehicle
                if (emergencyVehicle == 1) {
                    nextLight = "GREEN";
                    waitTime = 5; // Short cycle for emergency
                    System.out.println("🚑 EMERGENCY VEHICLE DETECTED!");
                } else if (pedestrianButton == 1) {
                    nextLight = "GREEN";
                    waitTime = 30; // Extended green for pedestrians
                    System.out.println("🚶 PEDESTRIAN CROSSING");
                } else {
                    nextLight = "GREEN";
                    waitTime = 60; // Normal cycle
                }
                break;
                
            case "YELLOW":
                nextLight = "RED";
                waitTime = 10; // Short yellow time
                break;
                
            case "GREEN":
                if (emergencyVehicle == 1) {
                    nextLight = "RED";
                    waitTime = 5; // Immediate red for emergency
                    System.out.println("🚑 EMERGENCY VEHICLE - CHANGING TO RED");
                } else {
                    nextLight = "YELLOW";
                    waitTime = 45; // Normal green time
                }
                break;
                
            default:
                nextLight = "RED";
                waitTime = 30;
                System.out.println("⚠️ INVALID LIGHT STATE - RESETTING TO RED");
        }
        
        System.out.println("\nNext Light: " + nextLight);
        System.out.println("Wait Time: " + waitTime + " seconds");
        
        // -------------------------
        // 4. GRADING SYSTEM WITH WEIGHTAGE
        // -------------------------
        System.out.println("\n\n4. COMPREHENSIVE GRADING SYSTEM");
        System.out.println("==============================");
        
        // Student marks
        double assignmentScore = 85.0;
        double midtermScore = 78.5;
        double finalExamScore = 92.0;
        double projectScore = 88.0;
        int attendance = 45; // out of 50 classes
        
        // Weightage
        double assignmentWeight = 0.20;
        double midtermWeight = 0.25;
        double finalWeight = 0.35;
        double projectWeight = 0.20;
        
        System.out.println("Student Performance:");
        System.out.println("Assignments: " + assignmentScore + "/100");
        System.out.println("Midterm: " + midtermScore + "/100");
        System.out.println("Final Exam: " + finalExamScore + "/100");
        System.out.println("Project: " + projectScore + "/100");
        System.out.println("Attendance: " + attendance + "/50 classes");
        
        // Calculate weighted score
        double weightedScore = (assignmentScore * assignmentWeight) +
                              (midtermScore * midtermWeight) +
                              (finalExamScore * finalWeight) +
                              (projectScore * projectWeight);
        
        // Attendance adjustment
        double attendancePercentage = (attendance / 50.0) * 100;
        double attendanceBonus = 0.0;
        
        if (attendancePercentage >= 90) {
            attendanceBonus = 2.0; // 2% bonus
        } else if (attendancePercentage >= 80) {
            attendanceBonus = 1.0; // 1% bonus
        } else if (attendancePercentage < 60) {
            attendanceBonus = -5.0; // 5% penalty
        }
        
        double finalScore = weightedScore + attendanceBonus;
        finalScore = (finalScore > 100) ? 100 : finalScore; // Cap at 100
        
        // Determine grade
        String grade;
        String remarks;
        
        if (finalScore >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (finalScore >= 80) {
            grade = "B";
            remarks = "Good";
        } else if (finalScore >= 70) {
            grade = "C";
            remarks = "Average";
        } else if (finalScore >= 60) {
            grade = "D";
            remarks = "Below Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        
        // Additional remarks based on component performance
        String performanceAnalysis = "";
        
        if (finalExamScore < 50 && weightedScore >= 60) {
            performanceAnalysis = "Warning: Poor final exam performance";
        } else if (midtermScore > 90 && finalExamScore < 70) {
            performanceAnalysis = "Notice: Performance dropped in final exam";
        } else if (assignmentScore > 95 && projectScore > 95) {
            performanceAnalysis = "Excellent in coursework";
        }
        
        System.out.println("\nGrade Calculation:");
        System.out.println("Weighted Score: " + String.format("%.2f", weightedScore));
        System.out.println("Attendance: " + String.format("%.1f", attendancePercentage) + "%");
        System.out.println("Attendance Bonus/Penalty: " + attendanceBonus + "%");
        System.out.println("Final Score: " + String.format("%.2f", finalScore));
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        if (!performanceAnalysis.isEmpty()) {
            System.out.println("Analysis: " + performanceAnalysis);
        }
        
        // -------------------------
        // 5. SHIPPING CALCULATOR
        // -------------------------
        System.out.println("\n\n5. SHIPPING CALCULATOR");
        System.out.println("=====================");
        
        double packageWeight = 2.5; // kg
        String shippingMethod = "express";
        String destination = "international";
        boolean insurance = true;
        
        System.out.println("Package Details:");
        System.out.println("Weight: " + packageWeight + " kg");
        System.out.println("Method: " + shippingMethod.toUpperCase());
        System.out.println("Destination: " + destination.toUpperCase());
        System.out.println("Insurance: " + (insurance ? "YES" : "NO"));
        
        double baseRate = 0.0;
        
        // Weight-based pricing
        if (packageWeight <= 1) {
            baseRate = 5.0;
        } else if (packageWeight <= 3) {
            baseRate = 10.0;
        } else if (packageWeight <= 5) {
            baseRate = 15.0;
        } else if (packageWeight <= 10) {
            baseRate = 25.0;
        } else {
            baseRate = 25 + ((packageWeight - 10) * 2);
        }
        
        // Shipping method multiplier
        double methodMultiplier = switch (shippingMethod.toLowerCase()) {
            case "express" -> 2.0;
            case "priority" -> 1.5;
            case "standard" -> 1.0;
            case "economy" -> 0.7;
            default -> 1.0;
        };
        
        // Destination surcharge
        double destinationSurcharge = switch (destination.toLowerCase()) {
            case "international" -> 20.0;
            case "remote" -> 10.0;
            case "rural" -> 5.0;
            default -> 0.0; // local
        };
        
        // Insurance cost (ternary)
        double insuranceCost = insurance ? (baseRate * 0.05) : 0.0;
        
        // Weekend surcharge (if shipping on weekend)
        boolean isWeekendShipping = false;
        double weekendSurcharge = isWeekendShipping ? 3.0 : 0.0;
        
        // Calculate total
        double shippingCost = (baseRate * methodMultiplier) + 
                             destinationSurcharge + 
                             insuranceCost + 
                             weekendSurcharge;
        
        // Apply discount for heavy packages with standard shipping
        double discount = (packageWeight > 5 && shippingMethod.equals("standard")) ? 
                         shippingCost * 0.10 : 0.0;
        
        double finalShippingCost = shippingCost - discount;
        
        System.out.println("\nCost Breakdown:");
        System.out.println("Base Rate: $" + baseRate);
        System.out.println("Method (" + shippingMethod + "): x" + methodMultiplier);
        System.out.println("Destination Surcharge: $" + destinationSurcharge);
        System.out.println("Insurance: $" + String.format("%.2f", insuranceCost));
        System.out.println("Weekend Surcharge: $" + weekendSurcharge);
        System.out.println("Subtotal: $" + String.format("%.2f", shippingCost));
        
        if (discount > 0) {
            System.out.println("Heavy Package Discount: -$" + String.format("%.2f", discount));
        }
        
        System.out.println("Total Shipping Cost: $" + String.format("%.2f", finalShippingCost));
        
        // Estimated delivery (using nested ternary)
        String estimatedDelivery = switch (shippingMethod.toLowerCase()) {
            case "express" -> destination.equals("local") ? "1 day" : 
                             destination.equals("international") ? "3-5 days" : "2-3 days";
            case "priority" -> destination.equals("local") ? "2 days" : 
                              destination.equals("international") ? "5-7 days" : "3-4 days";
            case "standard" -> destination.equals("local") ? "3-5 days" : 
                              destination.equals("international") ? "7-14 days" : "5-7 days";
            default -> "7-21 days"; // economy
        };
        
        System.out.println("Estimated Delivery: " + estimatedDelivery);
        
        System.out.println("\n=== CONDITIONAL EXAMPLES COMPLETE ===");
    }
}