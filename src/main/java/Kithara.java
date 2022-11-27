public class Kithara extends Instrument implements IPlay{

    private String colour;

    public Kithara(String name, double costPrice, double sellPrice, String material, String type, String colour){
        super(name, costPrice, sellPrice, material, type);
        this.colour=colour;
    }

    public String getColour() {
        return colour;
    }

    public String playInstrument(){
        return "strum, strum, strum";
    }
}
