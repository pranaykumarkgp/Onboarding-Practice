import static org.junit.Assert.assertEquals;

import java.util.Comparator;

import org.junit.Test;

public class ComparatorLambda {
    //Before
    Comparator<Integer> c1 = new Comparator<Integer>() {

        @Override
        public int compare(Integer x,Integer y) {
            return x.compareTo(y);

        }
        
    };

    //After
    Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
    
    @Test
        public void testCompare(Integer x,Integer y){
            assertEquals(0, c1.compare(60,45));
            assertEquals(-1, c1.compare(36,67));
            assertEquals(0, c1.compare(7,7));
            assertEquals(0, c2.compare(7,7));
        }
}
