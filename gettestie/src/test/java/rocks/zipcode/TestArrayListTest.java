package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListTest {

    @Test
    public void addListTest(){
        //Given
        Integer[] list = {1, 2, 3, 4, 5};
        TestArrayList<Integer> instance = new TestArrayList<Integer>();
        //When
        instance.addList(list);
        //Then
        Assert.assertTrue(instance.getList().size() == 5);
    }

    @Test
    public void getArrayListTest(){
        //Given
        Integer expected = 3;
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        //When
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeListTest(){
        //Given
        Integer expected = 2;
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        //When
        list.remove(1);
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearListTest(){
        //Given
        Integer expected = 0;
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        //When
        list.clear();
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSizeOfListTest(){
        //Given
        Integer[] list = {1, 2, 3, 4, 5};
        Integer expected = 5;
        TestArrayList<Integer> instance = new TestArrayList<Integer>();
        //When
        instance.getSizeOfList(list);
        Integer actual = list.length;
        //Then
        Assert.assertEquals(expected, actual);
    }
}
