public class GetIBit {

    public static void check(int n, int i){
        int bitMask = 1<<i; // The no with which operation is to be performed

        if((n & bitMask) == 0){
            System.out.println("Ith bit is "+0);  // Even no
        }else{
            System.out.println("Ith bit is "+1);   // Odd no
        }
    }
    public static void main(String[] args) {
        int n=10;
        check(n, 3);
    }
}

