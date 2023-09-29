import java.util.*;

public class A1Q6 {

public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(n > 0) {
        int num = n % 10;
        n = n / 10;
        System.out.print(num);

    }

}    
}
