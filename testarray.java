import java.util.Scanner;

class testarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last value");
        a[4] = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("the array elemtnt " + i + " is " + a[i]);
        }
    }
}