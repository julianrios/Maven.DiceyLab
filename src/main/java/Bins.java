import java.util.HashMap;

public class Bins {
    private HashMap<Integer, Integer> bin;

    public Bins(Integer minRoll, Integer maxRoll) {
        this.bin = new HashMap<Integer, Integer>();

        makeBins(minRoll, maxRoll);
    }

    private void makeBins(Integer minRoll, Integer maxRoll) {
        for (int i = minRoll; i <= maxRoll; i++) {
            this.bin.put(i,0);
        }
    }


    public Integer getBinValue(Integer key) {
        return bin.get(key);
    }

    public void incrementBinValue(Integer key) {
        Integer oldValue = getBinValue(key);
        oldValue += 1;
        bin.put(key, oldValue);
    }

    public HashMap<Integer, Integer> getBin() {
        return bin;
    }
}
