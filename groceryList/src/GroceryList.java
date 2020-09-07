import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    UI ui = new UI();

    private GroceryItemOrder[] products = new GroceryItemOrder[10]; // array til varer på indkøbsliste
    private GroceryItemOrder[] productCatalog = new GroceryItemOrder[9]; // array til katalog af tilgængelige varer

    //Objekter af produkter som skal kunne lægges i indkøbslisten
    GroceryItemOrder product1 = new GroceryItemOrder("Frugt", 10, 1, 1);
    GroceryItemOrder product2 = new GroceryItemOrder("Brød", 10,1,2);
    GroceryItemOrder product3 = new GroceryItemOrder("Müsli",20,1,3);
    GroceryItemOrder product4 = new GroceryItemOrder("Mælk",10,1,4);
    GroceryItemOrder product5 = new GroceryItemOrder("Juice",10,1,5);
    GroceryItemOrder product6 = new GroceryItemOrder("Baguette",10,1,6);
    GroceryItemOrder product7 = new GroceryItemOrder("Rødvin",200,1,7);
    GroceryItemOrder product8 = new GroceryItemOrder("Napoleonshatte",10,1,8);
    GroceryItemOrder product9 = new GroceryItemOrder("Snegle",20,1,9);


    public void setProductCatalog(){ // Constructor der fylder kataloget med varer
        productCatalog[0] = product1;
        productCatalog[1] = product2;
        productCatalog[2] = product3;
        productCatalog[3] = product4;
        productCatalog[4] = product5;
        productCatalog[5] = product6;
        productCatalog[6] = product7;
        productCatalog[7] = product8;
        productCatalog[8] = product9;
    }

    //Metode til at vælge et objekt ud fra id der skal tilføjes liste array
    public void addGroceryToList(){
        int i = 0; // i = pladsen i listens array
        if (!arrayCheckIfFull()){
            System.out.println("Der er ikke plads til mere på indkøbslisten!");
            return;
        }
        System.out.println("Indtast ID");
        int id = ui.scanInt() -1; // -1 tager højde for at array starter på 0
        System.out.println("Indtast mængde");
        int amount = ui.scanInt();
        products[i] = productCatalog[id]; // tager valgte objekt fra vare array plads og kloner den til liste array
        products[id].setAmount(amount); // ændrer mængde, hvorfor ændrer der productCatalog og ikke kun products????
        i++;
    }
    public double getTotalCost() { //skal regne priser på varer sammen - metoden er gjort overflødig med toStringList
        double totalCost = 0;
        for (int i = 0; i < products.length; i++) {
            totalCost += products[i].getPrice();

        }
        return totalCost;
    }

        public boolean arrayCheckIfFull() { // loop til at finde tomme pladser på indkøbslisten
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return true;
            }
        }
     return false;
    }

    public String toStringList() { // begge toString burde have metode til at finde null objekter
        String returnString = "";
        for (int i = 0; i < products.length; i++) {
            if (!(products[i] == null))
            returnString = returnString + "ID: " + products[i].getId() + " - " + products[i].getName() + " - amount: " + products[i].getAmount() + "  -  " + products[i].getPrice()*products[i].getAmount() + "KR.\n";

        }
        return returnString;
    }

    @Override
    public String toString() {
        String returnString = "";
        for (int i = 0; i < productCatalog.length; i++) {
            returnString = returnString + "ID: " + productCatalog[i].getId() + " - " + productCatalog[i].getName() + " - " + productCatalog[i].getPrice() + " KR.\n";
        }
        return returnString;
    }
}
