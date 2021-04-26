package week15d02.junior;

public class QuestionData {

    private final String topic;
    private final String question;
    private final String answer;
    private final int point;

    public QuestionData(String topic, String question, String answer, int point) {
        this.topic = topic;
        this.question = question;
        this.answer = answer;
        this.point = point;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Téma: ").append(topic).append(", ");
        sb.append("Kérdés: ").append(question).append(", ");
        sb.append("Válasz: ").append(answer).append(", ");
        sb.append("Pont: ").append(point);
        return sb.toString();
    }

    public String getTopic() {
        return topic;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoint() {
        return point;
    }
}
