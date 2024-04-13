package uebung1.test;

import org.junit.jupiter.api.Test;
import uebung1.buisnesslogic.GermanFormatNumberTransformer;

class TestRomanNumberTransformer {

    @Test
    void TestRomanNumbers() {
        //
        GermanFormatNumberTransformer ger = new GermanFormatNumberTransformer();
        String res = ger.transformNumber(1234);
        System.out.println(res);
    }
}
