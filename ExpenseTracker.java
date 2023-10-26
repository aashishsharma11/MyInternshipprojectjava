import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Expense {
    String description;
    double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(String description, double amount) {
        Expense expense = new Expense(description, amount);
        expenses.add(expense);
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
            return;
        }

        System.out.println("Expenses:");
        for (Expense expense : expenses) {
            System.out.println(expense.description + ": $" + expense.amount);
        }
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter expense amount: $");
                    double amount = scanner.nextDouble();
                    tracker.addExpense(description, amount);
                    break;
                case 2:
                    tracker.viewExpenses();
                    break;
                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}        