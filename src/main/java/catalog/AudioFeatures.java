package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> composer = new ArrayList<>();
    private List<String> performers;

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title must not be empty or null!");
        }
        if (length < 0) {
            throw new IllegalArgumentException("Length must be 0 or positive!");
        }
        if (Validators.isEmpty(performers) || Validators.isEmpty(composer)) {
            throw new IllegalArgumentException("Performers and composer must not be empty or null!");
        }
        this.title = title;
        this.length = length;
        this.composer = composer;
        this.performers = performers;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title must not be empty or null!");
        }
        if (length < 0) {
            throw new IllegalArgumentException("Length must be 0 or positive!");
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers must not be empty or null!");
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        contributors.addAll(performers);
        contributors.addAll(composer);
        return contributors;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
