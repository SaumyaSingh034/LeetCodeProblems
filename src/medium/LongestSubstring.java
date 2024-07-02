package medium;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args){
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);

    }

    private static int lengthOfLongestSubstring(String s) {
        int j = -1;
        int i = -1;
        int answer = 0;
        HashMap<Character, Integer> stringCount = new HashMap<>();
        while (true) {
            boolean f1 = false;
            boolean f2 = false;
            //1. Aquire
            while (i < s.length() - 1) {
                f1 = true;
                i++;
                char ch = s.charAt(i);
                stringCount.put(ch, stringCount.getOrDefault(ch, 0) + 1);
                if (stringCount.get(ch) == 2)
                    break;
                else {
                    int len = i - j;
                    if (len > answer)
                        answer = len;
                }

            }
            //2. Release
            while (j < i) {
                f2 = true;
                j++;
                char ch = s.charAt(j);
                stringCount.put(ch, stringCount.get(ch) - 1);

                if (stringCount.get(ch) == 1)
                    break;
            }
            if(f1 == false && f2 == false)
                break;

        }
        return answer;
    }

}
