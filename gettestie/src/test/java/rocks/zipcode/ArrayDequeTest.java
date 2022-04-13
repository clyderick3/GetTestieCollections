package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    @Test
    public void addArrayDequeTest(){
        //Given
        ArrayDeque<String> cards = new ArrayDeque<>();
        //When
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        Integer expected = 3;
        Integer actual = cards.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeArrayDequeTest(){
        //Given
        ArrayDeque<String> cards = new ArrayDeque<>();
        //When
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.remove("Jack");
        Integer expected = 2;
        Integer actual = cards.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeArrayDequeTest(){
        //Given
        ArrayDeque<String> cards = new ArrayDeque<>();
        //When
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.add("10");
        Integer expected = 4;
        Integer actual = cards.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearArrayDequeTest(){
        //Given
        ArrayDeque<String> cards = new ArrayDeque<>();
        //When
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.clear();
        Integer expected = 0;
        Integer actual = cards.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsArrayDequeTest(){
        //Given
        ArrayDeque<String> cards = new ArrayDeque<>();
        //When
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        boolean check = cards.contains("Ace");
        //Then
        Assert.assertFalse(check);
    }
}
