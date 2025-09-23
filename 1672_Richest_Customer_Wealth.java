class Solution {
    public int maximumWealth(int[][] accounts) {
        int total = 0;
        int[] row = new int[accounts.length];
        for(int i=0;i<accounts.length;i++)
        {
            int res = maxWealth(accounts[i]);
            if(res>total)
            {
                total = res;
            }

        }
        return total;
    }
    static int maxWealth(int[]row)
    {
        int sum =0;
        for(int i=0;i<row.length;i++)
        {
            sum += row[i];
        }
        return sum;
    }
}

