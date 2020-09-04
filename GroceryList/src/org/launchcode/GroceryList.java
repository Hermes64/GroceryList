import java.util.Scanner;

public class GroceryList {
    Scanner scanner = new Scanner(System.in);

    private GroceryItemOrder[] products = new GroceryItemOrder[10];
    private GroceryItemOrder[] totalProducts = new GroceryItemOrder[20];

    //Objekter af produkter som skal kunne lægges i indkøbslisten
    GroceryItemOrder product1 = new GroceryItemOrder("Æble",5,1);
    GroceryItemOrder product2 = new GroceryItemOrder("Brød",10,2);
    GroceryItemOrder product3 = new GroceryItemOrder("rugbrød",15,3);
    GroceryItemOrder product4 = new GroceryItemOrder(" flaske øl",8,3);
    GroceryItemOrder product5 = new GroceryItemOrder("lakrids",10,3);
    GroceryItemOrder product6 = new GroceryItemOrder("Sild",10,3);
    GroceryItemOrder product7 = new GroceryItemOrder("kilo kartoffler",10,3);
    GroceryItemOrder product8 = new GroceryItemOrder("Æg",10,3);
    GroceryItemOrder product9 = new GroceryItemOrder("Æg",10,3);


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
        int id = scanner.nextInt();
        totalProducts[id+1] = products[i];
        i++;



    }




}
