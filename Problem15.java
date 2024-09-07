import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        //hcf01(x,y);
        //hcf02(x,y);
        System.out.println(hcf03(x,y));
        sc.close();
        


    }
    static void hcf01(int x, int y){
        int hcf = 0;
        for(int i =1 ; i <= x || i <= y ; i++  ){
            if( x%i == 0 && y%i == 0 ){
                hcf = i;
            } 
        }
        System.out.println(hcf + " ");
    }
    static void hcf02(int x, int y){
        while(y > 0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        System.out.println("gcd " + x );
    }
    static int hcf03(int x,int y){
        if(y==0){
            return x;
        }
        return hcf03(y, x%y);
    }


}
