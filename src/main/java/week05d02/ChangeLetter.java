package week05d02;

public class ChangeLetter {

    private static final String VOWELS = "aeiou";

    public String changeVowels(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < VOWELS.length(); i++) {
            if (string.contains(VOWELS.substring(i, i + 1))) {
                string = string.replace(VOWELS.charAt(i), '*');
            }
        }
        return string;
    }
}
