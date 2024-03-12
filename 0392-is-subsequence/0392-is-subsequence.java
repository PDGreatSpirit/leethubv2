class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPoint =  0;
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        if(t.length() == s.length()){
            if(!s.equals(t)) return false;
        }
        for (int i = 0; i < t.length(); i++) {
            if(sPoint == s.length()){
            return true;
            }
            if(s.charAt(sPoint) == t.charAt(i)){
                sPoint++;
            }
        }
        if(sPoint != s.length()){
            return false;
        }
        return true;
    }
}