public class Transaction {

    private final String stockName;
    private final int quantity;
    private final String type;

    public Transaction(String stockName, int quantity, String type) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.type = type;
    }

    public void displayTransaction() {
        System.out.println(type + " : " + stockName + " x " + quantity);
    }
}
