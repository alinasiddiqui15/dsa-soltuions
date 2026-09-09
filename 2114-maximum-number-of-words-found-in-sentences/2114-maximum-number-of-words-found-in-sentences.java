class Solution {
    public int wordCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i=0; i<sentences.length; i++){
            int cnt = wordCount(sentences[i]);
            if(cnt > maxWords){
                maxWords = cnt;
            }
        }
        return maxWords;

    }
}