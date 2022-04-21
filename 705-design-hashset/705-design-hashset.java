class MyHashSet {
    
    /*
    1. Set is basically a where unique element are kept 
    2. User array to utitlise the functionality 
    3. Remove in array take new Integer(number)
    */
    
    ArrayList<Integer> array;
    public MyHashSet() {
        array = new ArrayList<>();
    }
    
    public void add(int key) {
        if (array.contains(key)) {return;}
        array.add(key);
    }
    
    public void remove(int key) {
        array.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        return array.contains(key); 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */