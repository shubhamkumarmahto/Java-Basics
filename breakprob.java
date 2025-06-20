import java.util.*;
public class breakprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.err.println("enter number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("condition break");
    }
    
}
