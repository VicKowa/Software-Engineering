package uebung9;

public class UntergeordneteAbteilung implements Abteilung{

    private final String name;

    public UntergeordneteAbteilung(final String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }
}
