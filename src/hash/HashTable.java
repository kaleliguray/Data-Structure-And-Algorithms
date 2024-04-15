package src.hash;

public class HashTable {

    private HashNode[] buckets;
    private int number_of_buckets; // capacity
    private int size; // number of key value pairs in hash table or number of hash nodes in a HashTable

    public HashTable() {
        this(10); // default
    }

    public HashTable(int capacity) {
        this.number_of_buckets = capacity;
        this.buckets = new HashNode[number_of_buckets];
        this.size = 0;
    }

    private class HashNode{

        private Integer key; // can be generic type
        private String value; // can be generic type
        private HashNode next; // refer to next node

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){
        if (key == null || value == null){
            throw new IllegalArgumentException("Key or Value is null !");
        }
        int bucket_index = getBucketIndex(key);
        HashNode head = buckets[bucket_index];
        while (head != null){
            if (head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucket_index];
        HashNode node = new HashNode(key, value); // (key, value) ---> null
        node.next = head;
        buckets[bucket_index] = node;

    }

    public int getBucketIndex(Integer key){
        return key % number_of_buckets; // length
    }

    public String get(Integer key){
        return null;
    }

    public String remove(Integer key){
        return null;
    }


    public static void main(String[] args) {

        HashTable table = new HashTable(); // default capacity 10
        table.put(100, "Michael");
        table.put(25, "Leo");
        table.put(25, "Tom"); // --> Leo & Tom refer to same index, that is the reason why size is 3
        table.put(40, "Harry");
        System.out.println(table.size);





    }


}
