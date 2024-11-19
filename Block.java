import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Block {
    String hash;
    String previousHash;
    private List<Transaction> transactions = new ArrayList<>();
    private long timestamp;
    private int nonce;

    public Block(String previousHash) {
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        return SHA256Util.applySHA256(previousHash + Long.toString(timestamp) + Integer.toString(nonce) + transactions.toString());
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined! Hash: " + hash);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Block Details   : ").append("\n");
        builder.append("  Hash          : ").append(hash).append("\n");
        builder.append("  Previous Hash : ").append(previousHash).append("\n");
        builder.append("  Transaction   : ").append(transactions).append("\n");
        builder.append("  TimeStamp     : ").append(timestamp).append("\n");

        return builder.toString();
    }
}
