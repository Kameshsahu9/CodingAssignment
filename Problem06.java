import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int a = sc.nextInt();

        System.out.println(" Enter num2: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: " + a + " , "+ b);

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After Swapping: " + a + " , " +b);

        sc.close();

    }
}
