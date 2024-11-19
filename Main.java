import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Blockchain blockchain = new Blockchain();
        String recipient;
        String sender;
        double amount = 0;

        System.out.println("Welcome to the RealTime Bitcoin Transaction Process!");

        while (true) {

            System.out.print("Enter your name: ");
            sender = input.next();

            System.out.print("Enter the recipient name: ");
            recipient = input.next();


            if (sender.isBlank() || recipient.isBlank()) {
                System.out.println("Please enter both the sender and recipient names.");
                continue;
            }


            while (true) {
                System.out.print("Enter the amount to be sent: ");
                try {
                    amount = input.nextDouble();


                    if (amount <= 0) {
                        System.out.println("Invalid input detected. Please ensure the amount is a positive number.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid amount. Please enter a valid amount...");
                    input.nextLine();
                }
            }


            Transaction tx1 = new Transaction(sender, recipient, amount);
            Block block1 = new Block(blockchain.getLatestBlock().calculateHash());
            block1.addTransaction(tx1);
            blockchain.addBlock(block1);

            System.out.println("Blockchain after transaction: ");
            System.out.println(blockchain);


            System.out.println("Do you want to check if the blockchain is valid? (Yes/No): ");
            String isValid = input.next();

            if (isValid.equalsIgnoreCase("yes")) {
                System.out.println("This blockchain is valid(true) or invalid(false): " + blockchain.isChainValid());

            }
            System.out.println("-------------------------------------------------");

            System.out.print("Do you want to send money again? (Yes/No): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the RealTime Bitcoin Transaction Process! Have a great day.");
                break;
            }
        }

        input.close();
    }
}
