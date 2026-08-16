class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] freq = new int[100001];
        long sum = 0;
        long maxSum = 0;
        int distinct = 0;
      for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (freq[nums[i]] == 0) {
                distinct++;
            }
            freq[nums[i]]++;
            if (i >= k) {
                sum -= nums[i - k];
                freq[nums[i - k]]--;
                if (freq[nums[i - k]] == 0) {
                    distinct--;
                }
            }           
            if (i >= k - 1 && distinct == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}