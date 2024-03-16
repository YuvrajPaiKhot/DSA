public class MaxSubarraySumPrefixMethod {     // To find max and min subarray sum

    public static void SubarrayPrint(int arr[]){
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length; j++){
                
                sum = i==0 ? prefix[0] : prefix[j] - prefix[i-1];

                if(sum>max){
                    max = sum;
                }  
                sum = 0;
            }
        }

        System.out.println("Max sum is: "+max);
    }
   public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        SubarrayPrint(arr);
   } 
}
