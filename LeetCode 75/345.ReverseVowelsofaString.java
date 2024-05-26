class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while(i<j) {
            //finds vowels from start
           while(i < j && vowels.indexOf(word[i]) == -1) {
            i++;
           }
           // finds vowels from end
           while(i< j && vowels.indexOf(word[j]) == -1) {
            j--;
           }
           //swap vowels
           char temp = word[i];
           word[i] = word[j];
           word[j] = temp;
           i++;
           j--;

        }
        String ans = new String(word);
        return ans;
    }
}