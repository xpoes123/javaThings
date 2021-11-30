import java.util.Random;
import java.util.ArrayList;

public class evLinear {
    public static void main(String[] args) {
        int iter = 10000;
        double sum = 0;
        for (int k = 0; k < iter; k++) {
            ArrayList<Integer> cards = new ArrayList<Integer>(52);
            Random rand = new Random();
            for (int i = 1; i < 14; i++) {
                for (int j = 0; j < 4; j++) {
                    cards.add(i);
                }
            }
            int counter = 0;
            ArrayList<Integer> deck = new ArrayList<Integer>(52);
            for (int i = 0; i < 52; ++i) {
                int card = rand.nextInt(cards.size());
                deck.add(cards.get(card));
                cards.remove(card);
            }
            for (int i = 0; i < 51; i++) {
                if (deck.get(i) == deck.get(i + 1)) {
                    counter++;
                }
            }
            System.out.print("\n" + counter);
            sum += counter;
        }
        System.out.print("\n" + sum / iter);
    }
}
