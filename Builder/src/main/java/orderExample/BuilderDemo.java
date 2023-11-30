package orderExample;

import java.io.IOException;

/**
 *
 * @author Ashwani
 */
public class BuilderDemo {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        OrderBuilder builder=new OrderBuilder();
        
        OrderedItems orderedItems=builder.preparePizza();
        
        orderedItems.showItems();
        
        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
        
    }
}
