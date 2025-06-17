package day6;

public class Main {
    public static void main(String[] args) {
        DmartMarket market = new DmartMarket();

        
        Trader trader = new Trader("John Doe", null, market);

        try {
            
            market.buyStock("DMART1", 10, trader);

            
            market.sellStock("DMART1", 5, trader);

            
            market.buyStock("DMARTX", 5, trader);

        } catch (StockNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMarketSharesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
