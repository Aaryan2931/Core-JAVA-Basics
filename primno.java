import java.util.Scanner;

class primeno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int givenum = sc.nextInt();
        int n = 2;
        int divcount = 0;
        while (n <= givenum / 2) {
            if (givenum % n == 0) {
                divcount++;
                break;
            }
            n++;
        }
        if (divcount == 0) {
            System.out.println(givenum + " is a prime number");
        } else {
            System.out.println(givenum + " is not a prime number");
        }
    }
}