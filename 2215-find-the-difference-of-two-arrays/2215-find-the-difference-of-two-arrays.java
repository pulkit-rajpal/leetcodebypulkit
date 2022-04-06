class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        //HashSet<Integer> set3 = new HashSet<>();
        ArrayList<List<Integer>> array = new ArrayList<List<Integer>>();

        int i = 0;
        int j = 0;
        while (i < nums1.length ){
            set1.add(nums1[i]);
            i++;        
    }
     
        while(j < nums2.length) {
            set2.add(nums2[j]);
            j++;
        }
        HashSet<Integer> set3 = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(set3);
        array.add(new ArrayList<>(set1));
        array.add(new ArrayList<>(set2));
        return array;}
}