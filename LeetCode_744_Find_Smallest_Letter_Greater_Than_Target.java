class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;   // move right
            } else {
                end = mid - 1;     // look left
            }
        }

        return letters[start % letters.length];
    }
}
