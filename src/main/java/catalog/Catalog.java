package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String regNumber) {
        CatalogItem itemToRemove = null;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(regNumber)) {
                itemToRemove = catalogItem;
            }
        }
        catalogItems.remove(itemToRemove);
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                printedItems.add(catalogItem);
            }
        }
        return printedItems;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audioItems.add(catalogItem);
            }
        }
        return audioItems;
    }

    public int getAllPageNumber() {
        int sumOfPages = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                sumOfPages += catalogItem.numberOfPagesAtOneItem();
            }
        }
        return sumOfPages;
    }

    public int getFullLength() {
        int sumOfLengths = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                sumOfLengths += catalogItem.fullLengthAtOneItem();
            }
        }
        return sumOfLengths;
    }

    public double averagePageNumberOver(int over) {
        if (over <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        if (over >= getAllPageNumber()) {
            throw new IllegalArgumentException("No page");
        }
        int sumOfPages = 0;
        int counter = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature() && catalogItem.numberOfPagesAtOneItem() > over) {
                sumOfPages += catalogItem.numberOfPagesAtOneItem();
                counter++;
            }
        }
        return (double) sumOfPages / counter;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        if (searchCriteria.hasTitle() && searchCriteria.hasContributor()) {
            return searchByBoth(searchCriteria);
        }
        if (searchCriteria.hasTitle()) {
            return searchByTitle(searchCriteria);
        }
        if (searchCriteria.hasContributor()) {
            return searchByContributor(searchCriteria);
        }
        return null;
    }

    private List<CatalogItem> searchByBoth(SearchCriteria searchCriteria) {
        List<CatalogItem> foundItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getContributors().contains(searchCriteria.getContributor())
                    && catalogItem.getTitles().contains(searchCriteria.getTitle())) {
                foundItems.add(catalogItem);
            }
        }
        return foundItems;
    }

    private List<CatalogItem> searchByTitle(SearchCriteria searchCriteria) {
        List<CatalogItem> foundItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getTitles().contains(searchCriteria.getTitle())) {
                foundItems.add(catalogItem);
            }
        }
        return foundItems;
    }

    private List<CatalogItem> searchByContributor(SearchCriteria searchCriteria) {
        List<CatalogItem> foundItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getContributors().contains(searchCriteria.getContributor())) {
                foundItems.add(catalogItem);
            }
        }
        return foundItems;
    }
}
