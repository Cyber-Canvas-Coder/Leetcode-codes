class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using nested loops to find two indices i and j such that nums[i] + nums[j] == target
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts from i + 1 to ensure different indices
                if (nums[i] + nums[j] == target) {
                    // Return the indices as an array
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array or handle as required
        return new int[0];
    }
}
