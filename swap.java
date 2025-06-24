public class swap {
    public static void Swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        
    }
    public static void main(String[] args) {
        //swap-value exchange
        int a = 4;
        int b = 5;

        Swap(a,b);
       
    }
    
}
