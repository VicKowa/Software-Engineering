package uebung1.buisnesslogic;

public class TransformerFactory {
    
    public static RomanNumberTransformer getRomanNumberTransformer(){
        return new RomanNumberTransformer();
    }

    public static GermanFormatNumberTransformer getGermanFormatNumberTransformer(){
        return new GermanFormatNumberTransformer();
    }
}
