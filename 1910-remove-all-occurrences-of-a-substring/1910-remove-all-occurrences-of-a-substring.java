class Solution {
    public String removeOccurrences(String s, String part) {
        /* 
        String.indexOf(sustring) - this function return the index of the substring occurence  in a string else -1; 
        */
        
        int index =0;
        
        //
        while(s.indexOf(part)!=-1)
        {   
            index = s.indexOf(part);
            // assigning s to start till index of part and the concat from leftover part excluding the part
            s=s.substring(0,index) + s.substring(index+part.length());
        }    
        return s;
    }
}