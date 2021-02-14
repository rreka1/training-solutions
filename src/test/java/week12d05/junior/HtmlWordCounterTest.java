package week12d05.junior;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HtmlWordCounterTest {

    @Test
    public void testWordCounter() {
        HtmlWordCounter htmlWordCounter = new HtmlWordCounter();
        InputStream is = HtmlWordCounter.class.getResourceAsStream("/index.html");
        assertEquals(4, htmlWordCounter.wordCounter("covid", new BufferedReader(new InputStreamReader(is))));
    }

    @Test
    public void testWordCounter2() {
        HtmlWordCounter htmlWordCounter = new HtmlWordCounter();
        InputStream is = HtmlWordCounter.class.getResourceAsStream("/index.html");
        assertEquals(10, htmlWordCounter.wordCounter("koronavírus", new BufferedReader(new InputStreamReader(is))));
    }

    @Test
    public void testWordCounterWithString() {
        HtmlWordCounter htmlWordCounter = new HtmlWordCounter();
        String sample = "koronavírus\nalma\nkörte\nkoronavírus\nmeggy";
        assertEquals(2, htmlWordCounter.wordCounter("koronavírus", new BufferedReader(new StringReader(sample))));
    }

    @Test
    public void testWordCounterFromURL() {
        HtmlWordCounter htmlWordCounter = new HtmlWordCounter();
        try {
            URL url = new URL("https://index.hu");
            InputStream is = url.openStream();
            assertEquals(10, htmlWordCounter.wordCounter("koronavírus", new BufferedReader(new InputStreamReader(is))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}