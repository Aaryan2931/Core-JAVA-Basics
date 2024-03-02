class Students {

    int rollno;// instance variable  
    String name;
    static String college = "ITS";// static variable  
    // constructor  

    Students(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

// Test class to show the values of objects  
public class TestStaticVariable1 {
    public static void main(String args[]) {
        Students s1 = new Students(111, "Karan");
        Students s2 = new Students(222, "Aryan");
        // we can change the college of all objects by the single line of code  
        // Student.college="BBDIT";  
        s1.display();
        s2.display();
    }
}
