package uebung9;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        UebergeordneteAbteilung ab = new UebergeordneteAbteilung("AB");
        UebergeordneteAbteilung ab3 = new UebergeordneteAbteilung("AB-3");
        UebergeordneteAbteilung ab4 = new UebergeordneteAbteilung("AB-4");

        ab.addComponent(ab3);
        ab.addComponent(ab4);

        UntergeordneteAbteilung ab30 = new UntergeordneteAbteilung("AB-30");
        UntergeordneteAbteilung ab31 = new UntergeordneteAbteilung("AB-31");

        ab3.addComponent(ab30);
        ab3.addComponent(ab31);

        UntergeordneteAbteilung ab40 = new UntergeordneteAbteilung("AB-40");
        UntergeordneteAbteilung ab41 = new UntergeordneteAbteilung("AB-41");

        ab4.addComponent(ab40);
        ab4.addComponent(ab41);

        Stream<Abteilung> abteilungen = Stream.of(ab);
        abteilungen.forEach(Abteilung::printName);
    }
}
