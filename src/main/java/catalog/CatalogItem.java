package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for (Feature feature : features) {
            this.features.add(feature);
        }
    }

    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        if (this.hasPrintedFeature()) {
            for (Feature feature : features) {
                if (feature instanceof PrintedFeatures) {
                    return ((PrintedFeatures) feature).getNumberOfPages();
                }
            }
        }
        return 0;
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        if (this.hasAudioFeature()) {
            for (Feature feature : features) {
                if (feature instanceof AudioFeatures) {
                    fullLength += ((AudioFeatures) feature).getLength();
                }
            }
        }
        return fullLength;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature : features) {
            contributors.addAll(feature.getContributors());
        }
        return contributors;
    }


    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature : features) {
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
