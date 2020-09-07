public class GroceryItemOrder {
    private String name;
    private double price;
    private int amount;
    private int id;

    public GroceryItemOrder(String name, double price, int amount, int id) { // Constructor
        this.price = price;
        this.name = name;
        this.id = id;
        this.amount = amount;
    }


    public double getPrice() { // returnerer pris for mængden af en vare
        return price;
    }


    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount; // fix så det kun er indkøbslisten der sættes og ikke kataloget
    }
    public int getId() {
        return id;
    }
}
