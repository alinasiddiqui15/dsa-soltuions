class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        boolean[] letters = new boolean[26];

        for(char c : sentence.toCharArray()){
            if(c >= 'a' && c <= 'z'){
               letters[c - 'a'] = true;
            }
        }

        //find any letter that not exist
        for(boolean existLetter : letters){
            if(!existLetter) return false;
        }
        return true;
    }
}