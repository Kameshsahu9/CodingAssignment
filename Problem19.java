import java.util.Scanner;

public class Problem19 {

    public static void printPrimeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime factors of " + num + " are: ");
        printPrimeFactors(num);
        sc.close();
    }
}
