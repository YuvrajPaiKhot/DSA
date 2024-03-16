public class InsertionSort {
    public static void Insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //  Finding correct posn of element
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //  Insertion
            arr[prev+1] = curr;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,4,1,3,2};
        Insertion(arr);
    }
}