package uebung4.businesslogic;

import java.io.Serializable;

public class Task implements Serializable {
    private int id;
    private String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "Beschreibung: " + this.description;
    }
}
