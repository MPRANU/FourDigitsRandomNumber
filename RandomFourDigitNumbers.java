import java.util.Random;

public class RandomFourDigitNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Rnadom Numbers:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = 1000 + random.nextInt(9000); 
            System.out.println(randomNumber);
        }
    }
}
