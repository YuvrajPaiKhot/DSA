public class SortedArray {
    public static void isSorted(int[] arr, int i){
        if(i==arr.length-1){
            System.out.println("true");
            return;
        }

        if(arr[i]<arr[i+1]){
            isSorted(arr, i+1);
        }else{
            System.out.println("false");
            return;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 0};
        isSorted(arr, 0);
    }
}
