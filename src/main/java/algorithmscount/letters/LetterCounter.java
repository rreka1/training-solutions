package algorithmscount.letters;

public class LetterCounter {

    public int countLetters(String string, char c) {
        int counter = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }
}
