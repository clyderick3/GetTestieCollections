package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertTrue;

public class VectorTest {


    @Test
    public void testVectorSize(){
        //Given
        Vector<String> shapes = new Vector<>();
        //When
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");
        Integer expected = 3;
        Integer actual = shapes.size();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testVectorAdd(){


    }

    @Test
    public void testContains(){


    }

    @Test
    public void testRemove(){


    }

    @Test
    public void testClear(){


    }

    @Test
    public void testIsEmpty(){

    }
}
