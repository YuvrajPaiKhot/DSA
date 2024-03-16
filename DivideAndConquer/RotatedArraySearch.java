public class RotatedArraySearch {
    public static int Search(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        //kaam
        if(arr[mid] == target){
            return mid;
        }

        // On L1
        if(arr[si]<=arr[mid]){
            // Left
            if(arr[si]<= target && target<=arr[mid]){
                return Search(arr, target, si, mid-1);
            }else{
                // Right
                return Search(arr, target, mid+1, ei);
            }
        }else{
            // On L2
            // Right
            if(arr[mid]<=target && target<=arr[ei]){
                return Search(arr, target, mid+1, ei);
            }else{
                return Search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(Search(arr, target, 0, arr.length-1));
    }
}
