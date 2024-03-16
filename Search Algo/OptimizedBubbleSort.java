public class OptimizedBubbleSort {
    //  Only works if sorted array is passed as argument 
    //  Time Complexity O(n)
    public static void bubble(int arr[]){
        int swaps = 0;
        for(int i = 0; i <= arr.length-2; i++){
            for(int j = 0; j <= arr.length-2-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubble(arr);
    }
}
