public class PowerOptimized {
    // public static int power(int x, int n){ 
    //     if(n==1){
    //         return x;            // TIME COMPLEXITY still O(n) since recursive func called twice
    //     }
    //     if(n%2 == 0){
    //         return power(x,n/2) * power(x, n/2);
    //     }else{
    //         return x * power(x,n/2) * power(x, n/2);
    //     }
    // }

    public static int power(int x, int n){ // Time complexity still O(n)
        if(n==1){
            return x;
        }
        int a = power(x,n/2);           // This has O(log n) time complexity
        if(n%2 == 0){
            return a * a;
        }else{
            return x * a * a;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
