public class range{
   
        public static boolean isprime(int n) {
            if(n==2){
                return true;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%2==0){
                    return  false;
                }
            }
            return true;
        }
        
    public static void rangeprime(int n) {
        for(int i= 2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");//true
            }
        }
        System.out.println();//false
    }    
    public static void main(String[] args) {
        rangeprime(20);
    }
}