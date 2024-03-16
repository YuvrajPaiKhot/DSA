public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //getting pivot indx
        int pIndx = partition(arr, si, ei);

        // Sorting left part
        quickSort(arr, si, pIndx-1);

        // Sorting right part
        quickSort(arr, pIndx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1;

        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swapping last element (pivot)
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

