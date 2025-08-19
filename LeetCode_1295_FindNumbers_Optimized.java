// Version 1: Using Math.log10
class SolutionLog10 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = (int)Math.log10(num) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

// Version 2: Optimized using range checks
class SolutionOptimized {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || 
                (num >= 1000 && num <= 9999) || 
                num == 100000) {
                count++;
            }
        }
        return count;
    }
}
