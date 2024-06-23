package uebung8;

public class Adapter {

  private ReiseAnbieter anb;

  public Adapter(ReiseAnbieter anb) {
    this.anb = anb;
  }

  private QueryObject transformInput(SuchAuftrag auf) {
    // transformation is going on here
    return null;
  }

  private SuchErgebnis transformOutput(QueryResult res) {
    // transformation is going on here
    return null;
  }

  public SuchErgebnis sucheHotel(SuchAuftrag auf) {

    QueryObject ob = transformInput(auf);

    QueryResult res = anb.runQuery(ob);

    return transformOutput(res);
  }

}
class SuchAuftrag {
//  private String ort;
//  private int preis;
//  private int sterne;
//  private int personen;
//  private Date anreise;
//  private Date abreise;
}

interface ReiseAnbieter {
  QueryResult runQuery(QueryObject ob);
}

class QueryResult {
}

class QueryObject {
}

class SuchErgebnis {
}