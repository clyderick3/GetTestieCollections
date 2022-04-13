package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void addTreeMapTest(){
        //Given
        TreeMap<Integer, String> tinder = new TreeMap<>();
        //When
        tinder.put(1, "Kiss");
        tinder.put(2, "Hug");
        tinder.put(3, "High Five.");
        Integer expected = 3;
        Integer actual = tinder.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTreeMapTest(){
        //Given
        TreeMap<Integer, String> tinder = new TreeMap<>();
        //When
        tinder.put(1, "Kiss");
        tinder.put(2, "Hug");
        tinder.remove(2);
        Integer expected = 2;
        Integer actual = tinder.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTreeMapTest(){
        //Given
        TreeMap<Integer, String> tinder = new TreeMap<>();
        //When
        tinder.put(1, "Kiss");
        tinder.put(2, "Hug");
        tinder.put(3, "High Five.");
        tinder.put(4, "Rub");
        Integer expected = 4;
        Integer actual = tinder.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTreeMapTest(){
        //Given
        TreeMap<Integer, String> tinder = new TreeMap<>();
        //When
        tinder.put(1, "Kiss");
        tinder.put(2, "Hug");
        tinder.put(3, "High Five.");
        boolean isPresent = tinder.containsValue("Kiss");
        //Then
        Assert.assertTrue(isPresent);
    }

    @Test
    public void addTreeMapTest(){
        //Given
        TreeMap<Integer, String> tinder = new TreeMap<>();
        //When
        tinder.put(1, "Kiss");
        tinder.put(2, "Hug");
        tinder.put(3, "High Five.");
        Integer expected = 3;
        Integer actual = tinder.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
