package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args){
        String[] strs = {"flower","flight","flow"};
        String word = longestCommonPrefix1(strs);
        System.out.println("Longest Common Prefix Word: "+word);
        String[] strs1 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs1) +" Longest prefix");
    }

    private static String longestCommonPrefix(String[] strs) {
        String word = "";
        String nextWord = "";
        char[] ch = strs[0].toCharArray();
        for(char c : ch){
            nextWord = word + c;
            if(strs[1].contains(nextWord)) {
                 if(strs[2].contains(nextWord)){
                    word = nextWord;
                }
            }
        }
        return word;
    }
//Optimize Solution
    private static String longestCommonPrefix1(String[] strs){
        Arrays.sort(strs);
        String first = strs[0];
        for(int j=0;j< first.length();j++) {
            for(int i=0;i< strs.length;i++){
                if(first.charAt(j)!=strs[i].charAt(j))
                    return first.substring(0,j);
            }
        }
        return strs[0];
    }
}
