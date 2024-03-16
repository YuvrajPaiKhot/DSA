public class SumofNaturalNos {
    public static int sumOfNos(int n){
        if(n==1){
            return 1;
        }
        int sum = sumOfNos(n-1) + n;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNos(5));
    } 
}
