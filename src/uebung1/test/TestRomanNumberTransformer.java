package uebung1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uebung1.buisnesslogic.RomanNumberTransformer;
import uebung1.buisnesslogic.TransformerFactory;

import static java.lang.Float.NaN;

class TestRomanNumberTransformer {

    RomanNumberTransformer transf;
    private final String error = "Fehler: ungültiger Wertebereich";
    @BeforeEach
    void init() {
        transf = TransformerFactory.getRomanNumberTransformer();
    }

    @Test
    void TestRomanNumbers() {

        uAek1(); //gültige Äquivalenzklasse1
        uAek2(); //ungültige Äquivalenzklasse2
        uAek3(); //ungültige Äquivalenzklasse3
        uAek4(); //ungültige Äquivalenzklasse4; Testcase 10 mit "ABC" -> Compilerfehler
    }



    private void uAek1() {
        //Testcode
        //1. Äquivalenzklasse
        //Testcase 1
        Assertions.assertEquals("MD", transf.transformNumber(1500));
        //Testcase 2
        Assertions.assertEquals("MMM", transf.transformNumber(3000));
        //Testcase 3
        Assertions.assertEquals("I", transf.transformNumber(1));
        //Testcase 4
        Assertions.assertEquals("II", transf.transformNumber(2));
        //Testcase 5
        Assertions.assertEquals("III", transf.transformNumber(3));
        //Testcase 6
        Assertions.assertEquals("IV", transf.transformNumber(4));
        //Testcase 7
        Assertions.assertEquals("V", transf.transformNumber(5));
        //Testcase 8
        Assertions.assertEquals("VI", transf.transformNumber(6));
        //Testcase 9
        Assertions.assertEquals("VII", transf.transformNumber(7));
        //Testcase 10
        Assertions.assertEquals("VIII", transf.transformNumber(8));
        //Testcase 11
        Assertions.assertEquals("IX", transf.transformNumber(9));
        //Testcase 12
        Assertions.assertEquals("X", transf.transformNumber(10));
        //Testcase 13
        Assertions.assertEquals("XL", transf.transformNumber(40));
        //Testcase 14
        Assertions.assertEquals("L", transf.transformNumber(50));
        //Testcase 15
        Assertions.assertEquals("XC", transf.transformNumber(90));
        //Testcase 16
        Assertions.assertEquals("C", transf.transformNumber(100));
        //Testcase 17
        Assertions.assertEquals("CD", transf.transformNumber(400));
        //Testcase 18
        Assertions.assertEquals("D", transf.transformNumber(500));
        //Testcase 19
        Assertions.assertEquals("CM", transf.transformNumber(900));
        //Testcase 20
        Assertions.assertEquals("M", transf.transformNumber(1000));

    }

    private void uAek2() {
        //2. Äquivalenzklasse
        //Testcase 21
        Assertions.assertEquals(error, transf.transformNumber(0));
        //Testcase 22
        Assertions.assertEquals(error, transf.transformNumber(-23453));
        //Testcase 23
        Assertions.assertEquals(error, transf.transformNumber(Integer.MIN_VALUE));
    }

    private void uAek3(){
        //4. Äquivalenzklasse
        //Testcase 24
        Assertions.assertEquals(error, transf.transformNumber(3001));
        //Testcase 25
        Assertions.assertEquals(error, transf.transformNumber(345632));
        //Testcase 26
        Assertions.assertEquals(error, transf.transformNumber(Integer.MAX_VALUE));

    }

    private void uAek4(){
        // 3. Äquivalenzklasse
        // Testcase 27
        // Assertions.assertEquals(NaN, transf.transformNumber(("ABC"));
    }
}
