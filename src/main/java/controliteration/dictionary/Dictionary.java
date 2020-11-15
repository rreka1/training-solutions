package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations) {
        //új fordításokat lehet felvenni
        //ha az adott szó már szerepel akkor nem lehet felvenni mégegyszer
        if(!dictionaryItems.contains(word)) {
            dictionaryItems.add(new DictionaryItem(word, translations));
        }
        for(DictionaryItem item : dictionaryItems) {
            if(item.getWord().equals(word)) {
                item.addTranslations(translations);
            }
        }
    }

    public List<String> findTranslations(String word) {
        //visszaadja a paraméterül kapott szó fordításait
        //ha nem találja a szót, üres listával tér vissza
        for(DictionaryItem item : dictionaryItems) {
            if(item.getWord().equals(word)) {
                return item.getTranslations();
            }
        }
        return List.of("");
    }
}
