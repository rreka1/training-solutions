package week07d04;

import java.time.LocalDate;

public class Lab {

    private final String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        if (isEmpty(title)) {
            throw new IllegalArgumentException("Title must not be empty!");
        }
        this.title = title;
        this.completed = false;
        this.completedAt = null;
    }

    public Lab(String title, LocalDate completedAt) {
        if (isEmpty(title)) {
            throw new IllegalArgumentException("Title must not be empty!");
        }
        if (invalidDate(completedAt)) {
            throw new IllegalArgumentException("Invalid date! " + completedAt);
        }
        this.title = title;
        this.completed = true;
        this.completedAt = completedAt;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void complete(LocalDate date) {
        if (invalidDate(date)) {
            throw new IllegalArgumentException("Invalid date! " + date);
        }
        completed = true;
        completedAt = date;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDate.now();
    }

    @Override
    public String toString() {
        if (completed) {
            return title + ": completed at " + completedAt;
        } else {
            return title + ": not completed yet!";
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank() || str.isEmpty();
    }

    private boolean invalidDate(LocalDate date) {
        if (date.getYear() < 2010) {
            return true;
        }
        if (date.isAfter(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
