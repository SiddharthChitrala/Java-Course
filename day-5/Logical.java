public class Logical {
    public static void main(String[] args) {
        int age = 25;

        System.out.println(age > 18 && age < 30); // true
        System.out.println(age > 30 || age == 25); // true
        System.out.println(!(age > 18)); // false
    }
}
