package lab_9;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.RepeatedTest;

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
    @RepeatedTest(15)
    void TestPrimeNumber(){
        int num = RandomCharacter.getRandomDigitCharacter();
        boolean testcase = false;
        System.out.print(num);
        if(num == 0 || num == 1)
        {
            System.out.print(" is not a prime");
            assertTrue(false);
        }

        for(int i = 2; i <= (num/2); i++)
        {
            if(randomchracter.isPrime(num))
            {
                testcase = true;
                System.out.print(" is not a prime");
                break;
            }
        }
        if(!randomchracter.isPrime(num))
        {
            System.out.print(" is a prime");
        }
        assertFalse(testcase);
    }
}