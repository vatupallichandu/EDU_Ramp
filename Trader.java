package day6;

import java.util.HashMap;
import java.util.Map;
 
public class Trader implements Tradeable {
    private String traderId;
    private String name;
    private Map<String, Integer> portfolio;
    private DmartMarket market;
 
    public Trader(String traderId, String name, DmartMarket market) {
        this.traderId = traderId;
        this.name = name;
        this.portfolio = new HashMap<>();
        this.market = market;
    }
 
    @Override
    public void buyStock(String stockId, int quantity) throws StockNotFoundException, InsufficientMarketSharesException {
        market.buyStock(stockId, quantity, this);
    }
 
    @Override
    public void sellStock(String stockId, int quantity) throws StockNotFoundException, InsufficientSharesException {
        if (!portfolio.containsKey(stockId) || portfolio.get(stockId) < quantity) {
            throw new InsufficientSharesException("Insufficient shares to sell");
        }
        market.sellStock(stockId, quantity, this);
    }
 
    public void updatePortfolio(String stockId, int quantity, boolean isBuy) {
        if (isBuy) {
            portfolio.put(stockId, portfolio.getOrDefault(stockId, 0) + quantity);
        } else {
            portfolio.put(stockId, portfolio.get(stockId) - quantity);
            if (portfolio.get(stockId) == 0) {
                portfolio.remove(stockId);
            }
        }
    }
 
    public Map<String, Integer> getPortfolio() {
        return portfolio;
    }
 
    public String getTraderId() {
        return traderId;
    }
 
    public String getName() {
        return name;
    }
}
 
