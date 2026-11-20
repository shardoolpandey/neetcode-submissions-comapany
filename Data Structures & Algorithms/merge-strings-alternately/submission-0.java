class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int n=word1.length();
        int j=0;
        int m=word2.length();
        StringBuilder ans=new StringBuilder();
        while(i!=n && j!=m)
        {
            ans.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }
        if(i!=n)
        {
            String temp=word1.substring(i);
            ans.append(temp);
        }
        else if(j!=m)
        {
            String temp=word2.substring(j);
            ans.append(temp);
        }
        return ans.toString();
    }
}