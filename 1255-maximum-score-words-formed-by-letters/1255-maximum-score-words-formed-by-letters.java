class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
    
        // The problem is that we need to visit the array of words and find out if the frequency  of these word set is restricted as per the constraints allow if yes calculate the score of the each char and the make sure the maxi score comes out of all choices
        
        
        // First we will build a frequency map from the letters 
        int[] farr = new int[score.length];
        for(char ch: letters)
        {
            // this basically gives us the frequency of a to z chars
            farr[ch - 'a']++;
        }
        
        // build a new function to return the max score  as we can not chnage the 
        
       int ans = ScoreWords(words,farr ,score,0);
       return ans;
        
    }
    
    public int ScoreWords(String[] words, int[] farr, int[] score, int index)
    {
    // first of all base condition 
    // index is the index of words we are currently 

    if (index == words.length)
    {
        return 0;
    }

    // As backtracking is about pick and abandon we will abondon the current word
    // and caculate score for the same 

    // calculate score without including  the current word[index]
    int sno = 0+ScoreWords(words,farr ,score, index+1);


    // Now for including the word 
    String word = words[index];

    // flag for knowing whether we have negative score for a char 
    boolean flag = true;

    // current score of the word 
    int sword = 0;
    // calcualte the score and check if invalid case
    for (int  i =0; i < word.length(); i++)
    {
        char ch = word.charAt(i);    
        // no such char in frequency array 
        if (farr[ch - 'a']  == 0)
        {
            flag = false; 
        }
        farr[ch - 'a']--;
        sword+=score[ch - 'a'];
    }

    int syes=0;
    if(flag)
    {
    syes = sword+ScoreWords(words,farr ,score, index+1);
    }


    for (int j =0; j < word.length(); j++)
    {
        char ch = word.charAt(j);
        farr[ch - 'a']++;
    }
    return Math.max(sno, syes);
    }
        
}    
