class Solution {
    public int compress(char[] chars) {
    StringBuilder sb = new StringBuilder();
      int c = 1;
      for (int i=0;i<chars.length;i++) {
         if(i+1 < chars.length && chars[i]== chars[i+1]) {
            c++;
         } else {
           sb.append(chars[i]);
           if(c > 1) {
           sb.append(c);
           }
           c = 1;
         }
      }
      for(int j = 0;j<sb.length();j++) {
        chars[j] = sb.charAt(j);
      }
      return sb.length();
    }
}