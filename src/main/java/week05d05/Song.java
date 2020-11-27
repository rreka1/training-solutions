package week05d05;

public class Song {

    private String name;
    private long lengthInSeconds;
    private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        if (isEmpty(name) || isEmpty(artist)) {
            throw new IllegalArgumentException("Song name and artist must not be empty or null!");
        }
        if (lengthInSeconds <= 0) {
            throw new IllegalArgumentException("Song length must be greater than 0 sec! " + lengthInSeconds);
        }
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.isBlank();
    }

    @Override
    public String toString() {
        return "Song name: " + name + ", artist: " + artist + ", length: " + lengthInSeconds + " s";
    }
}
