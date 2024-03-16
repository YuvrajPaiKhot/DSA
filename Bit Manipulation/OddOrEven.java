public class OddOrEven {

    public static void check(int n){
        int bitMask = 1; // The no with which operation is to be performed

        if((n & bitMask) == 0){
            System.out.println("Even no");  // Even no
        }else{
            System.out.println("Odd no");   // Odd no
        }
    }
    public static void main(String[] args) {
        int n=6;
        check(n);
    }
}
