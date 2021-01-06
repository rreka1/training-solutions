package exam02;

public class ArraySelector {

    public String selectEvens(int[] numbers) {
        StringBuilder sb = new StringBuilder("[");
        if (numbers.length == 0) {
            return "";
        }
        for (int i = 0; i < numbers.length; i = i + 2) {
            sb.append(numbers[i]).append(", ");
        }
        return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
    }
}
