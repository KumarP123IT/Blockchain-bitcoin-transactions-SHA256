

public class Transaction {

    private final String sender;
    private final String receiver;
    private double amount;
    private String trasactionhash;

public Transaction(String sender , String receiver , double amount)  {
    this.sender = sender;
    this.receiver = receiver;
    this.amount = amount;
    this.trasactionhash = generateHash();

}
private String generateHash() {
    return SHA256Util.applySHA256(sender + receiver + Double.toString(amount));
}

@Override
public String toString() {

    return "Transaction{" +
            "sender='" + sender + '\'' +
            ", receiver='" + receiver + '\'' +
            ", amount=" + amount +
            '}';
    }
}
