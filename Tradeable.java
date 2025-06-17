package day6;

public interface Tradeable {
    void buyStock(String stockId, int quantity) throws StockNotFoundException, InsufficientMarketSharesException;
    void sellStock(String stockId, int quantity) throws StockNotFoundException, InsufficientSharesException;
}
