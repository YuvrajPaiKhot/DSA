public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        int mid = si+ ((ei-si)/2);
        if(si>=ei){
            return;
        }

        //kaam
        mergeSort(arr, si, mid); // Left Part
        mergeSort(arr, mid+1, ei); // Right Part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left part if anything left
        while (i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Right Part
        while (j<=ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
            
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
