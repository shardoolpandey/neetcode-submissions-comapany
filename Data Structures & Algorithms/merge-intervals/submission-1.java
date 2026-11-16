class Solution {
    public int[][] merge(int[][] intervals) {
    
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> list=new ArrayList<>();
        int newInterval[]=intervals[0];
        int i=1;
        int n=intervals.length;
        while(i<n)
        {
            if(intervals[i][0]<=newInterval[1])
            {
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
            else
            {
            list.add(newInterval);
            newInterval=intervals[i];
            }
            i++;
        }
        list.add(newInterval);
        int ans[][]=list.toArray(new int[list.size()][]);
        return ans;
    }
}
