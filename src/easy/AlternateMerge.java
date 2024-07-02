package easy;

public class AlternateMerge {

    public static void main(String[] args){
        String word1 = "abc";
        String word2 = "pqr";
        String word3 = "ab";
        String word4 = "pqrs";
        String word5 = "abcd";
        String word6 = "pq";


        mergeAlternately(word5, word6);
    }

    private static void mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        StringBuffer sb = new StringBuffer();
        int i=0,j=0;
        while(i < ch1.length || j< ch2.length){
                if(i<ch1.length)
                    sb.append(ch1[i++]);
                if(j<ch2.length)
                    sb.append(ch2[j++]);
        }
        System.out.println(sb);

    }
}
