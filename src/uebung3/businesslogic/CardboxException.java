package uebung3.businesslogic;

public class CardboxException extends Exception{
    public CardboxException(int id){
        super("Das CardBox-Objekt mit der ID " + id +  " ist bereits vorhanden");
    }
}
