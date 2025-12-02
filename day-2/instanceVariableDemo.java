class Person {
    String name = "Rahul";   // instance variable
    int age = 22;
}

public class instanceVariableDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
