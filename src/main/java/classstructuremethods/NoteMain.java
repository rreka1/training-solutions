package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.print("Név: ");
        note.setName(scanner.nextLine());

        System.out.print("Téma: ");
        note.setTopic(scanner.nextLine());

        System.out.print("Szöveg: ");
        note.setText(scanner.nextLine());

        String noteText = note.getNoteText();
        System.out.println(noteText);

    }
}
