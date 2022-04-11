package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class HashSetTest {
    Set<String> setString = new HashSet<>();


    @Before
    public void initialize(){

    }

    @Test
    public void testSize(){

    }

    @Test
    public void testAdd(){
        //Given
        String add = "Add this.";
        Integer expected = 1;
        //When
        setString.add(add);
        //Then
        assertTrue(expected == setString.size());

    }

    @Test
    public void testContains(){
        //Given
        String add = "Add this.";
        String expected = "Add this.";
        //When
        setString.add(add);
        //Then
        assertTrue(setString.contains(expected));

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
