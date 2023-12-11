public class Task implements Comparable<Task>
{
    private int priority;
    private String task;

    public Task(int priority, String task) {
        this.priority = priority;
        this.task = task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public int compareTo(Task o) {
        return priority - o.getPriority();
    }

    @Override
    public String toString()
    {
        return task + "(" + priority +")";
    }
}
