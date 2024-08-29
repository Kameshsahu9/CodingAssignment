import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a num ");
        int n = sc.nextInt();

        if(n  > 0 ) 
        System.out.println(n + "  is positive. "); 
        else if(n < 0)
        System.out.println(n + " is negative. ");
        else 
        System.out.println(n + " is zero. ");

        sc.close();

    }
}
