public class Stocks {

    public static int StockPrice(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //   Todays Profit

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {4,3,2,1,0};

        System.out.println(StockPrice(prices));
    }
}
