package uebung4.businesslogic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//fürs Speichern und laden
public class Story extends Task {

    private String prio;
    //findest du die HashMap eine gute Idee, so kann man halt mit der Idee in O(1) auf
    // die Task zugreifen
    //alternativ ginge auch arraylist aber
    //nvm arraylist ist besser da kann man auch direkt mit der ID arbeiten und ich glaube hasmap mag der nicht so
    //private HashMap<Integer, Task> tasks;
    private List<Task> tasks;

    public Story(int id, String description, String prio) {
        super(id, description);
        this.prio = prio;
        this.tasks = new ArrayList<>();
    }

    //oder assign nur über die ID, bedeutet man speichert nicht die Taskobjekte, sondern nur die Taskids, welche der Story zugeordnet sind
    public void assignTask(Task task) {
        tasks.add(task.getId(), task);
    }

    @Override
    public String toString() {
        return super.toString() + " Prio: " + prio + "\n Zugeordnete Tasks: " + tasks.toString();
    }
}
