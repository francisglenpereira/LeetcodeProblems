class Solution {
    public int search(int[] nums, int target) {
        int pivot = findThePivot(nums);
        if(pivot == -1)
        {
            int ans = binarySearch(nums,target,0,nums.length-1);
            return ans;
        }
        if(target == nums[pivot])
        {
            return pivot; 
        }
        if(target>=nums[0])
        {
            int ans = binarySearch(nums,target,0,pivot-1);
            return ans;
        }
        else
        {
          int ans =   binarySearch(nums,target,pivot+1,nums.length-1);
          return ans;
        }
        
    }
    static int binarySearch(int[]nums,int target,int start,int end)
    {
        int mid;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(nums[mid]== target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end =mid-1;
            }
        }
        return -1;


    }
    static int findThePivot(int[]nums)
    {
        int start = 0;
        int end  = nums.length-1;
        int mid;
        while(start<=end)
        {
            mid = start +(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            else if(nums[start]>=nums[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;

            }
        }
        return -1;
    }
}
