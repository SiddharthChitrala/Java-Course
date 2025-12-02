public class LoopExamples {
    public static void main(String[] args) {
        // For loop example
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop example
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-While loop example
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // Enhanced For loop example
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {10, 20, 30, 40};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}