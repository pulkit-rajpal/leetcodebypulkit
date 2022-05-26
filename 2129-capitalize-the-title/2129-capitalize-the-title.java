class Solution {
    public String capitalizeTitle(String title) {
            String[] s = title.split(" ");
            StringBuilder res = new StringBuilder();
            for (String a : s)
            { if (a.length() >=3){
             a=a.toLowerCase();
             a=a.substring(0,1).toUpperCase()+a.substring(1,a.length());
             res.append(a);
             res.append(" ");
            }  else 
            {
             a=a.toLowerCase();
             res.append(a);
             res.append(" ");

            }

            }
        String result =res.toString();
        result = result.substring(0,result.length()-1); 
        return result;
    }
}