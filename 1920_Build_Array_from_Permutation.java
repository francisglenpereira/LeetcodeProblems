class Solution {
    public int[] buildArray(int[] nums) {
        return answer(nums);
    }
    static int[] answer(int[]nums)
    {
        
        if(nums == null || nums.length == 0)
        {
            return new int[]{};
        }
        else
        {
            int[]ans =  new int[nums.length]; 
            for(int i=0;i<nums.length;i++)
            {
                ans[i] = nums[nums[i]];

            }
            return ans;

            
        }
    }
}

