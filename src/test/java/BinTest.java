import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    @Test
    public void incrementBinValueTest() {
        // Given
        Bins bin = new Bins(2,12);
        bin.incrementBinValue(2);
        bin.incrementBinValue(2);
        Integer expected = 2;
        // When
        Integer actual = bin.getBinValue(2);
        System.out.println(actual);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinValueTest2() {
        // Given
        Bins bin = new Bins(2,12);
        bin.incrementBinValue(2);
        Integer expected = 1;
        // When
        Integer actual = bin.getBinValue(2);
        System.out.println(actual);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinValueTest3() {
        // Given
        Bins bin = new Bins(2,12);
        bin.incrementBinValue(12);
        Integer expected = 1;
        // When
        Integer actual = bin.getBinValue(12);
        System.out.println(actual);
        // Then
        Assert.assertEquals(expected, actual);
    }


}
