import java.util.Scanner;

public class GroceryList {
    Scanner scanner = new Scanner(System.in);

    private GroceryItemOrder[] products = new GroceryItemOrder[10];
    private GroceryItemOrder[] totalProducts = new GroceryItemOrder[20];

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


    public void setTotalProducts(){
        totalProducts[0] = product1;
        totalProducts[1] = product2;
        totalProducts[2] = product3;
        totalProducts[3] = product4;
        totalProducts[4] = product5;
        totalProducts[5] = product6;
        totalProducts[6] = product7;
        totalProducts[7] = product8;
        totalProducts[8] = product9;
    }

    //Metode til at vælge et objekt ud fra id der skal tilføjes liste array
    public void addGroceryToList(){
        int i = 0; // i = pladsen i listens array
        if (arrayCheckIfFull()){
            System.out.println("Der er ikke plads til mere på indkøbslisten!");
            return;
        }
        System.out.println("Indtast ID");
        int id = scanner.nextInt() -1; // -1 tager højde for at array starter på 0
        System.out.println("Indtast mængde");
        int amount = scanner.nextInt();
        amount = totalProducts[id-1].getAmount();
        totalProducts[id].setAmount(amount); // ændrer mængde
        products[i] = totalProducts[id]; // tager valgte objekt fra vare array plads og kloner den til liste array
        i++;
    }

    public double getTotalCost(){ //skal regne priser på varer sammen
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

}
