package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        //Összefűzés
        System.out.println(1 + "" + 2);
        System.out.println("" + 1 + 2);
        String x = "1";
        String y = "2";
        System.out.println(x+y);

        //Osztás
        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3.0 / 4.0;
        System.out.println(quotient);

        //Nagy szám
        long big = 3_244_444_444L;

        //Karakterkódolás
        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        //String mint objektum
        String word = "title".toUpperCase();
        System.out.println(word);

        //Szám bináris stringként
        System.out.println(Integer.toString(1, 2));
        System.out.println(Integer.toString(-2, 2));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
