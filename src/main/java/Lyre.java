public class Lyre extends Instrument implements IPlay{
    private int numberOfStrings;

    public Lyre(String name, double costPrice, double sellPrice, String material, String type, int numberOfStrings){
        super(name, costPrice, sellPrice, material, type);
        this.numberOfStrings=numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playInstrument(){
        return "pluck, pluck, pluck";
    }
}
