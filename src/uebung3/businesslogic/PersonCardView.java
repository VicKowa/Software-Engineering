package uebung3.businesslogic;

import java.util.List;

public class PersonCardView {

    public void showContent(List<PersonCard> list) {
        for (PersonCard personCard : list) {
            System.out.println(personCard.toString());
        }
    }
}
