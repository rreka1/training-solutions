package week15d02.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class QuestionBank {

    private final List<QuestionData> questions = new ArrayList<>();

    public void readQuestionsFromFile(BufferedReader reader) {
        try {
            processLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public List<String> findQuestionsByTopic(String topic) {
        List<String> result = new ArrayList<>();
        for (QuestionData questionData : questions) {
            if (questionData.getTopic().equalsIgnoreCase(topic)) {
                result.add(questionData.getQuestion());
            }
        }
        return result;
    }

    public QuestionData getRandomQuestion() {
        int rnd = new Random().nextInt(questions.size());
        return questions.get(rnd);
    }

    public Map<String, List<QuestionData>> sortQuestionsByTopic() {
        Map<String, List<QuestionData>> result = new HashMap<>();
        for (QuestionData questionData : questions) {
            String topic = questionData.getTopic();
            if (!result.containsKey(topic)) {
                result.put(topic, new ArrayList<>());
            }
            result.get(topic).add(questionData);
        }
        return result;
    }

    public String findMaxPointTopic() {
        String result = null;
        int max = Integer.MIN_VALUE;
        Map<String, List<QuestionData>> sortedQuestions = sortQuestionsByTopic();
        for (String topic : sortedQuestions.keySet()) {
            int points = calculateSumPoints(sortedQuestions.get(topic));
            if(points > max) {
                max = points;
                result = topic;
            }
        }
        return result;
    }

    private int calculateSumPoints(List<QuestionData> questions) {
        int points = 0;
        for (QuestionData questionData : questions) {
            points += questionData.getPoint();
        }
        return points;
    }

    private void processLines(BufferedReader reader) throws IOException {
        String question;
        while ((question = reader.readLine()) != null) {
            String[] data = reader.readLine().split(" ");
            questions.add(new QuestionData(data[2], question, data[0], Integer.parseInt(data[1])));
        }
    }

    public static void main(String[] args) {
        QuestionBank questionBank = new QuestionBank();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("kerdesek.txt"))) {
            //0.
            questionBank.readQuestionsFromFile(reader);
            System.out.println(questionBank.questions);
            //1.
            System.out.println(questionBank.findQuestionsByTopic("matematika"));
            //2.
            System.out.println(questionBank.getRandomQuestion());
            //3.
            System.out.println(questionBank.sortQuestionsByTopic());
            //4.
            System.out.println(questionBank.findMaxPointTopic());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
