import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {

        // instantiation to generate Random number
        Random rnd = new Random();

        // notify user what you are going to show
        System.out.println("Generate 10 random integers between 1 and 6.");

        // for loop to display ten random number results
        for (int i = 1; i <= 10; ++i)
        {
            System.out.print(1 + rnd.nextInt(6) + " ");
        }
    }
}
