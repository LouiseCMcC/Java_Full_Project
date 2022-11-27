public class AulosBag extends NonInstrumentItem implements IPlay{

    private String pattern;

    public AulosBag(String description, double costPrice, double sellPrice, String pattern){
        super(description, costPrice, sellPrice);
        this.pattern=pattern;
    }


    public String getPattern() {
        return pattern;
    }

    public String playInstrument(){
        return "test play";
    }
}
