package week05d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayListTest {

    @Test
    public void testTindByLengthGreaterThan() {

        Song song1 = new Song("a", 60, "a");
        Song song2 = new Song("b", 120, "b");
        Song song3 = new Song("c", 180, "c");
        Song song4 = new Song("d", 240, "d");
        List<Song> songs = new ArrayList<>();
        songs.addAll(Arrays.asList(song1, song2, song3, song4));
        PlayList playList = new PlayList(songs);

        assertEquals(Arrays.asList(song3, song4), playList.findByLengthGreaterThan(2));
        assertEquals(Arrays.asList(song4), playList.findByLengthGreaterThan(3));
    }
}
