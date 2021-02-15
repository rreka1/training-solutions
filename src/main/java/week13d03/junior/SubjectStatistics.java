package week13d03.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectStatistics {

    private List<Subject> data = new ArrayList<>();

    public void readFromFile(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String[] block = new String[4];
            while ((block[0] = br.readLine()) != null) {
                data.add(processBlock(br, block));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong!", ioe);
        }
    }

    private Subject processBlock(BufferedReader br, String[] block) throws IOException {
        for (int i = 1; i < 4; i++) {
            block[i] = br.readLine();
        }
        return new Subject(block[0], block[1], block[2], Integer.parseInt(block[3]));
    }

    public int sumHours(String teacherName) {
        int sum = 0;
        for (Subject subject : data) {
            if (subject.getTeacherName().equals(teacherName)) {
                sum += subject.getNumOfLessons();
            }
        }
        return sum;
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
