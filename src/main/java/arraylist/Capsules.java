package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colors = new ArrayList<>();

    public void addLast(String s) {

        colors.add(s);
    }

    public void addFirst(String s) {

        colors.add(0, s);
    }

    public void removeFirst() {

        colors.remove(0);
    }

    public void removeLast() {

        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {

        return colors;
    }



    public static void main(String[] args) {

        Capsules capsules = new Capsules();

        capsules.addFirst("sárga");
        capsules.addFirst("piros");
        capsules.addFirst("zöld");

        System.out.println(capsules.getColors());

        capsules.addLast("kék");
        capsules.addLast("fehér");
        capsules.addLast("fekete");

        System.out.println(capsules.getColors());

        capsules.removeLast();

        System.out.println(capsules.getColors());

        capsules.removeFirst();

        System.out.println(capsules.getColors());



    }
}
