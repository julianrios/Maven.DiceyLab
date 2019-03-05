import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void tossAndSumTest() {
        // given
        Dice dice = new Dice(2);
        Integer total = dice.tossAndSum();
        // when
        boolean expected = total >= 0 && total <= 12;
        // then
        System.out.println(total);
        Assert.assertTrue(expected);
    }

    @Test
    public void tossAndSumTest2() {
        // given
        Dice dice = new Dice(1);
        Integer total = dice.tossAndSum();
        // when
        boolean expected = total != 0 && total < 13;
        // then
        System.out.println(total);
        Assert.assertTrue(expected);
    }

    @Test
    public void getNumberOfDiceTest() {
        // Given
        Dice dice = new Dice(2);
        Integer expected = 2;
        Integer actual =  dice.getNumberOfDice();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
