class Solution
{
public boolean checkInclusion(String str1, String str2) {
     if(str1.length()>str2.length())
     {
        return false;
     }
    int freq1[] = new int[26];

    for (int i = 0; i < str1.length(); i++) {
        char ch = str1.charAt(i);
        freq1[ch - 'a']++;
    }

    int l = 0;
    int r = str1.length() - 1;

    int freq2[] = new int[26];

    for (int i = 0; i < str1.length(); i++) {
        char ch = str2.charAt(i);
        freq2[ch - 'a']++;
    }

    int n = str2.length();

    while (r < n) {

        if (EqualArray(freq1, freq2)) {
            return true;
        } else {
            freq2[str2.charAt(l) - 'a']--;

            l++;
            r++;

                if(r<n)
                freq2[str2.charAt(r) - 'a']++;
               
            
        }
    }

    return EqualArray(freq1,freq2);
}

public boolean EqualArray(int freq1[], int freq2[]) {

    for (int i = 0; i < freq1.length; i++) {

        if (freq1[i] != freq2[i]) {
            return false;
        }
    }

    return true;
}
}