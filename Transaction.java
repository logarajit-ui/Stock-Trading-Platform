public class Transaction {

    private String stockName;
    private int quantity;
    private String type;

    public Transaction(String stockName, int quantity, String type) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.type = type;
    }

    public void displayTransaction() {
        System.out.println(type + " : " + stockName + " x " + quantity);
    }
}