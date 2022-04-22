class MyHashMap {
    int[] array;

    public MyHashMap() {
        // so we are taking an array with max size 10000 ..and filling the array with -1 
        array = new int[1000001];
        Arrays.fill(array,-1);
        
    }
    
    public void put(int key, int value) {
        // assigning the value at that particular space 
        array[key] = value;
    }
    
    public int get(int key) {
        return array[key];
    }
    
    public void remove(int key) {
        array[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */