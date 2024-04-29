package uebung3.businesslogic;

public class DeveloperCard extends AbstractPersonCard{
    private final boolean hasEnoughCoffee;

    /**
     *
     * Constructor for the DeveloperCard class
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param hasEnoughCoffee if the person has enough coffee
     */
    public DeveloperCard(String firstName, String lastName, boolean hasEnoughCoffee){
        super(firstName, lastName);
        this.hasEnoughCoffee = hasEnoughCoffee;
    }

    /**
     *
     * Constructor for the DeveloperCard class
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param id the id of the person
     * @param hasEnoughCoffee if the person has enough coffee
     */
    public DeveloperCard(String firstName, String lastName, int id, boolean hasEnoughCoffee){
        super(firstName, lastName, id);
        this.hasEnoughCoffee = hasEnoughCoffee;
    }

    public boolean hasEnoughCoffee(){
        return hasEnoughCoffee;
    }

    @Override
    public String toString() {
        return super.toString() + ", has enough coffee = " + hasEnoughCoffee;
    }
}
