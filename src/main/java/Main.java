import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int dividersSum = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) dividersSum += i;
        }
        System.out.println(dividersSum);
    }
}