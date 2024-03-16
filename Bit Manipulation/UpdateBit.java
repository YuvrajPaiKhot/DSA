import java.util.*;
class UpdateBit{
    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    public static int updateIthBit(int no, int i, int nb){
        int n=clearBit(no, i);
        int bitMask=nb<<i;

        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}