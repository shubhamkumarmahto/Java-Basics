import java.util.Scanner;

public class para1 {

    public static void Calculatesum(int num1 , int num2){
        int sum = num1 + num2;
        System.out.println("sum is :" + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        Calculatesum(a,b);
        
    }
    
}
