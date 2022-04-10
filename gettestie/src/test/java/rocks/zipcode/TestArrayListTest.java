package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

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
        Integer[] expected = {2, 3, 4, 5, 6};
        TestArrayList<Integer[]> list = new TestArrayList();
        //When
        Integer[] actual = list.getList().remove(0);
        //Then
        Assert.assertNotEquals(expected, actual);
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
