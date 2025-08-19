class Solution {
    public int findNumbers(int[] nums)
    {
        int temp;
        int num_of_even =0;
        for(int i =0;i<nums.length;i++)
        {
            int count =0;
            temp = nums[i];
            if(temp == 0)
            {
                count = 1;
            }
            while(temp>0)
            {
                temp = temp/10;
                count++;
            }
            if(count%2 ==  0)
            {
                num_of_even++;

            }
        }
        return num_of_even;
        
    }
}
