# RealTime Bitcoin Transaction System with SHA256 Hashing

A simple and secure simulation of a Bitcoin-like blockchain system that allows users to process transactions in real-time. This project demonstrates the functionality of blockchain technology with SHA256 for hashing, including transaction creation, block mining, and blockchain validation.

## Features
- **User-initiated Transactions:** Allows users to enter sender and recipient details along with the transaction amount.
- **Blockchain Mining:** Each transaction is added to a new block which is mined using a proof-of-work mechanism.
- **SHA256 Hashing:** Uses the SHA256 algorithm to generate hashes for blocks and transactions, ensuring data integrity.
- **Blockchain Validation:** Verifies the integrity of the blockchain by checking the hash consistency and previous block references.
- **Transaction History:** Displays the blockchain’s current state after each transaction, showing block details, hashes, and timestamps.

## Prerequisites
To run this project, you need:
- **Java JDK (version 8 or above)**
- A basic understanding of blockchain concepts and SHA256 hashing

## How to Run the Project

### 1. Clone the Repository
To get started, clone this repository to your local machine:
```bash
git clone https://github.com/KumarP123IT/RealTime-Bitcoin-Transaction-System.git
cd bitcoin-transaction-blockchain
```
### 2. Compile the Code
Navigate to the project directory and compile the java files:
```bash
javac Main.java
```
### 3. Run the Application
Once compiled, run the projecct with the following cammand:
```bash
java Main
```
### 4. Interact with the System
You will be prompted to enter:

  - Your name (sender)
  - Recipient's name
  - Transaction amount (must be a positive number)
The program will process your transaction, mine a new block, and display the updated blockchain.

## BloackChain Details
The blockchain works as follows:

* Each block contains:

 - A SHA256 hash (unique identifier for the block)
 - The previous block's SHA256 hash
 - A list of transactions
 - A timestamp representing when the block was created
 - The Genesis Block is the first block in the blockchain, created with a special system transaction.

* Mining: Each block is "mined" by solving a proof-of-work puzzle, where the hash of the block must start with a certain number of leading zeros (based on the difficulty level).

* Blockchain integrity: Blockchain integrity is maintained by validating hashes between consecutive blocks using the SHA256 algorithm.

  ## SHA256 Hashing
   SHA256 (Secure Hash Algorithm 256-bit) is used to ensure the immutability and security of the blockchain. Every block’s hash is generated from:

 - The block’s transactions
 - The previous block’s hash
 - The current timestamp
This makes the blockchain tamper-resistant, as any change in the block’s content would change its hash, which in turn would invalidate the subsequent blocks.

## Example Output 

```bash
Welcome to the RealTime Bitcoin Transaction Process!
Enter your name: Alice
Enter the recipient name: Bob
Enter the Amount Could be send: 200.32

Block Mined! Hash: 0000a5c753ab5c40ba0427a6502719d41b593becb7575cdcb5649c945bfa2372
Blockchain Details:
Block 1:
Block Details   : 
  Hash          : 0000d7c9cb57d7c8b7c4197c310d616b5a0897427ce5beb6cb6923c5d5c60954
  Previous Hash : 0
  Transaction   : [Transaction{sender='System', receiver='Genesis Block', amount=0.0}]
  TimeStamp     : 1732008824122

Block 2:
Block Details   : 
  Hash          : 0000a5c753ab5c40ba0427a6502719d41b593becb7575cdcb5649c945bfa2372
  Previous Hash : 0000d7c9cb57d7c8b7c4197c310d616b5a0897427ce5beb6cb6923c5d5c60954
  Transaction   : [Transaction{sender='Alice', receiver='Bob', amount=200.32}]
  TimeStamp     : 1732008834603

Do you want to see BlockChain is valid or not? (Yes/No): Yes
Is Blockchain valid? true

Do you want to send money again? (Yes/No): No
Thank you for using the RealTime Bitcoin Transaction Process! Have a great day.
```

## Technology Used 

 - **Java**: Core language for the implementation of the blockchain, transaction processing, and mining logic.
 - **SHA256**: Secure hashing algorithm used to generate block and transaction hashes.
 - **Scanner**: Used for handling user input.

### Custom Classes:

 - **Transaction.java**: Manages the details of a transaction between two parties.
 - **Block.java**: Defines the structure of each block in the blockchain, including hashing and mining.
 - **Blockchain.java**: Contains logic to handle the blockchain, including block mining, validation, and blockchain state management.


## Contribution
Feel free to fork this repository and contribute by:

 - Improving the transaction validation process.
 - Adding a real-time transaction simulation with external data.
 - Enhancing the user interface (UI) to a web-based platform or graphical user interface (GUI).

## License
This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute this project as per the terms of the license.


## Author
**Kumar P B.Tech IT** 
Final-Year Student | Aspiring Blockchain Developer  
[LinkedIn Profile](https://www.linkedin.com/in/kumar-p-bbbbb3252/)  

Feel free to connect with me for discussions, collaborations, and blockchain innovations!

