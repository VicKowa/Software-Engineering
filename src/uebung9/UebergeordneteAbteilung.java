package uebung9;

public class UebergeordneteAbteilung extends AbstractAbteilungComposite{

    public UebergeordneteAbteilung(final String name) {
        super(name);
    }

    @Override
    public void printName() {
        abteilungen.forEach(Abteilung::printName);
        System.out.println(name);
    }
}
