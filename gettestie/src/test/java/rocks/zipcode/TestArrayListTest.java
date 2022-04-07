package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestArrayListTest {

    @Test
    public void TestArraySizeTest(){
        //Given
        Integer[] list = {1, 2, 3, 4, 5};
        TestArrayList<Integer> instance = new TestArrayList<Integer>();
        //When
        instance.initList(list);
        //Then
        Assert.assertTrue(instance.getList().size() == 5);
    }
}
