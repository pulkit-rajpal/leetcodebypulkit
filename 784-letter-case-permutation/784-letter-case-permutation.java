class Solution {
    ArrayList<String> array;
public List<String> letterCasePermutation(String s) {
        array = new ArrayList<>();
        perm(s.toCharArray(), 0);
        return array;
}
    
    public  void perm (char[] s, int index)
    {
        
// once we have reached the last of the array then return as we have got one solution
    
         if (s.length == index) {

     // parse the value of the char array add it to the array 

        array.add(String.valueOf(s));
        return;
    }
        
    // Not consider that an option
    
    perm(s, index + 1);
    
    
    /*Check for valid case if the character is digit ignore if alpha then check if it's uppercase if yes convert to lower and vice -versa and  call backtrack for index+1 */
    if (Character.isAlphabetic(s[index])) {
        s[index] = Character.isUpperCase(s[index]) ? Character.toLowerCase(s[index]) : Character.toUpperCase(s[index]);
        perm(s, index + 1);
    }
}
}