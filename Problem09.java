import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int n = sc.nextInt();


        System.out.println("Digits");
        while(n != 0){
         int digit = n%10;
         System.out.print(digit + " ");
         n /= 10;
         
         sc.close();

        }
        



        
    }
}
