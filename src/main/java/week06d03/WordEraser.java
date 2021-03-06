package week06d03;

/* Junior
 * A WordEraser osztályban legyen egy eraseWord(String words, String word) metódus,
 * mely az első paraméter szöveget úgy változtatja meg,
 * hogy a második paraméter összes előforulását kitörli belőle.
 * A words paraméterben a szavak szóközzel vannak elválasztva.
 * A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
 * (Mellőzzük a replace és replaceAll használatát!)
 * */

public class WordEraser {

    public String eraseWord(String words, String word) {
        StringBuilder sb = new StringBuilder();
        String[] parts = words.split(" ");
        boolean first = true;
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].equals(word)) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(parts[i]);
                first = false;
            }
        }
        return sb.toString();
    }
}
