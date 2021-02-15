package week13d03.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class School {

    List<Teacher> teachersWithHours = new ArrayList<>();

    public void saveTeachersFromFile(BufferedReader bufferedReader) {
        try {
            String name;
            while ((name = bufferedReader.readLine()) != null) {
                skipTwoLine(bufferedReader);
                int hour = Integer.parseInt(bufferedReader.readLine());
                teachersWithHours.add(new Teacher(name, hour));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public int sumHours(String teacherName) {
        int sum = 0;
        for (Teacher teacher : teachersWithHours) {
            if (teacher.getName().equals(teacherName)) {
                sum += teacher.getHour();
            }
        }
        return sum;
    }

    private void skipTwoLine(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
        bufferedReader.readLine();
    }

    public static void main(String[] args) {
        School school = new School();
        Path path = Path.of("beosztas.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            school.saveTeachersFromFile(bufferedReader);
            System.out.println(school.sumHours("Albatrosz Aladin"));
            System.out.println(school.sumHours("Antilop Anett"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
