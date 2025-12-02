public class Narrowing {
    public static void main(String[] args) {
        double x = 9.8;
        int y = (int) x;  // double → int
        System.out.println(y);  // 9
    }
}
