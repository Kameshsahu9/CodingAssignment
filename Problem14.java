import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num");
        int n = sc.nextInt();
        sc.close();
        int re = 0;
        while(n != 0){
            
            re = re * 10 + n%10;
            n /= 10;

        }
        System.out.println("Reversed no " + re);
    }
}
