public class CheckPowerOfTwo {
    public static boolean checkPower(int n){
        int x = n & (n-1);
        if(x == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPower(0));
    }
}
