package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class HashSetTest {
    Set<String> setString = new HashSet<>();


    @Test
    public void testSize(){
        //Given
        String add = "Add this.";
        Integer expected = 1;
        //When
        setString.add(add);
        //Then
        assertTrue(expected == setString.size());
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
        //Given
        String add = "Add this.";
        Integer expected = 0;
        //When
        setString.add(add);
        setString.remove(add);
        //Then
        assertTrue(expected == setString.size());

    }

    @Test
    public void testClear(){
        //Given
        String add = "Add this.";
        Integer expected = 0;
        //When
        setString.add(add);
        setString.clear();
        //Then
        assertTrue(expected == setString.size());

    }

    @Test
    public void testIsEmpty(){
        assertTrue(setString.isEmpty());

    }

}
