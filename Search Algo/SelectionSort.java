public class SelectionSort {

    public static void selection(int arr[]){

        for(int i = 0; i <= arr.length-2; i++){
            int smallest = arr[i];
            int indx = i;
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[j]<smallest){
                    smallest = arr[j];
                    indx = j;
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[indx] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selection(arr);
    }
}
