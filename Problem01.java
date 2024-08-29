//Check the given number is EVEN or ODD. 
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        if(n%2 == 0)
          System.out.println("even");
          else
          System.out.println("Odd");

          sc.close();
    }
}
