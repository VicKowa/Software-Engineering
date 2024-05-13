package uebung4.businesslogic;

import java.io.Serializable;

public abstract class USPart implements Serializable {
    private final int id;
    private final String description;

    public USPart(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if(this.description == null)
            return "keine";
        return "ID: " + this.id + " Beschreibung: " + this.description;
    }
}
