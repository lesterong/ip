import java.time.LocalDate;

public abstract class Task {
    private final String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void markAsDone() {
        this.isCompleted = true;
    }

    public void markAsUndone() {
        this.isCompleted = false;
    }

    public String getStatus() {
        return isCompleted ? "X" : " ";
    }

    public String getDescription() {
        return this.description;
    }

    public abstract String getType();

    public abstract boolean isEqualDate(LocalDate date);

    @Override
    public String toString() {
        return String.format("[%s][%s] %s", this.getType(), this.getStatus(), this.getDescription());
    }
}
