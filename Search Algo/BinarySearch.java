public class BinarySearch
{
    public static int BinSearch(int arr[]){
        int start = 0, end = arr.length -1;
        
        int key = 15;
        
        while(start<=end){              
            int mid = (start+end)/2;    // Finding Mid
            
            if(arr[mid]<key){           // Right
                start = mid+1;
            }
            else if(arr[mid] > key){    // left
                end = mid-1;
            }else{                      // Element Found
                return mid;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int arr[] = {6,7,8,9,10,11,12,14};
		System.out.println(BinSearch(arr));
	}
}