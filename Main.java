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
                    System.out.println("TCS : ₹3500");
                    System.out.println("INFY : ₹1600");
                    System.out.println("RELIANCE : ₹2800");
                    break;

                case 2:
                    System.out.println("Buy Stock");
                    break;

                case 3:
                    System.out.println("Sell Stock");
                    break;

                case 4:
                    System.out.println("Portfolio");
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}