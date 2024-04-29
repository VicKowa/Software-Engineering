package uebung3.test;

import org.junit.jupiter.api.*;
import uebung3.businesslogic.*;

import java.io.File;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestPersonCardBox {

    private static CardBox cardBox;

    @BeforeAll
    static void setUp() {
        cardBox = CardBox.getInstance();
    }

    @Test
    @Order(1)
    void testSizeEmpty() {
        Assertions.assertEquals(0, cardBox.size());
    }

    @Test
    @Order(2)
    void testLoadCardsWithNoFile() {
        Assertions.assertThrows(CardboxStorageException.class, () -> cardBox.load(),"keine Datei zum Laden");
    }

    @Test
    @Order(3)
    void testSaveEmptyCards() {
        Assertions.assertThrows(CardboxStorageException.class, () -> cardBox.save(), "Cardbox ist leer -> No save");
    }

    @Test
    @Order(3)
    void testAddDeveloperCards() throws CardboxException {
        cardBox.addPersonCard(new DeveloperCard("Max", "Mustermann", true));
        cardBox.addPersonCard(new DeveloperCard("Erika", "Musterfrau", false));
        Assertions.assertEquals(2, cardBox.size());
    }

    @Test
    @Order(4)
    void testAddEnduserCards() throws CardboxException {
        cardBox.addPersonCard(new EnduserCard("Hans", "Dampf", true));
        cardBox.addPersonCard(new EnduserCard("Gretel", "Dampf", false));
        Assertions.assertEquals(4, cardBox.size());
    }


    @Test
    @Order(5)
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
    @Order(6)
    void testAddExistingCard() {
        Assertions.assertThrows(CardboxException.class, () ->
            cardBox.addPersonCard(new DeveloperCard("Max", "Mustermann", 1, true)));
        Assertions.assertEquals(3, cardBox.size());
    }

//    @Test
//    @Order(6)
//    void testShowContent() {
//        cardBox.showContent();
//    }
    @Test
    @Order(7)
    void testSaveExistingCards() throws CardboxStorageException {
        cardBox.save();
        Assertions.assertTrue(new File("CardboxObjects.ser").exists(),"Datei nicht vorhanden");
    }

    @Test
    @Order(8)
    void testLoadCards() throws CardboxStorageException {
        cardBox.load();
        Assertions.assertEquals(3, cardBox.size());
    }

}
