import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> itemsList = new ArrayList<>();
    itemsList.add("rugbrød");
    itemsList.add("karrysild");
    itemsList.add("remoulade");
    itemsList.add("schnaps");
    itemsList.add("aquavit");
    itemsList.add("lakrids");
    itemsList.add("kartoffler");
    itemsList.add("mayonnaise");
    itemsList.add("rejer");
    itemsList.add("øl");

if(itemsList.size() >10){
        System.out.println("listen må ikke indeholde mere end 10 dimser ad gangen..." + itemsList);

    }
}
