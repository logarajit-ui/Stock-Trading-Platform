import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> portfolio = new HashMap<>();

        while (true) {

            System.out.println("\n========== STOCK TRADING PLATFORM ==========");
            System.out.println("1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n----- MARKET DATA -----");
                    System.out.println("TCS       : ₹3500");
                    System.out.println("INFY      : ₹1600");
                    System.out.println("RELIANCE  : ₹2800");
                    break;

                case 2:

                    System.out.print("Enter Stock Name: ");
                    String buyStock = sc.next();

                    System.out.print("Enter Quantity: ");
                    int buyQty = sc.nextInt();

                    portfolio.put(buyStock.toUpperCase(),
                            portfolio.getOrDefault(buyStock.toUpperCase(), 0) + buyQty);

                    System.out.println("\nStock Purchased Successfully!");
                    System.out.println("You bought " + buyQty + " shares of " + buyStock.toUpperCase());

                    break;

                case 3:

                    System.out.print("Enter Stock Name: ");
                    String sellStock = sc.next();

                    System.out.print("Enter Quantity: ");
                    int sellQty = sc.nextInt();

                    if (portfolio.containsKey(sellStock.toUpperCase())) {

                        int currentQty = portfolio.get(sellStock.toUpperCase());

                        if (currentQty >= sellQty) {

                            portfolio.put(sellStock.toUpperCase(), currentQty - sellQty);

                            if (portfolio.get(sellStock.toUpperCase()) == 0) {
                                portfolio.remove(sellStock.toUpperCase());
                            }

                            System.out.println("Stock Sold Successfully!");
                            System.out.println("You sold " + sellQty + " shares of " + sellStock.toUpperCase());

                        } else {

                            System.out.println("Not Enough Shares!");

                        }

                    } else {

                        System.out.println("Stock Not Found!");

                    }

                    break;

                case 4:

                    System.out.println("\n========== YOUR PORTFOLIO ==========");

                    if (portfolio.isEmpty()) {

                        System.out.println("No Stocks Purchased.");

                    } else {

                        for (String stock : portfolio.keySet()) {

                            System.out.println(stock + " : " + portfolio.get(stock) + " Shares");

                        }

                    }

                    break;

                case 5:

                    System.out.println("Thank You for Using Stock Trading Platform!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }
        }
    }
}
