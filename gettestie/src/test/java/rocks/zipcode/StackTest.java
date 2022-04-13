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

    @Test
    public void sizeStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        Integer expected = 5;
        Integer actual = alphabet.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        Boolean isPresent = alphabet.contains('c');
        //Then
        Assert.assertTrue(isPresent);
    }

    @Test
    public void popStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.clear();
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        alphabet.pop();
        Character expected = 'y';
        Character actual = alphabet.pop();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void peekStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.clear();
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        alphabet.peek();
        Character expected = 'z';
        Character actual = alphabet.peek();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pushStackTest(){
        //Given
        Stack<Character> alphabet = new Stack<>();
        //When
        alphabet.add('a');
        alphabet.add('b');
        alphabet.clear();
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        alphabet.push('y');
        Character expected = 'y';
        Character actual = alphabet.push('y');
        //Then
        Assert.assertEquals(expected,actual);
    }


}
