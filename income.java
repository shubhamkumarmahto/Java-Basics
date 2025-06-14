import java.util.*;

public class income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income < 5){
            System.out.println("0% TAX");
        }
        if(income > 5 && income < 10){
            System.out.println("20 % TAX");
        }
        if(income > 10){
            System.out.println("30% TAx");
        }
        else{
            System.out.println("more than 30% TAX");
        }
    }
    
}
