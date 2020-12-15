package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable {

    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        boolean hasTask;
        do {
            hasTask = nextStep();
        } while (hasTask);
    }

    private boolean nextStep() {
        int lastItemIndex = tasks.size() - 1;
        if (lastItemIndex >= 0) {
            tasks.remove(lastItemIndex);
        }
        return !tasks.isEmpty();
    }
}
