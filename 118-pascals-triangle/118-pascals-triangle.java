class Solution {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> output = new ArrayList<>();
                // here we are also adding the new array list as it will initialise the request

        
                output.add(new ArrayList<>() {
            {
                add(1);
            }
        });

        // pascal triangle is nothing

        /*
        As per formula it like
        11^0  -> 1
        11^1 - >  1 1
        11^2 - > 121
        11^3 - > 1331

        The above approach did not work so we are going to use the formula of the fact that
        combination formula that is f = f * (i-j+1)/j; running this from
                 */
        // Run a for loop for particular level of the Map since we have added one there
        // is no need to start from the 0th index

        for (int i = 1; i < numRows; i++) {
            // An arrayList that contains the Intermediate array
            ArrayList<Integer> sublist = new ArrayList<>();
            // for every nth iteration add 1 to the start
            int p = 1;
            sublist.add(p);
            // run another loop for the 
            for (int j = 0; j < i; j++) {

                //System.out.println(i + " " + j);
                p = (p * (i - j)) / (j + 1);
                sublist.add(p);
            }
            output.add(sublist);
        }
        return output;
    }
}