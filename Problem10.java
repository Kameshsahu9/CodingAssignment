import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Emter a number ");
        int n = sc.nextInt();

        System.err.print("Factors are ");

        for(int i = 1 ; i <= n; i++){
            if( n % i == 0 ) System.out.print(i + " ");


        }
        sc.close();

        
    }
}
