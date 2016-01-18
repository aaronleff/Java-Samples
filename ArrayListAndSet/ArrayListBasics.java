package ArrayListAndSet;
//For this assignment, we were supposed to create an ArrayList and a HashSet in any way we desired. 
//We needed to use at least 2 methods and also demonstrate at least one difference between the 
//two data structures.

import java.util.ArrayList;
import java.util.List;


public class ArrayListBasics {
    public static void main(String args[]) {
        CD cd1 = new CD(1, "The Kinks", "Something Else");
        CD cd2 = new CD(2, "Sam Cooke", "Ain't That Good News");
        CD cd3 = new CD(3, "The Velvet Underground", "White Light, White Heat");
        CD cd4 = new CD(4, "Pavement", "Crooked Rain, Crooked Rain");
        CD cd5 = new CD(5, "Pavement", "Slanted and Enchanted");
        CD cd6 = new CD(6, "Nicki Minaj", "The Pinkprint");
      
        

        List<CD> cdCollection = new ArrayList<>();
        

        cdCollection.add(cd1);
        cdCollection.add(cd2);
        cdCollection.add(cd3);
        cdCollection.add(cd4);

        System.out.println("This is my current CD collection, sorted as an ArrayList:");
        for (CD cd : cdCollection) {
            System.out.println(cd);
        }
        
        cdCollection.remove(cd1);
        cdCollection.remove(cd4);
        cdCollection.add(cd5);
        cdCollection.add(cd6);
        cdCollection.add(cd1);
        cdCollection.add(cd1);
        
        System.out.println();
        System.out.println("I lost two CD's but purchased two more.  I also purchased two copies of one of the "
        		+ "lost albums. This is what my CD collection now looks like:");
        for (CD cd : cdCollection) {
            System.out.println(cd);

        }
    }
}