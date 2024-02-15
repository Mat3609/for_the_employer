package binance_api.pojo;

public class TickersShort {
private String name;
private String price;


public TickersShort(String name, String price) {
    this.name = name;
    this.price = price;
}

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
