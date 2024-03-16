public class SortStrings {
    public static void mergeSort(String arr[], int si, int ei){
        int mid = si+ (ei-si)/2;
        if(si>=ei){
            return;
        }

        //Left
        mergeSort(arr, si, mid);
        //Right
        mergeSort(arr, mid+1, ei);

        // Merging
        merge(arr, si, mid, ei);
    }
    public static void merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i=si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j]) > 0){
                temp[k] = arr[j];
                j++;
            }else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while(j<=ei){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }

    public static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
