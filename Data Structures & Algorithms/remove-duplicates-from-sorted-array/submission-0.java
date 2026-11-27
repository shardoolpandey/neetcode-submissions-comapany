class Solution {
    public int removeDuplicates(int[] nums) {
         ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        arr.add(nums[0]);
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=arr.get(arr.size()-1))
            {
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
    }
