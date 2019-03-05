
import java.util.Map;
import java.util.Set;

public class Simulation {
        private Dice dice;
        private Bins bins;
        private Integer numberOfTimesTossed;

    public Simulation(Integer numberOfDiceThrown, Integer numberOfTimesTossed) {
        this.dice = new Dice(numberOfDiceThrown);
        this.bins = new Bins(2, 12);
        this.numberOfTimesTossed = numberOfTimesTossed;

        run(numberOfTimesTossed);
        printResults();
    }

    private void run(Integer numberOfTimesTossed) {
        for(Integer i =0; i < numberOfTimesTossed; i++) {
            binSort(this.dice.tossAndSum());
        }
    }

    public Integer binSort(Integer result) {
        Set<Map.Entry<Integer, Integer>> entries = bins.getBin().entrySet();

        for(Map.Entry<Integer, Integer> entry :entries) {
            if(entry.getKey().equals(result)) {
                bins.incrementBinValue(entry.getKey());
            }
        }
        return -1;
    }

    public void printResults() {
        Set<Map.Entry<Integer, Integer>> entries = bins.getBin().entrySet();

        for(Map.Entry<Integer, Integer> entry : entries) {
            Double probability = probability(entry);
            String starsToPrint = printStars(probability);
            String format = String.format("%2d: %8d : %.2f %s",entry.getKey(), entry.getValue(), probability, starsToPrint);
            System.out.println(format);
        }
    }

    private String printStars(Double probability) {
        Double numberOfStars = probability * 100;
        String starsToPrint = "";
        for(int i = 0; i < numberOfStars; i++) {
            starsToPrint += "*";
        }
        return starsToPrint;
    }


    private Double probability(Map.Entry<Integer, Integer> entry) {
        return entry.getValue() / this.numberOfTimesTossed.doubleValue();
    }


    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
    }
}
