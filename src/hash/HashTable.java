package src.hash;

public class HashTable {

    private HashNode[] buckets;
    private int number_of_buckets; // capacity
    private int size; // number of key value pairs in hash table or number of hash nodes in a HashTable

    private class HashNode{

        private Integer key; // can be generic type
        private String value; // can be generic type

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }




}
