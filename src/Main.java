import java.util.*;

public class Main {
    static LinkedList<BankAccount> accounts = new LinkedList<>();
    static Stack<String> transactionHistory = new Stack<>();
    static Queue<String> billQueue = new LinkedList<>();
    static Queue<BankAccount> accountRequests = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] physicalStorage = new BankAccount[3];
        physicalStorage[0] = new BankAccount("101", "Ali", 150000);
        physicalStorage[1] = new BankAccount("102", "Sara", 220000);
        physicalStorage[2] = new BankAccount("103", "Bekarys", 50000);

        for (BankAccount b : physicalStorage) {
            accounts.add(b);
        }

        while (true) {
            System.out.println("\n1. Bank\n2. ATM\n3. Admin\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("1. New Acc\n2. Deposit\n3. Withdraw\n4. Bill\n5. Undo");
                int userChoice = sc.nextInt();
                sc.nextLine();
                handleUser(userChoice, sc);
            } else if (choice == 2) {
                handleATM(sc);
            } else if (choice == 3) {
                handleAdmin(sc);
            } else if (choice == 4) {
                break;
            }
        }
    }

    static void handleUser(int choice, Scanner sc) {
        if (choice == 1) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            accountRequests.add(new BankAccount("NEW", name, 0));
        } else if (choice == 2 || choice == 3) {
            System.out.print("Username: ");
            String name = sc.nextLine();
            BankAccount acc = find(name);
            if (acc != null) {
                double amt = sc.nextDouble();
                if (choice == 2) {
                    acc.balance += amt;
                    transactionHistory.push("Deposit " + amt + " to " + name);
                } else {
                    acc.balance -= amt;
                    transactionHistory.push("Withdraw " + amt + " from " + name);
                }
            }
        } else if (choice == 4) {
            System.out.print("Bill name: ");
            billQueue.add(sc.nextLine());
        } else if (choice == 5 && !transactionHistory.isEmpty()) {
            System.out.println("Removed: " + transactionHistory.pop());
        }
    }

    static void handleATM(Scanner sc) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        BankAccount acc = find(name);
        if (acc != null) {
            System.out.println("1. Balance\n2. Withdraw");
            int c = sc.nextInt();
            if (c == 1) System.out.println(acc.balance);
            else acc.balance -= sc.nextDouble();
        }
    }

    static void handleAdmin(Scanner sc) {
        System.out.println("1. Apprv Acc\n2. Pay Bills\n3. View All");
        int c = sc.nextInt();
        if (c == 1 && !accountRequests.isEmpty()) {
            BankAccount req = accountRequests.poll();
            req.accountNumber = "ID" + (accounts.size() + 1);
            accounts.add(req);
        } else if (c == 2 && !billQueue.isEmpty()) {
            System.out.println("Paid: " + billQueue.poll());
        } else if (c == 3) {
            for (BankAccount a : accounts) System.out.println(a);
        }
    }

    static BankAccount find(String name) {
        for (BankAccount a : accounts) {
            if (a.username.equalsIgnoreCase(name)) return a;
        }
        return null;
    }
}