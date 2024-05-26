class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] inc = new int[nums.length];
    int[] dec = new int[nums.length];
    int[] res = new int[nums.length];
    inc[0] = 1;
    for (int i=1;i<inc.length;i++) {
        inc[i] = inc[i-1] * nums[i-1];
    }

    dec[dec.length - 1] = 1;
    for(int j = dec.length - 2; j >= 0 ;j--) {
        dec[j] = dec[j+1] * nums[j+1];
    }
    for(int k = 0;k<nums.length;k++) {
        res[k] = inc[k] * dec[k];
    }
    return res;
    }
}