package lab_9;
import java.util.Random;
public class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** Generate a random character */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
    private static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0)
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0))
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }


    public static void main(String [] args)
    {
        RandomCharacter R =new RandomCharacter();
        Random rand = new Random();
        System.out.println("Lower Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(R.getRandomLowerCaseLetter() + " ");
        }
        System.out.println("\nUpper Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(R.getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\nDigit Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(R.getRandomDigitCharacter() + " ");
        }

        System.out.println("\nRandom Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(R.getRandomCharacter() + " ");
        }

        System.out.println("\nPrime Numbers: ");
        int num = 0;// generate a random number
        num = rand.nextInt(1000) + 1;

        while (!isPrime(num))
        {
            num = rand.nextInt(1000) + 1;
        }
        System.out.println(num);  // print the numbe
        }
    }