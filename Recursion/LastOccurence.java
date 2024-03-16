public class LastOccurence {
    public static int last(int[] arr, int ele, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = last(arr, ele, i+1);
        if(isFound == -1 && arr[i]==ele){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        System.out.println(last(arr, 9, 0));
    }
}