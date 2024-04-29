package uebung2.businesslogic;

public class CardboxStorageException extends Exception {
    // kann man das noch schöner machen?
    // bzw. wann müssen wir die Exception immer werfen

    public CardboxStorageException(String message) {
        super("Fehler: " + message);
    }
}
