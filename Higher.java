import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Higher{
    public static int higher(int a,int b){
        if(a>b)
            return a;
        return b;
        
    }
    @Test 
    public void testHigher(int x,int y){
        assertEquals(25,higher(25,10));
        assertEquals(5,higher(5,3));
}
}

