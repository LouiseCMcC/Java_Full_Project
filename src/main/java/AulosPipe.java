public class AulosPipe extends NonInstrumentItem implements IPlay{

    public AulosPipe(String description, double costPrice, double sellPrice){
        super(description, costPrice, sellPrice);
    }
    public String playInstrument(){
        return "test play";
    }
}
