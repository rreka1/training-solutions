package catalog;

public class SearchCriteria {

    public final String title;
    public final String contributor;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (Validators.isBlank(title) || Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Title and contributor must not be null or empty!");
        }
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title must not be null or empty!");
        }
        return new SearchCriteria(title, null);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Contributor must not be null or empty!");
        }
        return new SearchCriteria(null, contributor);
    }

    public boolean hasTitle() {
        return !Validators.isBlank(title);
    }

    public boolean hasContributor() {
        return !Validators.isBlank(contributor);
    }

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }
}
