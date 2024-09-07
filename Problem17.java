import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
        sc.close();
    }

    public static int findLCM(int num1, int num2) {
        int lcm = 1;
        for (int i = 2; i <= num1 || i <= num2; i++) {
            while (num1 % i == 0 || num2 % i == 0) {
                lcm *= i;
                if (num1 % i == 0) num1 /= i;
                if (num2 % i == 0) num2 /= i;
            }
        }
        return lcm;
    }
}