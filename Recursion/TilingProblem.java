public class TilingProblem {
    public static int tiles(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int verticalChoice = tiles(n-1);

        // horizontal choice
        int horizontalChoice = tiles(n-2);

        int totalWays = verticalChoice + horizontalChoice;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tiles(2));
    }
}
