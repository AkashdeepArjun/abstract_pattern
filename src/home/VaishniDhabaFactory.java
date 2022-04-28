package home;

public class VaishniDhabaFactory implements RestaurentAbstractFactory{
    @Override
    public Restaurent createRestaurent() {
        
        return new VaishnoDhaba();
    }
}
