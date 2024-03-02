class Solution {
    public String mergeAlternately(String word1, String word2) {

        int pointer1 = 0;
        int pointer2 = word1.length();

        String word = word1 + word2;

        List<Character> listChar = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {

            if (pointer1 < word1.length() && pointer2 < word.length()) {
                listChar.add(word.charAt(pointer1));
                listChar.add(word.charAt(pointer2));
                pointer1++;
                pointer2++;
            }
            

            else if (pointer1 < word1.length() ){
                listChar.add(word.charAt(pointer1));
                pointer1++;
            }
            
            
            else if (pointer2 < word.length()){
                listChar.add(word.charAt(pointer2));
                pointer2++;
            }
            
        }

        StringBuilder result = new StringBuilder(listChar.size());
        for (Character c : listChar) {
            result.append(c);
        }

        return result.toString();

    }
}
