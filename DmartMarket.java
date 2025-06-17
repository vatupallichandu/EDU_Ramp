package day6;

import java.util.HashMap;
import java.util.Map;

public class DmartMarket {

    private Map<String, DmartStock> stocks;

    public DmartMarket() {
        this.stocks = new HashMap<>();

        stocks.put("DMART1", new DmartStock("DMART1", "Dmart Product 1", 100.0, 1000));
        stocks.put("DMART2", new DmartStock("DMART2", "Dmart Product 2", 200.0, 500));
    }

    public synchronized void buyStock(String stockId, int quantity, Trader trader)
            throws StockNotFoundException, InsufficientMarketSharesException {
        DmartStock stock = stocks.get(stockId);
        if (stock == null) {
            throw new StockNotFoundException("Stock not found"); // Fixed: throw correct exception
        }

        if (stock.getAvailableShares() < quantity) {
            throw new InsufficientMarketSharesException("Insufficient market shares");
        }

        stock.updateAvailableShares(quantity, true);
        trader.updatePortfolio(stockId, quantity, true);
        System.out.println(trader.getName() + " bought " + quantity + " shares of " + stock.getStockName());
    }

    public synchronized void sellStock(String stockId, int quantity, Trader trader) throws StockNotFoundException {
        DmartStock stock = stocks.get(stockId);
        if (stock == null) {
            throw new StockNotFoundException("Stock not found");
        }

        stock.updateAvailableShares(quantity, false);
        trader.updatePortfolio(stockId, quantity, false);
        System.out.println(trader.getName() + " sold " + quantity + " shares of " + stock.getStockName());
    }

    public Map<String, DmartStock> getStocks() {
        return stocks;
    }
}
