import java.util.ArrayList;

public class Shop {

    private ArrayList<Stock>instruments;
    private ArrayList<Stock>nonInstrumentItems;

    public Shop(){
        this.instruments=new ArrayList<>();
        this.nonInstrumentItems=new ArrayList<>();
    }

    public void addStock(Stock stock){
        this.instruments.add(stock);
    }

    public int checkStock(){
        return this.instruments.size();
    }

    public void removeStock(Stock stock){
        this.instruments.remove(stock);
    }
}
