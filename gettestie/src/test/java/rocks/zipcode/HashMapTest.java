package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    @Test
    public void addHashMapTest(){
        //Given
        Map<String, String> hashMap = new HashMap();
        Integer expected = 1;
        //When
        hashMap.put("Mike","Jones");
        Integer actual = hashMap.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeHashMapTest(){
        //Given
        Map<String, String> hashMap = new HashMap();
        Integer expected = 0;
        //When
        hashMap.put("Mike","Jones");
        hashMap.remove("Mike");
        Integer actual = hashMap.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearHashMapTest(){
        //Given
        Map<String, String> hashMap = new HashMap();
        Integer expected = 0;
        //When
        hashMap.put("Mike","Jones");
        hashMap.put("Michael", "Jordan");
        hashMap.clear();
        Integer actual = hashMap.size();
        //Then
        Assert.assertEquals(expected,actual);
    }
}
