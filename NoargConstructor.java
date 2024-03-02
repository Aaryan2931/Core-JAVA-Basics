import java.io.*;

class java1 {
    int num;
    String name;

    // this would be invoked while an object
    // of that class is created.
    java1() {
        System.out.println("Constructor called");
    }
}

class NoargConstructor {
    public static void main(String[] args) {
        // this would invoke default constructor.
        java1 j = new java1();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(j.name);
        System.out.println(j.num);
    }
}