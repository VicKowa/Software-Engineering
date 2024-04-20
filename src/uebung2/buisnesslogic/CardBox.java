package uebung2.buisnesslogic;

import java.util.LinkedList;
import java.util.List;

public class CardBox {
    private final List<PersonCard> cards;

    /**
     * Constructor for the CardBox class
     */
    public CardBox(){
        this.cards = new LinkedList<>();
    }

    /**
     *
     * Constructor for the CardBox class
     * @param card the card to add
     * @throws CardboxException if the card is already in the CardBox
     */
    public void addPersonCard(PersonCard card) throws CardboxException{
        for (PersonCard personCard : cards) {
            if (personCard.getId() == card.getId()) {
                throw new CardboxException(card.getId());
            }
        }
        cards.add(card);
    }

    /**
     *
     * Constructor for the CardBox class
     * @param id the id of the card to delete
     * @return Returns a string with the result of the deletion
     */
    public String deletePersonCard(int id){

        for (PersonCard personCard : cards) {
            if (personCard.getId() == id) {
                cards.remove(personCard);
                return "Karte mit der ID " + id + " wurde gelöscht";
            }
        }
        return "Karte mit der ID " + id + " wurde nicht gefunden";
    }

    /**
     *
     * Shows the content of the CardBox
     */
    public void showContent(){
        for (PersonCard personCard : cards) {
            System.out.println(personCard.toString());
        }
    }

    /**
     *
     * @return Returns the size of the CardBox
     */
    public int size(){
        return cards.size();
    }
}
