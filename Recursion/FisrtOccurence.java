public class FisrtOccurence {
    public static void first(int[] arr, int ele, int i){
        if(i==arr.length){
            System.out.println("Element not found");
            return;
        }
        if(arr[i]==ele){
            System.out.println(i);
            return;
        }else{
            first(arr, ele, i+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,9,6,3,4,18,5,2,3,6};
        first(arr, 69, 0);
    }
}
