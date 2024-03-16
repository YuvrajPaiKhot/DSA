class MaxSubarrayKadanesAlgo{
    public static void SubarrayPrint(int arr[]){
        int max = Integer.MIN_VALUE;
        
        int sum = arr[0];
        for(int i=1; i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }

            if(sum>max){
                max = sum;
            }
        }

        System.out.println("Max sum is: "+max);
    }
   public static void main(String[] args) {
        int arr[] = {-2,-3, 4, -1, -2, 1, 5, -3};
        SubarrayPrint(arr);
   } 
}