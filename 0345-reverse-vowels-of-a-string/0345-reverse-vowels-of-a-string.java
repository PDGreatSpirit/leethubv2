class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder sB = new StringBuilder(s);
        boolean isVowelStart = false;
        boolean isVowelEnd = false;
        while (start <= end ){
            if(isVowels(sB.charAt(start))){
                start++;
            } else {
                isVowelStart = true;
            }
            if(isVowels(sB.charAt(end))){
                end--;
            } else{
                isVowelEnd= true;
            }
            if(isVowelStart && isVowelEnd){
                char temp = s.charAt(start);
                sB.setCharAt(start , sB.charAt(end) );
                sB.setCharAt(end , temp );
                isVowelStart = false;
                isVowelEnd = false;
                start++;
                end--;
            }
        }
        return sB.toString();
    }
    public boolean isVowels (char s ){
        char[] vowels = {'a','e','i','o','u'};
        char[] vowels2 = {'A','E','I','O','U'};
        for (int i = 0; i < 5; i++) {
            if(s == vowels[i]) return false;
            if(s == vowels2[i]) return false;
        }
        return true;
    }
}