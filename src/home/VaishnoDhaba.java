package home;

import java.util.ArrayList;
import java.util.List;

public class VaishnoDhaba  extends Restaurent{

    private final  List<String> food_menu=new ArrayList<String>();

    public VaishnoDhaba(){

        food_menu.add("Dal Makhni");
        food_menu.add("Chpaati");
        food_menu.add("tea adrak wali");
        food_menu.add("green tea");

    }



    @Override
    public List<String> getFoodMenu() {
        
        return this.food_menu;
    }
}
