class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int pairs = 0;
        int j=nums.length - 1;
        while(i<j) {
           if (nums[i] + nums[j] == k){
            pairs++;
            i++;
            j--;
           } else if (nums[i] + nums[j] > k) {
            j--;
           } else if (nums[i] + nums[j] < k) {
            i++;
           }
        }
        return pairs;
    }
}