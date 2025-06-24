public class bino {
    public static int Factorial(int n) {
        int f = 1;
        
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;// factorial of n
    }
    public static int bincoff(int n,int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);
        int bincoff = fact_n/(fact_r*fact_nmr);
        return bincoff; 
    }
    public static void main(String[] args) {
        System.out.println(bincoff(5, 2));
        
    }
    
}
