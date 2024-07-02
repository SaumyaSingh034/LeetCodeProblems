package medium;

public class ReverseString {

    public static void main(String[] args) {
        String word = "the sky is blue";
        System.out.println(reverseString(word));
        String word1 = "  hello world  ";
        System.out.println(reverseString(word1));
        String word2 = "a good   example";
        System.out.println(reverseString(word2));

    }

    private static String reverseString(String word) {
        String[] str = word.trim().split("\\s+");
        String reverse ="";
        for(int i= str.length-1; i>0; i--){
            reverse+=str[i]+" ";
        }
        return reverse+str[0];
    }
}
