class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList();
        int index = 0;
        for(String str : words){
            if(str.indexOf(x) != -1)
                list.add(index);
                index++;
        }
        return list;
    }
}