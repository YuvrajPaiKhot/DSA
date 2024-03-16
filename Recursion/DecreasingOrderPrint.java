public class DecreasingOrderPrint {
    //      DECREASING ORDER PRINT
    // public static void printNos(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printNos(n-1);
    // }

    //      INCREASING ORDER PRINT
    // public static void printNos(int no, int n){
    //     if(no==n){
    //         System.out.print(no+" ");
    //         return;
    //     }
    //     System.out.print(no+" ");
    //     printNos(no+1, n);
    // }

    //      INCREASING ORDER ALT SOLN
    public static void printNos(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
