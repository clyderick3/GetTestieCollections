package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void addPriorityQueueTest() {
        //Given
        PriorityQueue<String> lines = new PriorityQueue<String>();
        //When
        lines.add("Person 1");
        lines.add("Person 2");
        Integer expected = 2;
        Integer actual = lines.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePriorityQueueTest() {
        //Given
        PriorityQueue<String> lines = new PriorityQueue<String>();
        //When
        lines.add("Person 1");
        lines.add("Person 2");
        //Person 2 was a fugitive that was caught.
        lines.remove("Person 2");
        Integer expected = 1;
        Integer actual = lines.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearPriorityQueueTest() {
        //Given
        PriorityQueue<String> lines = new PriorityQueue<String>();
        //When
        lines.add("Person 1");
        lines.add("Person 2");
        lines.clear();
        Integer expected = 0;
        Integer actual = lines.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
