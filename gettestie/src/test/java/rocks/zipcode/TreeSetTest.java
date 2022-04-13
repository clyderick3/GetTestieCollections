package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void addTreeSetTest(){
        //Given
        TreeSet<String> trees = new TreeSet<>();
        //When
        trees.add("Maple");
        Integer expected = 1;
        Integer actual = trees.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTreeSetTest(){
        //Given
        TreeSet<String> trees = new TreeSet<>();
        //When
        trees.add("Maple");
        trees.remove("Maple");
        Integer expected = 0;
        Integer actual = trees.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
