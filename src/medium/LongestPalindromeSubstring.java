package medium;

public class LongestPalindromeSubstring {
    static int lo;
    static int maxLen;

    public static void main(String[] args){
        String s = "babad";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }

    private static String longestPalindrome(String s) {

        int len = s.length();
        if(len < 2)
            return s;
        for(int i=0;i<len-1;i++){
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(lo , lo+maxLen);
    }

    private static void extendPalindrome(String s, int i, int j ) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if(maxLen < j-i-1) {
            lo = i+1;
            maxLen = j - i - 1;
        }
    }
}
