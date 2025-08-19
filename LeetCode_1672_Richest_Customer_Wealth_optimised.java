class Solution {
    public int maximumWealth(int[][] accounts)
    {
        int max = Integer.MIN_VALUE;
        
        for(int[] rows : accounts )
        {
            int balance =0; 
            for(int columns : rows)
            {
                balance += columns;
            }
            if(balance>max)
            {
                max = balance;
            }
        }
        return max;
        
    }
}
