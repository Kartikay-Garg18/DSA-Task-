public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen!=tLen) return false;
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        for(int i=0; i<sLen; i++){
            sFreq[s.charAt(i) - 'a']++;
            tFreq[t.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(sFreq[i]!=tFreq[i]) return false;
        }
        return true;
    }
}
