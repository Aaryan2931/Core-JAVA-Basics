import java.util.*;

public class costof3gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of a pencil : ");
        float a = sc.nextFloat();

        System.out.print("Enter the amount of a pen : ");
        float b = sc.nextFloat();

        System.out.print("Enter the amount of a eraser : ");
        float c = sc.nextFloat();

        float total = (a + b + c);
        float gst = total + (0.18f * total);
        System.out.print("Total bill : ");
        System.out.println(gst);

    }
}
