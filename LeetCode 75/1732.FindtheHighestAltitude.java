class Solution {
    public int largestAltitude(int[] gain) {
        int i = 0;
        int ans = 0;
        int peek = 0;
        while (i < gain.length) {
           peek += gain[i];
           i++;

           ans = Math.max(ans, peek);   
        }
        return ans; 
    }
}