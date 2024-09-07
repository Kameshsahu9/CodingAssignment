import java.util.Scanner;

public class Problem16 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int lcm = (x*y)/hcf03(x,y);
        System.out.println(lcm);
        
    } 
     static int hcf03(int x,int y){
        if(y==0){
            return x;
        }
        return hcf03(y, x%y);
    }
}

