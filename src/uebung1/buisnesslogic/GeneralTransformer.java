package uebung1.buisnesslogic;

public abstract class GeneralTransformer {
    protected boolean checkNumeralRange(int number) {
        return (number < 1 || number > 3000);
    }
    protected String getOutOfRangeErrorMsg() {
        return "Fehler: ungültiger Wertebereich";
    }
}
