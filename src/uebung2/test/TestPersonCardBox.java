package uebung2.test;

import org.junit.jupiter.api.*;
import uebung2.businesslogic.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestPersonCardBox {

    private static CardBox cardBox;

    @BeforeAll
    static void setUp() {
        cardBox = new CardBox();
    }

    @Test
    @Order(1)
    void testSizeEmpty() {
        Assertions.assertEquals(0, cardBox.size());
    }

    @Test
    @Order(2)
    void testAddDeveloperCards() throws CardboxException {
        cardBox.addPersonCard(new DeveloperCard("Max", "Mustermann", true));
        cardBox.addPersonCard(new DeveloperCard("Erika", "Musterfrau", false));
        Assertions.assertEquals(2, cardBox.size());
    }

    @Test
    @Order(3)
    void testAddEnduserCards() throws CardboxException {
        cardBox.addPersonCard(new EnduserCard("Hans", "Dampf", true));
        cardBox.addPersonCard(new EnduserCard("Gretel", "Dampf", false));
        Assertions.assertEquals(4, cardBox.size());
    }


    @Test
    @Order(4)
    void testDeletePersonCard() {

        String res;

        res = cardBox.deletePersonCard(2);
        Assertions.assertEquals(3, cardBox.size());
        Assertions.assertEquals("Karte mit der ID 2 wurde gelöscht", res);

        res = cardBox.deletePersonCard(2);
        Assertions.assertEquals(3, cardBox.size());
        Assertions.assertEquals("Karte mit der ID 2 wurde nicht gefunden", res);
    }

    @Test
    @Order(5)
    void testAddExistingCard() {
        Assertions.assertThrows(CardboxException.class, () ->
            cardBox.addPersonCard(new DeveloperCard("Max", "Mustermann", 1, true)));
    }

    @Test
    @Order(6)
    void testShowContent() {
        cardBox.showContent();
    }

}
