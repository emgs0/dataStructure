import java.util.Hashtable;
/**
 * Hashtable is a data structure that implements an associative array abstract data type,
 * a structure that can map keys to values. It uses a hash function to compute an index
 * into an array of buckets or slots, from which the desired value can be found.
 * This allows for efficient retrieval of values based on their associated keys.
 * *
 * Hashing is the process of converting a key into a fixed-size numerical value, known
 * as the hash code. The hash code is then used as an index to store and retrieve the
 * associated value in the underlying data structure, typically an array.
 * *
 * The formula to calculate the index in the hashtable is often:
 *              index = hashcode % array_length
 * where "hashcode" is the hash code computed for the key, and "array_length" is the length
 * of the array of buckets in the hashtable. (the size often it's an input from the developer)
 * *
 * A bucket refers to a single slot or location in the array of the hashtable. Each
 * bucket may contain a linked list or other data structure to handle cases where
 * multiple keys hash to the same index (collision). This data structure is known as
 * a bucket, and it stores the key-value pairs that share the same hash code.
 *  *
 * The runtime complexity for basic operations such as insertion, retrieval, and deletion
 * in a well-designed hashtable is often O(1), assuming a good hash function and minimal collisions.
 * in the worst case the runtime complexity is O(n).
 */
public class Main {
    /**
     * The main method demonstrating Hashtable operations and outputting key-value pairs.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating a Hashtable with an initial capacity of 10
        Hashtable<String,String> table = new Hashtable<>(10);
        // Inserting key-value pairs into the Hashtable
        table.put("100","Spongebob");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","Squidward");
        table.put("777","Gary");
        // Uncomment the line below to test removal of an element by key
        //table.remove(777);
        // Iterating through the key set and printing hashcode, key, and associated value
        for(String key : table.keySet()) {
            // Using the hashcode % length formula to calculate the index in the Hashtable
            System.out.println(key.hashCode() %10 +"\t"+key+"\t"+table.get(key));
        }
        //In this example we have Sandy and patrick at the same bucket, so they are using a linkedList to be localized
    }
}