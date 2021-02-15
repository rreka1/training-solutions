package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        try (bufferedReader) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                for (int i = 0; i < number; i++) {
                    sb.append('*');
                }
                sb.append("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return sb.toString();
    }
}
