import java.util.*;

public class increasenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("------");
        reverse(n);
    }

    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        reverse(n - 1);
        System.out.println(n);
    }

}
