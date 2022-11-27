public abstract class NonInstrumentItem {

    private String description;
    private double costPrice;
    private double sellPrice;

    public NonInstrumentItem(String description, double costPrice, double sellPrice){
        this.description=description;
        this.costPrice=costPrice;
        this.sellPrice=sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
