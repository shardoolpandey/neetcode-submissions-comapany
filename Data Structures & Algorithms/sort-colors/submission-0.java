class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int twos=0;
        int arr[]=nums;
        int ans[]=arr;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==0)
            {
                zeros++;
            }
            else if(arr[i]==1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        int k=0;
        while(k!=nums.length)
        {
           while(zeros!=0)
           {
            ans[k++]=0;
            zeros--;
           }
           while(ones!=0)
           {
            ans[k++]=1;
            ones--;
           }
           while(twos!=0)
           {
            ans[k++]=2;
            twos--;
           }
        }
    }
}