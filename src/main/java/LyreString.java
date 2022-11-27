public class LyreString extends NonInstrumentItem implements IPlay{

    private LyreString pattern;

    public LyreString(String description, double costPrice, double sellPrice){
        super(description, costPrice, sellPrice);
    }

    public String playInstrument(){
        return "test play";
    }
}
