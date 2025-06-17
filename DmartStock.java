package day6;

public class DmartStock {

    private String stockId;
    private String stockName;
    private double pricePerShare;
    private int availableShares;

    // Constructor
    public DmartStock(String stockId, String stockName, double pricePerShare, int availableShares) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.pricePerShare = pricePerShare;
        this.availableShares = availableShares;
    }

    // Getter for stockId
    public String getStockId() {
        return stockId;
    }

    // Getter for stockName
    public String getStockName() {
        return stockName;
    }

    // Getter for pricePerShare
    public double getPricePerShare() {
        return pricePerShare;
    }

    // Getter for availableShares (thread-safe)
    public synchronized int getAvailableShares() {
        return availableShares;
    }

    /**
     * Updates available shares.
     * 
     * @param quantity Number of shares to add/remove
     * @param decrease If true, decrease shares; if false, increase
     */
    public synchronized void updateAvailableShares(int quantity, boolean decrease) {
        if (decrease) {
            availableShares -= quantity;
        } else {
            availableShares += quantity;
        }
    }
}
