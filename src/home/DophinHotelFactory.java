package home;

public class DophinHotelFactory implements RestaurentAbstractFactory {
    
    @Override
    public Restaurent createRestaurent() {
            return new DolphinHotel();
    }

}
