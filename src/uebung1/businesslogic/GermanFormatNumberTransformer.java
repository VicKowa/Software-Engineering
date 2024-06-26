package uebung1.businesslogic;

import java.text.DecimalFormat;

public class GermanFormatNumberTransformer extends GeneralTransformer {
    @Override
    public String transformNumber(int number) {
        if(checkNumeralRange(number)) {
            return getOutOfRangeErrorMsg();
        }
        DecimalFormat format = new DecimalFormat("#,###");
        return format.format(number);
    }

    @Override
    public String getTransformerType() {
        return "Transformer für deutsche Zahlenformatierungen";
    }
}
