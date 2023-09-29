import java.util.*;

public class A1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {
            int i = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    i++;
                    break;
                }
            }

            if (i == 0) {
                System.out.println(n);
            }
        }
    }
}
