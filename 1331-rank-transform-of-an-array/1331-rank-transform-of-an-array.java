class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        for(int i=0; i<n; i++){
            copy[i] = arr[i];
        } 
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        
        //arr:{40,10,20,30}
        //copy:{10,20,30,40}
        //map: {10:1, 20:2, 30:3, 40:4}
        for(int i=0; i<copy.length; i++){
            if(map.containsKey(copy[i]) == false){
                map.put(copy[i], rank++);
            }
        } 
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}