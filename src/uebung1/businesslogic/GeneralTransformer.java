package uebung1.businesslogic;

public abstract class GeneralTransformer implements NumberTransformer {
    protected boolean checkNumeralRange(int number) {
        return (number < 1 || number > 3000);
    }
    protected String getOutOfRangeErrorMsg() {
        return "Fehler: ungültiger Wertebereich";
    }

    public abstract String transformNumber(int number);
    public abstract String getTransformerType();
}
