public class InvertedArraySearch {

    public static int invertedSearch(int arr[], int target){
        int min = minElement(arr);
        int pos;

        int start = 0, end = arr.length-1;
        if(target>=arr[start]){
            pos = binSearch(arr, 0, min, target);
        }else{
            pos = binSearch(arr, min, arr.length-1, target);
        }
        return pos;
    }

    public static int binSearch(int arr[], int start, int end, int target){

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int minElement(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;

            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>=arr[start] && arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int target = 0;
        System.out.println(invertedSearch(arr, target));
    }
}
