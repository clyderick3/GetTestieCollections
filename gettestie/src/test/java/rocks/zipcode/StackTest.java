package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void addStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        Integer expected = 3;
        Integer actual = alphabet.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.remove(1);
        Integer expected = 2;
        Integer actual = alphabet.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.clear();
        Integer expected = 0;
        Integer actual = alphabet.size();
        //Then
        Assert.assertEquals(expected,actual);
    }
}
