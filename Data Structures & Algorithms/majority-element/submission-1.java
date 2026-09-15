class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=0;
        int arr[]=nums;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                majority=arr[i];
                count++;
            }
            else if(arr[i]==majority)
            {
                count++;
            }
            else if(arr[i]!=majority)
            {
                count--;
            }
        }
        return majority;
    }
}