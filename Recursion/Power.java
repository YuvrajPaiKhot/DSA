public class Power {
    public static int powerOf(int x, int n){
        if(n==0){
            return 1;
        }
        int sum = x * powerOf(x, n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(powerOf(2, 10));
    }
}
