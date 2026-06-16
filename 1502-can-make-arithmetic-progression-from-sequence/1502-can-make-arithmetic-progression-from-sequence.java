class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {     Arrays.sort(arr);
        
        // Step 2: Find common difference
        int diff = arr[1] - arr[0];
        
        // Step 3: Check all consecutive differences
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        
        return true;
        
    }
}