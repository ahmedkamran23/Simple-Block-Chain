# Simple-Block-Chain
This is a basic blockchain I built during my first year while learning Java.
I’ve always been curious about how blockchains actually store and verify data, so I decided to build one from scratch using just Java classes — no frameworks or external libraries.

It’s a small personal project, but it helped me understand how blocks, hashing, and proof of work all come together to make a blockchain secure and tamper-resistant.

⚙️ How It Works

Each block stores data, a timestamp, and the hash of the previous block.

The hash is calculated using SHA-256.

A simple proof-of-work system (“mining”) adds difficulty and prevents tampering.

When you run main.java, it creates a chain, mines blocks, and prints the results to the console.

🧩 Files

Block.java → defines the block structure and hashing logic.

main.java → builds and validates the blockchain.

🖥️ Run Instructions

Clone or download the project.

Open it in IntelliJ, Eclipse, or VS Code.

Run main.java.

You’ll see the mined blocks and hashes printed in the console.

🧠 What I Learned

How hash functions secure data.

How blocks link together to form an immutable chain.

How proof-of-work increases security and difficulty.

This project gave me a real feel for what’s going on behind systems like Bitcoin and made me more interested in backend and blockchain development.
