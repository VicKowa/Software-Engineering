package uebung1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uebung1.buisnesslogic.RomanNumberTransformer;
import uebung1.buisnesslogic.TransformerFactory;

class TestRomanNumberTransformer {

    RomanNumberTransformer transf;

    @BeforeEach
    void init() {
        transf = TransformerFactory.getRomanNumberTransformer();
    }

    @Test
    void TestRomanNumbers() {

//        GermanFormatNumberTransformer ger = new GermanFormatNumberTransformer();
//        String res = ger.transformNumber(1234);
//        System.out.println(res);
        String error = "Fehler: ungültiger Wertebereich";

        //Testcode
        //1. Äquivalenzklasse
        //Testcase 1
        Assertions.assertEquals("I", transf.transformNumber(1));
        //Testcase 2
        Assertions.assertEquals("MD", transf.transformNumber(1500));
        //Testcase 3
        Assertions.assertEquals("MMM", transf.transformNumber(3000));

        //2. Äquivalenzklasse
        //Testcase 4
        Assertions.assertEquals(error, transf.transformNumber(0));
        //Testcase 5
        Assertions.assertEquals(error, transf.transformNumber(-23453));
        //Testcase 6
        Assertions.assertEquals(error, transf.transformNumber(Integer.MIN_VALUE));

        //3. Äquivalenzklasse
        //Testcase 7
        Assertions.assertEquals(error, transf.transformNumber(3001));
        //Testcase 8
        Assertions.assertEquals(error, transf.transformNumber(345632));
        //Testcase 9
        Assertions.assertEquals(error, transf.transformNumber(Integer.MAX_VALUE));
    }

}
