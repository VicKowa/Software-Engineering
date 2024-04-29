package uebung2.client;

import uebung2.businesslogic.*;


public class Client {

    public static void main(String[] args) throws CardboxException {
        CardBox cbox = CardBox.getInstance();
        PersonCardView personCardView = new PersonCardView();

        cbox.addPersonCard(new DeveloperCard("Lara", "Stein", true));
        cbox.addPersonCard(new EnduserCard("Leo", "Baum", false));
        cbox.addPersonCard(new EnduserCard("Maria", "Zahn", true));
        cbox.addPersonCard(new EnduserCard("Siegfried", "Laus", false));

        personCardView.showContent(cbox.getCurrentList());

    }
}
