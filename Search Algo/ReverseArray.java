public class ReverseArray {

    public static void RevArray(int arr[]){
        int f=0, l= arr.length - 1;
        while(f<=l){
            if(f == l){
                break;
            }

            //  swapping
            int temp = arr[f]; 
            arr[f] = arr[l];
            arr[l] = temp;

            //  Increment
            f++;
            l--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 8, 4 ,2, 1};
        RevArray(arr);
    }
}
