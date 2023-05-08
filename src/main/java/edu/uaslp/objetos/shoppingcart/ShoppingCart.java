package edu.uaslp.objetos.shoppingcart;

import edu.uaslp.objetos.shoppingcart.exceptions.ItemNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShoppingCart {
    private final ShoppingItemCatalog shoppingItemCatalog;

    private ArrayList<String> list = new ArrayList<>();



    public ShoppingCart(ShoppingItemCatalog newCatalog){
        shoppingItemCatalog = newCatalog;
    }

    public int getTotalCostInCents(){
        int cont = 0;
        for (String i : list){
            ShoppingItem item = shoppingItemCatalog.getItem(i);
            cont = cont + item.getUnitCostInCents();
        }
        return cont;
    }

    public int getDistinctItemsCount(){
        ArrayList<String> list2 = new ArrayList<>();
        for (String i : list){
            if (!list2.contains(i)){
                list2.add(i);
            }
        }
        return list2.size();
    }

    public Collection<ShoppingItem> getDistinctItems() {
        Collection<ShoppingItem> newlist = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (String i : list){
            if (!list2.contains(i)){
                list2.add(i);
                newlist.add(shoppingItemCatalog.getItem(i));
            }
        }


        return newlist;
    }

    public int getTotalItemsCount(){
        return list.size();
    }

    public List<ShoppingItem> getItems(){
        List<ShoppingItem> newlist = new ArrayList<>();
        for (String i : list){
            ShoppingItem item = shoppingItemCatalog.getItem(i);
            newlist.add(item);
        }

        return newlist;
    }

    public void add(String code){
        if (shoppingItemCatalog.getItem(code) == null){
            throw new ItemNotFoundException(code);
        }
        list.add(code);
    }
}
