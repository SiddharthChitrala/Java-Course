class Demo {
    int x;           // default: 0
    boolean flag;    // default: false
    String name;     // default: null
}

public class defaultValues {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.x);
        System.out.println(d.flag);
        System.out.println(d.name);
    }
}
