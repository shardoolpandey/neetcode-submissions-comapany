class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        f(ans,ds,nums,nums.length);
        return ans;
    }
    public void f(List<List<Integer>> ans,List<Integer> ds,int nums[],int n)
    {

        if(ds.size()==n)
        {
            ans.add(new ArrayList<>(ds));
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(ds.contains(nums[i]))
                {
                    continue;
                }
                ds.add(nums[i]);
                f(ans,ds,nums,n);
                ds.remove(ds.size()-1);
            }

        }
    }
}
