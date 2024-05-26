class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int j = 0;j<candies.length;j++) {
            if(candies[j] > max) {
                max = candies[j];
            }
        }
        ArrayList arr = new ArrayList();
        for(int i=0;i<candies.length;i++) {
            if((candies[i] + extraCandies) >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }
}