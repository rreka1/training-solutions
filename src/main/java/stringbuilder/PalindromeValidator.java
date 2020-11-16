package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        if(word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        StringBuilder sb = new StringBuilder(word);
        if(word.isBlank()) {
            return true;
        }
        return sb.reverse().toString().equalsIgnoreCase(word);
    }
}
