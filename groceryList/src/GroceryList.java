import java.util.Scanner;

public class GroceryList {
    Scanner scanner = new Scanner(System.in);

    private GroceryItemOrder[] products = new GroceryItemOrder[10];
    private GroceryItemOrder[] totalProducts = new GroceryItemOrder[20];

    //Objekter af produkter som skal kunne lægges i indkøbslisten
    GroceryItemOrder product1 = new GroceryItemOrder("Æble", 10, 1, 1);
    GroceryItemOrder product2 = new GroceryItemOrder("Brød", 10,1,2);
    GroceryItemOrder product3 = new GroceryItemOrder("Æg",10,1,3);
    GroceryItemOrder product4 = new GroceryItemOrder("Æg",10,1,4);
    GroceryItemOrder product5 = new GroceryItemOrder("Æg",10,1,5);
    GroceryItemOrder product6 = new GroceryItemOrder("Æg",10,1,6);
    GroceryItemOrder product7 = new GroceryItemOrder("Æg",10,1,7);
    GroceryItemOrder product8 = new GroceryItemOrder("Æg",10,1,8);
    GroceryItemOrder product9 = new GroceryItemOrder("Æg",10,1,9);


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
        int i = 0;
        System.out.println("Indtast ID");
        int id = scanner.nextInt();
        System.out.println("Indtast mængde");
        int amount = scanner.nextInt();
        totalProducts[id-1].amount = amount;
        totalProducts[id-1] = products[i];
        i++;
    }
    public double getTotalCost(){ //skal regne priser på varer sammen
        double totalCost = 0;
        for (int i = 0; i < products.length; i++) {
            totalCost += products[i].price;

        }
        return totalCost;

    }
    // todo: lav metode til at give true hvis der er pladser tilbage på indkøbslisten (products)
}
