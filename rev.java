public class rev {
    public static void main(String[] args) {
        int n = 1354;
        int re = 0;
        while(n > 0){
            int lastdigit = n%10;
           int  reverse = (re*10) + lastdigit;
           System.out.print(reverse);
            n = n/10;
        }
        
    }
    
}
