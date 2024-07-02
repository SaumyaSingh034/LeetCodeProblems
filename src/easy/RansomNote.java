package easy;

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args){
        String ransomNote = "aa";
        String magazine = "aab";
        canConstruct(ransomNote,magazine);
    }

    private static void canConstruct(String ransomNote, String magazine) {
        char[] str1 = ransomNote.toCharArray();
        char[] str2 = magazine.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        if((Arrays.toString(str1).contains(Arrays.toString(str2)) )|| (ransomNote.contains(magazine)))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
