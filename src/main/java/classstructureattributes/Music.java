package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.print("Cím: ");
        song.title = scanner.nextLine();

        System.out.print("Szerző: ");
        song.band = scanner.nextLine();

        System.out.print("Hossz (mp): ");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " mp)");
    }
}
