public abstract class Instrument {
    private String name;
    private double costPrice;
    private double sellPrice;
    private String material;

    private String type;

    public Instrument(String name, double costPrice, double sellPrice, String material, String type){
        this.name=name;
        this.costPrice=costPrice;
        this.sellPrice=sellPrice;
        this.material=material;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
