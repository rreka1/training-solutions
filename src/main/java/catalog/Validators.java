package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String string) {
        return (string == null || string.isEmpty() || string.isBlank());
    }

    public static boolean isEmpty(List<String> list) {
        return (list == null || list.isEmpty());
    }
}
