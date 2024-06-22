class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer, Integer> fmap = new HashMap<>();
      for(int val:arr) {
        fmap.put(val, fmap.getOrDefault(val, 0)+1);
      }

      HashSet<Integer> fset = new HashSet<>();
      for(int val:fmap.values()) {
          if(fset.contains(val)){
            return false;
          } else {
            fset.add(val);
          }
      }
      return true;
    }
}