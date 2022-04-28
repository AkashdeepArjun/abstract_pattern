package home;

public class ResturantFactory {

    public static Restaurent getRestaurent(RestaurentAbstractFactory factory){
        return factory.createRestaurent();
    }
    
}
