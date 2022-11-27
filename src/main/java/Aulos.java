public class Aulos extends Instrument implements IPlay{

    private String previousOwner;

    public Aulos(String name, double costPrice, double sellPrice, String material, String type, String previousOwner){
        super(name, costPrice, sellPrice, material, type);
        this.previousOwner=previousOwner;
    }

    public String getPreviousOwner() {
        return previousOwner;
    }

    public String playInstrument(){
        return "blow, blow, blow";
    }
}