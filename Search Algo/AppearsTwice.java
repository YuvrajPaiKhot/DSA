/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element 
is distinct.*/  

public class AppearsTwice {

    public static boolean Twice(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]-arr[j]==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,0,4,6};

        System.out.println(Twice(arr));
    }
}
