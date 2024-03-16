public class ClearLastIBits {
    public static int clearLastI(int n, int i){
        int bitmask = -1<<i;

        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastI(15,2));
    }
}
