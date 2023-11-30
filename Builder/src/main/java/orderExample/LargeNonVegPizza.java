package orderExample;

/**
 *
 * @author Ashwani
 */
public class LargeNonVegPizza extends NonVegPizza {
    
    @Override
    public float price() {
        return 220.0f;
    }

    @Override
    public String name() {
       return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Large Size";
    }
    
}
