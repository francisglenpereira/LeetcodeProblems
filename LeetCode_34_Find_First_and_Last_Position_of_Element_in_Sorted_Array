class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]ans  ={-1,-1};
        int begin = Search(nums,target,true);
        int end = Search(nums,target,false);
        ans[0] = begin;
        ans[1]  = end;
        return ans;


        
    }
    static  int Search(int[] nums, int target,boolean StartIndex) 
    {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                if(StartIndex)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }

            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;;
            }
        }
        return ans;

    }
}
