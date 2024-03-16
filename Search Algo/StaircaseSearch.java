public class StaircaseSearch {      // Only applicable for row wise and column wise sorted matrices
    public static void staircase(int arr[][], int key){
        int row=0, column=arr[0].length-1;

        while(row<=arr.length-1 && column>=0){
            if(arr[row][column] == key){
                System.out.println("Element found at ("+row+","+column+")");
                return;
            }
            else if(key<arr[row][column]){
                column--;
            }else{
                row++;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8}, 
                    {9,10,11,12}, 
                    {13,14,15,16}};

        int key = 26;
        staircase(arr, key);
    }
}
