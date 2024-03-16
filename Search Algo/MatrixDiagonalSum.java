public class MatrixDiagonalSum {
    public static int diag(int arr[][]){
        int sum=0;
        int n=arr.length;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==j){
        //             sum+=arr[i][j];          Time Complexity O(n^2)
        //         }
        //         if((i+j) == n-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }


        for(int i=0; i<n; i++){
            sum+=arr[i][i];
            if(i!=n-1-i){
                sum+=arr[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8}, 
                    {9,10,11,12}, 
                    {13,14,15,16}};
        System.out.println(diag(arr));
    }
}
