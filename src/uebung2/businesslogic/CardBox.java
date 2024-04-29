package uebung2.businesslogic;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CardBox implements Serializable {

    private List<PersonCard> cards;
    //Singleton Pattern
    private static CardBox instance;

    /**
     * Constructor for the CardBox class
     */
    private CardBox(){
        this.cards = new LinkedList<>();
    }

    public static CardBox getInstance() {
        if(instance == null) {
            instance = new CardBox();
        }
        return instance;
    }

    public void save() throws IOException, CardboxStorageException {

        if(cards.isEmpty()) {
            throw new CardboxStorageException("speichern");
        }
        // das hier ist ein try-with-Ressource Block der closed automatisch die streams am Ende
        try (FileOutputStream fos = new FileOutputStream("CardboxObjects.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(cards);
        }
    }

    @SuppressWarnings("unchecked")
    public void load() throws IOException, ClassNotFoundException {
        if(!cards.isEmpty()) {
            cards = null;
        }
        try(FileInputStream fis = new FileInputStream("CardboxObjects.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object temp = ois.readObject();
            if(temp instanceof List<?>) {
                cards = (List<PersonCard>) temp;
            }
        }

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

//    /**
//     *
//     * Shows the content of the CardBox
//     */
//    public void showContent(){
//        for (PersonCard personCard : cards) {
//            System.out.println(personCard.toString());
//        }
//    }


    public List<PersonCard> getCurrentList() {
        return cards;
    }

    /**
     *
     * @return Returns the size of the CardBox
     */
    public int size(){
        return cards.size();
    }
}
