import java.util.Random;

public class Dice {

    private Integer numberOfDice;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {
        int sumTosses = 0;

        for (int i = 0; i < this.numberOfDice; i++) {
            Random rand = new Random();
            sumTosses += rand.nextInt(6) + 1;
        }
        return sumTosses;
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }
}
