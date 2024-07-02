package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDifference {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        String y = "";
        String q = "y";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        if(t.length()>s.length())
        {
            s=s+" ";
        }
        char result='r';
        char[] x=s.toCharArray();
        char[] y=t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<t.length();i++)
        {
            if(x[i]==y[i])
            {
                continue;
            }
            else
            {
                result=y[i];
            }
        }
        return result;
    }
}
