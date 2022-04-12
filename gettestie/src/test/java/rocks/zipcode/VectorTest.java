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
        //Given
        Vector<String> shapes = new Vector<>();
        //When
        shapes.add("Square");
        System.out.println(shapes.size()); //Should show only one added thus far.
        shapes.add("Triangle");
        shapes.add("Circle");
        Integer expected = 3;
        Integer actual = shapes.size();
        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testContains(){
        //Given
        Vector<String> shapes = new Vector<>();
        //When
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");

        //Then
        Assert.assertTrue(shapes.contains("Triangle"));


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
