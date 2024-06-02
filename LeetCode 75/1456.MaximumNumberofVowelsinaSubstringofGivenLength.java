class Solution {
    public int maxVowels(String s, int k) {
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int i=0;i<k;i++) {
            if (vowels.indexOf(word[i]) != -1) {
                count++;
            }
        }
        int max = count;
        for(int i=k;i<s.length();i++) {
           if (vowels.indexOf(word[i-k]) != -1) {
               count--;
           }
        if (vowels.indexOf(word[i]) != -1) {
            count++;
        }
        max = Math.max(max, count);
        }
        return max;
    }
}