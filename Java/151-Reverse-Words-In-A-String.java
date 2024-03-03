import java.util.*;

class Solution {
    public String reverseWords(String s) {

        List<String> list = new ArrayList<>();

        StringTokenizer trimS = new StringTokenizer(s.trim(), " ");

        while(trimS.hasMoreTokens()) {
            list.add(trimS.nextToken());
        }

        String result = "";

        for (int i = list.size()-1; i >= 0; i--) {
            result += list.get(i); 
            result += " "; 
        }

        return result.trim();

    }
}
