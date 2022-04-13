package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void addLinkedListTest(){
        //Given
        LinkedList<Integer> links = new LinkedList<>();
        //When
        links.add(0, 10);
        Integer expected = 1;
        Integer actual = links.size();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeLinkedListTest(){
        //Given
        LinkedList<Integer> links = new LinkedList<>();
        //When
        links.add(0, 10);
        links.remove(0);
        Integer expected = 0;
        Integer actual = links.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearLinkedListTest(){
        //Given
        LinkedList<Integer> links = new LinkedList<>();
        //When
        links.add(0, 10);
        links.add(1, 20);
        links.add(2, 30);
        links.clear();
        Integer expected = 0;
        Integer actual = links.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
