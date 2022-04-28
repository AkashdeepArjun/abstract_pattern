package home;

import javax.swing.ViewportLayout;

public class TestAbstactFactoryPattern {


    public static void main(String[] args){

        Restaurent vaishno_dhaba= ResturantFactory.getRestaurent(new VaishniDhabaFactory());
        Restaurent dolphin_hotel=ResturantFactory.getRestaurent(new DophinHotelFactory());
        int count=0;
        for(String items:vaishno_dhaba.getFoodMenu()){
    
            MyUtils.log("VAISHNO DHABA ITEM "+count, items);
            count++;
        }
        count=0;
        for(String items:dolphin_hotel.getFoodMenu()){
    
            MyUtils.log("HOTEL DOLPHIN ITEM "+count, items);
            count++;
        }

    }
    
   
}
