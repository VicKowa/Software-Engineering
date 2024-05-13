package uebung4.businesslogic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//fürs Speichern und laden
public class Story extends USPart {

    private final String prio;
    private final List<Task> tasks;

    public Story(int id, String description, String prio) {
        super(id, description);
        this.prio = prio;
        this.tasks = new LinkedList<>();
    }


    public void assignTask(Task task) {
        tasks.add(task);
    }

    // Only for testing purposes
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return super.toString() + " Prio: " + prio + "\nZugeordnete Tasks:\n" + getTasksToString();
    }

    private String getTasksToString() {
        if(tasks.isEmpty())
            return "keine";

        StringBuilder sb = new StringBuilder();
        for(Task task : tasks) {
            sb.append(task.toString()).append("\n");
        }
        return sb.toString();
    }
}
