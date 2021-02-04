package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void writeWords(List<String> list, Writer writer) {
        PrintWriter printWriter = new PrintWriter(writer);
        for (String string : list) {
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(string.length());
        }
    }

    public String writeWithStringWriter(List<String> words) {
        StringWriter stringWriter = new StringWriter();
        try (stringWriter) {
            writeWords(words, stringWriter);
            return stringWriter.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }
}
