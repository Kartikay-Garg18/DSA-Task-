public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        String word = strs[0];
        while(i<word.length()){
            char check = word.charAt(i);
            for(int j=0; j<strs.length; j++){
                String checkWord = strs[j];
                if(i>=checkWord.length() || checkWord.charAt(i)!=check){
                    return sb.toString();
                }
            }
            sb.append(check);
            i++;
        }
        return sb.toString();
    }
}
