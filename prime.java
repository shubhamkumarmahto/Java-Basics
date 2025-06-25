public class prime {
    public static boolean isprime(int n){
        for(int i = 2;i<=n-1;i++){
            if(n%2==0){//completly divide
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isprime(12));
    }
    
}
