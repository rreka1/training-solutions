package week05d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayList {

    List<Song> songs = new ArrayList<>();

    public PlayList(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> findByLengthGreaterThan(int mins) {
        List<Song> returnValue = new ArrayList<>();
        for (Song song : songs) {
            if ((song.getLengthInSeconds() / 60) > mins) {
                returnValue.add(song);
            }
        }
        return returnValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Song song : songs) {
            sb.append(song.toString()).append(", ");
        }
        return sb.delete(sb.length() - 2, sb.length()).toString();
    }

    public static void main(String[] args) {
        Song song1 = new Song("a", 60, "a");
        Song song2 = new Song("b", 120, "b");
        Song song3 = new Song("c", 180, "c");
        Song song4 = new Song("d", 240, "d");
        List<Song> songs = new ArrayList<>();
        songs.addAll(Arrays.asList(song1, song2, song3, song4));
        PlayList playList = new PlayList(songs);

        System.out.println(playList.findByLengthGreaterThan(2).toString());
    }
}
