package week04;

import java.util.ArrayList;
import java.util.List;

public class GetIndexesOfChar {

    static List<Integer> getIndexesOgChar(String str, char c) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getIndexesOgChar("ketchup", 'e'));
        System.out.println(getIndexesOgChar("almafa", 'a'));
        System.out.println(getIndexesOgChar("kefe", 'e'));
    }
}
