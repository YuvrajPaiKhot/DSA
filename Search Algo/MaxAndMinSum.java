public class MaxAndMinSum {     // To find max and min subarray sum

    public static void SubarrayPrint(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length; j++){
                
                for(int k=i; k<=j;k++){
                    sum+=arr[k];
                }

                if(sum>max){
                    max = sum;
                }
                if(sum<min){
                    min = sum;
                }
                sum = 0;  
            }
        }

        System.out.println("Max sum is: "+max);
        System.out.println("Min sum is: "+min);
    }
   public static void main(String[] args) {
        int arr[] = {1,-3,2};
        SubarrayPrint(arr);
   } 
}
