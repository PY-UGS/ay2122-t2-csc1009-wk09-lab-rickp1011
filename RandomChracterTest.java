package lab_9;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.Random;

public class RandomChracterTest
{
    RandomCharacter randomchracter;
    @Before
    public void setup()
    {
        randomchracter=new RandomCharacter();


    }
    @Test
    public void testgetRandomLowerCaseLetter()
    {
        char output = randomchracter.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
    }
    @Test
    public void testgetRandomUpperCaseLetter()
    {
        char output = randomchracter.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
    }
    @Test
    public void testgetRandomDigitCharacter()
    {
        char output = randomchracter.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
    }
    @Test
    public void testgetRandomCharacter()
    {
        char output = randomchracter.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
    }
    @Test
    public void testisprime()
    {
        assertTrue(randomchracter.isPrime(3));
        assertFalse(randomchracter.isPrime(4));

    }
}