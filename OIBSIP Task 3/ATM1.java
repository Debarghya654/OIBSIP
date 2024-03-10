// ATM1.java
import java.util.Scanner;

public class ATM1 {
    private User user;
    private Accountacc account;

    public ATM1() {
        this.user = new User("Deb2225", "2025");
        this.account = new Accountacc();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("\tWelcome to Oriental Bank of India\t");
        System.out.println("==================================================");
        System.out.println("Enter User ID:");
        String userId = scanner.nextLine();
        System.out.println("Enter User PIN:");
        String userPin = scanner.nextLine();

        if (userId.equals(user.getUserId()) && userPin.equals(user.getUserPin())) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Access granted.");
            showMenu(scanner);
        } else {
            System.out.println("Wrong ID PIN");
            System.out.println("Access denied.");
        }
    }

    private void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Transaction History\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.printTransactionHistory();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: $");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 4:
                    System.out.println("Transfer facility is temporarily unavailable.");
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("=============================");
                    System.out.println("Thank you for being with us..");
                    System.out.println("=============================");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}