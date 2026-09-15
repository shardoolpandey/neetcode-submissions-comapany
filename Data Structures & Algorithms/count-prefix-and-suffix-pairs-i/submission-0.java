class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++)
        {
            String str1=words[i];
            for(int j=i+1;j<words.length;j++)
            {
                String str2=words[j];
                if(str2.length()>=str1.length())
                {
                    String prefix=str2.substring(0,str1.length());
                    String suffix=str2.substring(str2.length()-str1.length());
                    if(str1.equals(prefix) && str1.equals(suffix))
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}