package home;

import java.util.ArrayList;
import java.util.List;

public class DolphinHotel extends Restaurent{

    private final List<String> food_menu=new ArrayList<String>();
    public DolphinHotel(){

        food_menu.add("Egg fries");
        food_menu.add("Vodka");
        food_menu.add("Chicken Biryani");
        food_menu.add("Wine");
        food_menu.add("Bear");
    }
    @Override
    public List<String> getFoodMenu() {
        
        return this.food_menu;
    }
}
