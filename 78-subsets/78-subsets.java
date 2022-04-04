class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //very basic solution for finding the  subsets
        // base condition
        ArrayList<List<Integer>> subset = new ArrayList<List<Integer>>();
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        for(int i : nums) input.add(i);
        subsets(subset, input, output, 0);
        Collections.sort(subset, (o1, o2) -> {
            int p = Math.min(o1.size(), o2.size());
            for (int i = 0; i < p; i++) {
                if (o1.get(i) == o2.get(i)) {
                    continue;
                } else {
                    return o1.get(i) - o2.get(i);
                }
            }
            return 1;
        });
        return subset;
    }


    public static void subsets
            (ArrayList<List<Integer>> subset, ArrayList<Integer> input, ArrayList<Integer> output, int index) {
        // base condition saying that the
        if (index == input.size()) // means the end of the list
        {
            subset.add(new ArrayList<>(output));
            return;
        }
        // make a choice to not include the element
        subsets(subset, input, new ArrayList<>(output), index + 1);
        output.add(input.get(index));
        subsets(subset, input, new ArrayList<>(output), index + 1);
    }
}