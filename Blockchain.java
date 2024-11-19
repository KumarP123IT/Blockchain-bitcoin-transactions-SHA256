import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> chain = new ArrayList<>();
    private int difficulty = 4;

    public Blockchain() {
        chain.add(createGenesisBlock());
    }

    private Block createGenesisBlock() {
        Block genesisBlock = new Block("0");
        Transaction genesisTransaction = new Transaction("Null", "Null", 0.0);
        genesisBlock.addTransaction(genesisTransaction);
        genesisBlock.mineBlock(difficulty);
        return genesisBlock;
    }

    public Block getLatestBlock() {
        return chain.get(chain.size() - 1);
    }

    public void addBlock(Block newBlock) {
        newBlock.mineBlock(difficulty);
        chain.add(newBlock);
    }

    public boolean isChainValid() {
        for (int i = 1; i < chain.size(); i++) {
            Block currentBlock = chain.get(i);
            Block previousBlock = chain.get(i - 1);

            // Validate current block hash
            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                return false;
            }

            // Validate previous hash linkage
            if (!currentBlock.previousHash.equals(previousBlock.hash)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Blockchain Details:\n");
        for (int i = 0; i < chain.size(); i++) {
            builder.append("Block ").append(i + 1).append(":\n");
            builder.append(chain.get(i).toString()).append("\n");
        }
        return builder.toString();
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
