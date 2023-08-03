package ListInterface.Basic;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasksList;

    public TaskList() {
        this.tasksList = new ArrayList<Task>();
    }

    public void addTask(String description) {
        tasksList.add(new Task(description));
    }

    public void removeTasks(String description) {
        List<Task> tasksToRemove = new ArrayList<Task>();
        for (Task t : tasksList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(t);
<<<<<<< HEAD
=======
                tasksList.remove(t);
>>>>>>> 6cd2e54 (Operações básicas da collection List)
            }
        }

        tasksList.removeAll(tasksToRemove);
    }

    public int findAllTasks() {
        return tasksList.size();
    }

    public void findAllDescriptions() {
        System.out.println(tasksList);
    }
}
