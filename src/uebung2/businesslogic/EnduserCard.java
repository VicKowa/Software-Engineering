package uebung2.businesslogic;

public class EnduserCard extends AbstractPersonCard
{
    private final boolean isHungry;

    /**
     *
     * Constructor for the EnduserCard class
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param isHungry if the person is hungry
     */
    public EnduserCard(String firstName, String lastName, boolean isHungry)
    {
        super(firstName, lastName);
        this.isHungry = isHungry;
    }

    /**
     *
     * <h1>Sollte nur zum Testen benutzt werden</h1>
     *
     * Constructor for the EnduserCard class
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param id the id of the person
     * @param isHungry if the person is hungry
     */
    public EnduserCard(String firstName, String lastName, int id, boolean isHungry)
    {
        super(firstName, lastName, id);
        this.isHungry = isHungry;
    }

    public boolean isHungry()
    {
        return isHungry;
    }

    @Override
    public String toString() {
        return super.toString() + ", is hungry = " + isHungry;
    }
}
