class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            int freq[]=new int[26];
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                freq[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int x:freq)
            {
                sb.append(x).append("#");
            }
            String key=sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
