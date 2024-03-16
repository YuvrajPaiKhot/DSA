public class LargestString {

    public static String Largest(String arr[]){
        String large = arr[0];
        for(int i=1; i<arr.length; i++){
            if(large.compareTo(arr[i])<0){
                large=arr[i];
            }
        }

        return large;
    }
    public static void main(String[] args) {
        String arr[] = {"apple", "mango", "banana"};
        System.out.println(Largest(arr));
    }
}
