import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = factorial(n);

        System.out.println("Factorial is: " + factorial);

        sc.close();
    }

    public static long factorial(int n){
       if(n == 0 || n == 1) 
       return 1;
       else 
       return n * factorial(n-1);
    }
}
