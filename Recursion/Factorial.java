public class Factorial {
    // public static void factorial(int n, int fac){
    //     if(n==1){
    //         System.out.println(fac);
    //         return;
    //     }
    //     fac*=n;
    //     factorial(n-1, fac);
    // }

    //      ALT SOLN
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn=n*factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
