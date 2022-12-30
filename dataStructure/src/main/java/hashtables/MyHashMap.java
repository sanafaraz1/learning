package hashtables;

import java.util.ArrayList;
import java.util.List;

import hashtables.MyHashMap.Bucket;

public class MyHashMap {

    public class Bucket {
        String key;
        int value;

        public Bucket(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

    }

    int length;
    ArrayList<Bucket>[] bucketListArray;

    public MyHashMap(int size) {
        bucketListArray = new ArrayList[size];
        length = size;
    }

    public int get(String key) {
        ArrayList<Bucket> buckets = bucketListArray[hashCode(key)];
        for (int i = 0; i < buckets.size(); i++) {
            if (buckets.get(i).getKey() == key) {
                return buckets.get(i).getValue();
            }
        }
        throw new RuntimeException("Not Found");
    }

    public int hashCode(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt(i) * i) % length;
        }
        return hash;
    }

    public void put(String key, int value) {
        int address = hashCode(key);
        ArrayList<Bucket> listofBuckets = bucketListArray[address];
        if (listofBuckets == null) {
            ArrayList<Bucket> newBucket = new ArrayList<Bucket>();
            newBucket.add(new Bucket(key, value));
            bucketListArray[address] = newBucket;
        } else {
            listofBuckets.add(new Bucket(key, value));
        }

    }
    
    public List<String> keys() {
        List<String> keys= new ArrayList<String>();
        for(int i=0;i<bucketListArray.length;i++) {
            if(bucketListArray[i]!=null) {
                ArrayList<Bucket> buckets= bucketListArray[i];
                for(Bucket bucket : buckets) {
                    keys.add(bucket.getKey());
                }
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(50);
        map.put("grapes", 10000);
        map.put("oranges", 50000);
        map.put("grapes", 20000);
        System.out.println(map.get("grapes"));
        System.out.println(map.keys().toString());

    }

}
