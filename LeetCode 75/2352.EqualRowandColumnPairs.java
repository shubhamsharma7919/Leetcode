class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        HashMap<String, Integer> row = new HashMap<>();
        HashMap<String, Integer> col = new HashMap<>();

        int ans = 0;

        for(int i=0;i<n;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++) {
                sb.append(grid[i][j]);
                sb.append(":");
            }
            String str = sb.toString();
            row.put(str, row.getOrDefault(str, 0)+1);
        }
        
        for(int i=0;i<n;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++) {
                sb.append(grid[j][i]);
                sb.append(":");
            }
            String str = sb.toString();
            col.put(str, col.getOrDefault(str, 0)+1);
        }

        for(String s : row.keySet()) {
            if (col.containsKey(s)) {
                ans += row.get(s) * col.get(s);
            }
        }
        return ans;

    }
}