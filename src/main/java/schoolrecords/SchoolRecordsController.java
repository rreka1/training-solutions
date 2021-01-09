package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private ClassRecords classRecords;
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void initSchool() {
        classRecords = new ClassRecords("NEWCLASS", new Random());
        subjects.addAll(Arrays.asList(new Subject("földrajz"),
                new Subject("matematika"),
                new Subject("biológia"),
                new Subject("zene"),
                new Subject("fizika"),
                new Subject("kémia")));

        tutors.add(new Tutor("oktato",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia"))));
    }

    public void printMenu() {
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }

    public void runMenu() {
        int num = scanner.nextInt();
        scanner.nextLine();
        while (num != 11) {
            switch (num) {
                case 1:
                    printStudentNames_1();
                    break;
                case 2:
                    searchStudentByName_2();
                    break;
                case 3:
                    addNewStudent_3();
                    break;
                case 4:
                    deleteStudent_4();
                    break;
                case 5:
                    repetition_5();
                    break;
                case 6:
                    calculateClassAverage_6();
                    break;
                case 7:
                    calculateAverageBySubjects_7();
                    break;
                case 8:
                    printStudyResults_8();
                    break;
                case 9:
                    printAverageByName_9();
                    break;
                case 10:
                    printAverageByNameAndSubject_10();
                    break;
            }
            printMenu();
            num = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private void printStudentNames_1() {
        System.out.println("Diákok: " + classRecords.listStudentNames());
    }

    private void searchStudentByName_2() {
        System.out.println("Diák neve:");
        System.out.println(classRecords.findStudentByName(scanner.nextLine()));
    }

    private void addNewStudent_3() {
        System.out.println("Diák neve:");
        classRecords.addStudent(new Student(scanner.nextLine()));
    }

    private void deleteStudent_4() {
        System.out.println("Diák neve:");
        classRecords.removeStudent(classRecords.findStudentByName(scanner.nextLine()));
    }

    private void repetition_5() {
        Student student = classRecords.repetition();
        System.out.println("Diák kiválasztva: " + student.getName());
        System.out.println("Tantárgy:");
        Subject subject = findSubjectByName(scanner.nextLine());
        System.out.println("Érdemjegy:");
        String markType = scanner.nextLine();
        System.out.println("Oktató neve:");
        Tutor tutor = findTutorByName(scanner.nextLine());
        student.grading(new Mark(markType, subject, tutor));
        System.out.println("Feleltetés eredménye rögzítve!");
    }

    private void calculateClassAverage_6() {
        System.out.println("Osztályátlag: " + classRecords.calculateClassAverage());
    }

    private void calculateAverageBySubjects_7() {
        System.out.println("Tantárgy: ");
        String subjectName = scanner.nextLine();
        Subject subject = findSubjectByName(subjectName);
        double averageBySubject = classRecords.calculateClassAverageBySubject(subject);
        System.out.println("Tantárgyi átlag " + "(" + subjectName + "): " + averageBySubject);
    }

    private void printStudyResults_8() {
        List<StudyResultByName> results = classRecords.listStudyResults();
        for (StudyResultByName result : results) {
            System.out.println(result.toString());
        }
    }

    private void printAverageByName_9() {
        System.out.println("Diák neve: ");
        System.out.println(classRecords.findStudentByName(scanner.nextLine()).calculateAverage());
    }

    private void printAverageByNameAndSubject_10() {
        System.out.println("Diák neve: ");
        String studentName = scanner.nextLine();
        System.out.println("Tantárgy: ");
        Subject subject = findSubjectByName(scanner.nextLine());
        System.out.println("Átlag: " + classRecords.findStudentByName(studentName).calculateSubjectAverage(subject));
    }

    private Subject findSubjectByName(String subjectName) {
        for (Subject subject : subjects) {
            if (subject.getSubjectName().equals(subjectName)) {
                return subject;
            }
        }
        return null;
    }

    private Tutor findTutorByName(String tutorName) {
        for (Tutor tutor : tutors) {
            if (tutor.getName().equals(tutorName)) {
                return tutor;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();
        schoolRecordsController.printMenu();
        schoolRecordsController.runMenu();
    }
}
