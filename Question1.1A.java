/*  Chapter 1 Arrays and Strings
    1.1 Is Unique:
    Implement an algorithm to determine if a string has all unique characters. 
    What if you cannot use additional data structures?
    Hints:
    #44 Try a hash table.
    #117 Could a bit vector be useful?
    #132 Can you solve it in O(NlogN) time? What might a solution like that look like?  */
    
/*  The very first thing you should ask the interviewer is if the string is an ASCII string or
    a Unicode string. */
    
public class Main {
    public static boolean isUniqueChar(String str){
        if (str.length()>128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"I","love","apple","and","pineapple"};
        for (String word: words) {
            System.out.println(word + ": " + isUniqueChar(word));
        }
    }
}
