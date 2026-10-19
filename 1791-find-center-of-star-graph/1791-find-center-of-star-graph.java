class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        int row = edges.length;
        int col = 2;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(set.contains(edges[i][j])) {
                    return edges[i][j];
                }
                else {
                    set.add(edges[i][j]);
                }
            }
        } 
        return -1;       
    }
}