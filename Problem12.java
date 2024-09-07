import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // int smallest = (a+b+c) - Math.max(a, Math.max(b, c)) - Math.max(Math.min(a,b),c);
        int smallest=Math.min(a,Math.min(b,c));
        //or
        //int smallest = (a & b) + (~a & c) + (~b & a) + (~c & (a & b));

        System.out.println("Smallest No " + smallest);
        sc.close();

        
    }
}
