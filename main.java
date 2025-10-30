
    /*
        the following program was built while following a tutorial from
        Programming w/ Professor Sluiter

        the link to the YouTube video has been provided below:
        https://youtu.be/igedHOpSqu4?si=NfkCeUpywomtwswB

    */

    import java.util.ArrayList;

    public class main {
    public static void main(String[] args) {

        //demonstrate hash functions
        /*String statement1 = "Hello, World!";
        int hashvalue = statement1.hashCode();
        System.out.println("Hash value of '" + statement1 + "' is: " + hashvalue);

        String[] list1 = {"apple", "banana", "cherry"};
        String[] list2 = {"apple", "banana", "Cherry"};

        int hashlist1 = java.util.Arrays.hashCode(list1);
        int hashlist2 = java.util.Arrays.hashCode(list2);
        System.out.println("Hash value of list1 is: " + hashlist1);
        System.out.println("Hash value of list2 is: " + hashlist2);*/

        //demonstrate a series of blocks in a chain
        ArrayList<Block> blockchain = new ArrayList<>();
        Block Firstblock = new Block(new String[]{"Ahmed owns 500XYZ", "Huzaifa owns 200XYZ"}, 0);
        blockchain.add(Firstblock);
        System.out.println("First Block: " + Firstblock.toString());
        System.out.println("the block Chain is: " + blockchain.toString());
        System.out.println("--------------------------------------------------");
        //blockHash=-1608240238


        Block SecondBlock = new Block(new String[]{"Ahmed gave Shayan 140XYZ", "Huzaifa recived 200XYZ"}, Firstblock.getBlockHash());
        blockchain.add(SecondBlock);
        System.out.println("Second Block: " + SecondBlock.toString());
        System.out.println("the block Chain is: " + blockchain.toString());
        System.out.println("--------------------------------------------------");
        //blockHash=-1397824979


        Block ThirdBlock = new Block(new String[]{"Shayan gave Huzaifa 50XYZ", "Ahmed recived 100XYZ"}, SecondBlock.getBlockHash());
        blockchain.add(ThirdBlock);
        System.out.println("Third Block: " + ThirdBlock.toString());
        System.out.println("the block Chain is: " + blockchain.toString());
        //blockHash=1718829571


        //if the values are changed in any block, the hash value of that block will change and can be checked against the next block's previous hash value to ensure integrity of the chain.
        //if one value is changed, the entire chain after that block is invalidated.
        //blockchain values have been commented within the code to demonstrate this.


    }
}
