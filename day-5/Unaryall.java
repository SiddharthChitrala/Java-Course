public class Unaryall {
    public static void main(String[] args) {
        int x = 5;

        int a = x++;   // a=5, x=6
        int b = ++x;   // x=7, b=7
        int c = x--;   // c=7, x=6
        int d = --x;   // x=5, d=5

        System.out.println(a);  
        System.out.println(b);  
        System.out.println(c);  
        System.out.println(d);  
        System.out.println(x);  
    }
}
