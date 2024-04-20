package uebung2.businesslogic;

public abstract class AbstractPersonCard implements PersonCard
{
    private static int nextId = 1;

    private final String firstName;
    private final String lastName;
    private final int id;

    /**
     *
     * Constructor for the AbstractPersonCard class
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     */
    public AbstractPersonCard(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = nextId++;
    }

    /**
     *
     * <h1>Sollte nur zum Testen benutzt werden</h1>
     *
     * Constructor for the AbstractPersonCard class
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param id the id of the person
     */
    public AbstractPersonCard(String firstName, String lastName, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        nextId = Math.max(nextId, id + 1);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return "ID = " + id + ", Vorname = " + firstName + " Nachname = " + lastName;
    }
}
