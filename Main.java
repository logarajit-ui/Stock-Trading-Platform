
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> portfolio = new HashMap<>();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("\n========== STOCK TRADING PLATFORM ==========");
                System.out.println("1. View Market Data");
                System.out.println("2. Buy Stock");
                System.out.println("3. Sell Stock");
                System.out.println("4. View Portfolio");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1 -> {
                        System.out.println("\nMarket Data:");
                        System.out.println("TCS   : ₹3500");
                        System.out.println("INFY  : ₹1500");
                        System.out.println("WIPRO : ₹500");
                    }

                    case 2 -> {
                        System.out.print("Enter stock name: ");
                        String buyStock = sc.next();

                        System.out.print("Enter quantity: ");
                        int buyQty = sc.nextInt();

                        portfolio.put(buyStock,
                                portfolio.getOrDefault(buyStock, 0) + buyQty);

                        System.out.println("Stock Buy Successfully");
                    }

                    case 3 -> {
                        System.out.print("Enter stock name: ");
                        String sellStock = sc.next();

                        if (portfolio.containsKey(sellStock)) {

                            System.out.print("Enter quantity: ");
                            int sellQty = sc.nextInt();

                            int available = portfolio.get(sellStock);

                            if (sellQty <= available) {
                                portfolio.put(sellStock, available - sellQty);
                                System.out.println("Stock Sell Successfully");
                            } 
                            else {
                                System.out.println("Not enough stocks");
                            }

                        } 
                        else {
                            System.out.println("Stock not found");
                        }
                    }

                    case 4 -> {
                        System.out.println("\nYour Portfolio:");

                        if (portfolio.isEmpty()) {
                            System.out.println("No Stocks Available");
                        } 
                        else {
                            for (String stock : portfolio.keySet()) {
                                System.out.println(stock + " : " + portfolio.get(stock));
                            }
                        }
                    }

                    case 5 -> 
                        System.out.println("Thank You for Trading");

                    default -> 
                        System.out.println("Invalid Choice");
                }

            } while (choice != 5);
        }
    }
}
