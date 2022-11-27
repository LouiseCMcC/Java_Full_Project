public class KitharaString extends NonInstrumentItem implements IPlay{

    public KitharaString(String description, double costPrice, double sellPrice){
        super(description, costPrice, sellPrice);
    }

    public String playInstrument(){
        return "test play";
    }
}