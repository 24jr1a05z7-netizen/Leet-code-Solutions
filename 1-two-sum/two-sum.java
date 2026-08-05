
        import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store numbers and their corresponding indices
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists in the map
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Store the current number and its index
            numToIndex.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (per constraints, this won't happen)
        return new int[] {};
    }
}

        
    