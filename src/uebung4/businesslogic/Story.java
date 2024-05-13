package uebung4.businesslogic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//fürs Speichern und laden
public class Story extends USPart {

    private final String prio;
    //findest du die HashMap eine gute Idee, so kann man halt mit der Idee in O(1) auf
    // die Task zugreifen
    //alternativ ginge auch arraylist aber
    //nvm arraylist ist besser da kann man auch direkt mit der ID arbeiten und ich glaube hasmap mag der nicht so
    //private HashMap<Integer, Task> tasks;
    private final List<Task> tasks;

    public Story(int id, String description, String prio) {
        super(id, description);
        this.prio = prio;
        this.tasks = new LinkedList<>();
    }

    //oder assign nur über die ID, bedeutet man speichert nicht die Taskobjekte, sondern nur die Taskids, welche der Story zugeordnet sind
    public void assignTask(Task task) {
        tasks.add(task);
    }

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
