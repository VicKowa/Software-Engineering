package uebung1.client;

import uebung1.buisnesslogic.TransformerFactory; 

public class Client {

    public void printTransformation(int number) {
        String result = TransformerFactory.getRomanNumberTransformer().transformNumber(number);
        System.out.println("Die römische Schreibweise der Zahl " + number + " ist: " + result);
    }
}
