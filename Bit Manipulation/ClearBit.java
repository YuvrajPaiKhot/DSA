public class ClearBit {

    public static int check(int n, int i){
        int bitMask = ~(1<<i); // The no with which operation is to be performed

        return n & bitMask;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(check(n, 1));
    }
}

