package uebung9;

import java.util.ArrayList;
import java.util.List;

public class AbstractAbteilungComposite implements Abteilung{

    protected List<Abteilung> abteilungen = new ArrayList<>();
    protected final String name;

    public AbstractAbteilungComposite(final String name) {
        this.name = name;
    }

    @Override
    public void printName() {
       //System.out.println(name);
        System.out.println(getClass().getSimpleName());
    }

    void addComponent(Abteilung abteilung) {
        abteilungen.add(abteilung);
    }

    void removeComponent(Abteilung abteilung) {
        abteilungen.remove(abteilung);
    }

}
