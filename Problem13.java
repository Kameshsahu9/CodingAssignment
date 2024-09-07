import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no  ");
        int a = sc.nextInt();

        System.out.println("Enter second  no  ");
        int b = sc.nextInt();

        while(b != 0){
            int carry = a&b;
            a = a^b;
            b = carry << 1;

            

            sc.close();

        } 
        System.out.println("Sum " + a);
        
    }
}
