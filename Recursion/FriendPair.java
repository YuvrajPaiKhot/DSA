public class FriendPair {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int total_ways = pair(n-1)+((n-1)*pair(n-2));

        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(pair(4));
    }
}
