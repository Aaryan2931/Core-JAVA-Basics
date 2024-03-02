import java.util.*;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char j = 'a';
        char k = 'b';
        System.out.println((int) (j));
        System.out.println((int) (k));
        System.out.println(j - k);
        System.out.println("//END//");
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);

    }
}
