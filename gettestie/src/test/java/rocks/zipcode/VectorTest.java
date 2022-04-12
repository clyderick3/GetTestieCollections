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
        //Given
        Vector<String> shapes = new Vector<>();
        //When
        shapes.add("Square");
        shapes.remove("Square");
        shapes.add("Circle");
        Integer expected = 1;
        Integer actual = shapes.size();
        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testClear(){
        //Given
        Vector<String> shapes = new Vector<>();
        //When
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");
        shapes.clear();
        Integer expected = 0;
        Integer actual = shapes.size();
        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testIsEmpty(){
        //Given
        Vector<String> shapes = new Vector<>();
        //When Checking on the test.
        Assert.assertTrue(shapes.isEmpty());

    }
}
